#!/usr/bin/env kotlin

/*
 * 6. CUSTOMIZING COMPILATION - Calling REST services
 *
 * Optional compiler options
 *
 * They could improve start time by compiling without optimizations, etc.
 */
@file:CompilerOptions("-jvm-target", "17")
@file:DependsOn("com.hexagonkt:http_client_jetty:3.6.1")
@file:DependsOn("com.hexagonkt:serialization_jackson_json:3.6.1")

import com.hexagonkt.http.client.jetty.JettyClientAdapter
import com.hexagonkt.http.client.*
import com.hexagonkt.core.logging.*
import com.hexagonkt.core.urlOf

val settings = HttpClientSettings(urlOf("http://localhost:2010"))
val http = HttpClient(JettyClientAdapter(), settings)

http.start()

http.get("/dir/README.md").apply {
    contentType.info("CONTENT TYPE: ")
    body.info("FILE:\n")
}

http.get("/hello/script").apply {
    body.info("BODY: ")
}

if (args.contains("stop"))
    http.post("/STOP")

http.stop()
