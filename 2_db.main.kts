#!/usr/bin/env kotlin

/*
 * 2. LIBRARIES (I.E.: JDBC) - DB Utilities for loading, converting or reporting data
 *
 * Dependencies are declared using the '<groupId>:<artifactId>:<version>' format
 *
 * They are fetched from Maven Central and Maven local repositories
 *
 * You can add extra repositories with the '@file:Repository' annotation
 */
@file:DependsOn("com.h2database:h2:2.3.232")

import java.nio.file.Path
import java.nio.file.Paths
import java.sql.Connection
import java.sql.DriverManager.getConnection
import java.sql.ResultSet
import kotlin.io.path.name

val currentPath: Path = Paths.get("").toRealPath()
val databaseDir: Path = currentPath.resolve("out")

fun Connection.update(statement: String): Int =
    createStatement().executeUpdate(statement.trimIndent())

fun Connection.query(statement: String): ResultSet =
    createStatement().executeQuery(statement.trimIndent())

getConnection("jdbc:h2:./${databaseDir.name}/files", "sa", "").use { c ->
    c.update("create table if not exists files(name varchar2, extension varchar2, size int)")
    c.update("delete from files")

    currentPath
        .toFile()
        .listFiles()
        ?.forEach { file ->
            val name = file.name
            val extension = file.extension
            val length = file.length()
            c.update("insert into files values('$name', '$extension', $length)")
        }

    val files = c.query("select * from files order by extension, name, size")
    while (files.next()) {
        val name = files.getString(1)
        val extension = files.getString(2)
        val length = files.getInt(3)
        println("$name ($extension) - $length")
    }
}
