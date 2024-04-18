#!/usr/bin/env kotlin

/*
 * 5. ARGUMENT PASSING - Start a server (useful for mocking dependencies)
 */
@file:DependsOn("com.hexagonkt:http_server_netty:3.5.3")
@file:DependsOn("com.hexagonkt:serialization_jackson_json:3.5.3")

import com.hexagonkt.http.server.netty.serve
import com.hexagonkt.core.logging.logger
import com.hexagonkt.core.media.TEXT_PLAIN
import com.hexagonkt.http.model.ContentType
import com.hexagonkt.http.server.callbacks.FileCallback

import java.nio.file.Path
import java.nio.file.Paths
import kotlin.system.exitProcess

/*
 * You can access command line arguments using the 'args' variable
 */
val servedDir = args.firstOrNull() ?: ""
val servedPath: Path = Paths.get("").toRealPath().resolve(servedDir)

logger.info { "Served path: $servedPath" }

serve {
    get("/dir/*", FileCallback(servedPath.toFile()))

    get("/hello/{name}") {
        val name = pathParameters["name"]

        ok("Hello, $name!", contentType = ContentType(TEXT_PLAIN))
    }

    post("/STOP") {
        exitProcess(0)
    }
}

/*
 * If your code creates non daemon threads, the script won't exit automatically at the end
 */
logger.info { "SCRIPT STARTED" }
