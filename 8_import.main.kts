#!/usr/bin/env kotlin

/*
 * 8. ORGANIZE CODE - Convert files among different data formats
 *
 * You can import other scripts
 */
@file:Import("convert.main.kts")

import com.hexagonkt.serialization.jackson.json.Json
import com.hexagonkt.serialization.jackson.yaml.Yaml

val data =
    """
    a: 0
    b: true
    c: 'Text'
    """.trimIndent()

println(convert(data, Yaml, Json))
