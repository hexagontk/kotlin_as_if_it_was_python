
@file:DependsOn("com.hexagonkt:serialization_jackson_json:3.5.3")
@file:DependsOn("com.hexagonkt:serialization_jackson_yaml:3.5.3")

import com.hexagonkt.serialization.SerializationFormat
import com.hexagonkt.serialization.parse
import com.hexagonkt.serialization.serialize

fun convert(data: String, source: SerializationFormat, target: SerializationFormat): String =
    data.parse(source).serialize(target)
