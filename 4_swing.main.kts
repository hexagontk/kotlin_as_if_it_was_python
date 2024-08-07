#!/usr/bin/env kotlin

/*
 * 4. SWING INTERFACES
 */
@file:DependsOn("com.formdev:flatlaf:3.5.1")

import com.formdev.flatlaf.FlatDarculaLaf

import java.io.File
import java.nio.file.Path
import java.nio.file.Paths
import javax.swing.*
import javax.swing.WindowConstants.EXIT_ON_CLOSE

/*
 * To display Swing applications, you have to disable the headless mode
 */
System.setProperty("java.awt.headless", "false")

UIManager.setLookAndFeel(FlatDarculaLaf())

val currentPath: Path = Paths.get("").toRealPath()
val displayedFiles: Array<File> = currentPath.toFile().listFiles() ?: emptyArray()

JFrame("Mini Directory Browser").apply {
    add(
        JScrollPane(
            JList(
                DefaultListModel<String>().apply {
                    addAll(displayedFiles.map(File::getName))
                }
            )
        )
    )

    defaultCloseOperation = EXIT_ON_CLOSE
    isVisible = true
    pack()
}

/*
 * If you don't want to print anything as the script's result, return Unit. If not, last evaluated
 * expression will also be printed (in this case, JFrame's toString)
 */
Unit
