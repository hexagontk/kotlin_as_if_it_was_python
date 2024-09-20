#!/bin/env kotlin

/*
 * Only works with JVM 21
 */

import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter
import java.net.InetAddress.getLoopbackAddress
import java.net.ServerSocket

ServerSocket(2000, 10, getLoopbackAddress()).use { serv ->
    println("Listening")

    while (true) {
        val sock = serv.accept()
        println("Accepted")

        Thread.startVirtualThread {
            sock.use {
                sock.getInputStream().use { i ->
                    sock.getOutputStream().use { o ->
                        val r = BufferedReader(InputStreamReader(i))
                        val w = BufferedWriter(OutputStreamWriter(o))
                        val ln = r.readLine()
                        println(ln)
                        w.write("HTTP/1.1 200 OK\n\nHi!")
                        w.flush()
                    }
                }
            }
        }
    }
}
