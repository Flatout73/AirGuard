package de.seemoo.at_tracking_detection.ui.tracking

import com.google.gson.*
import java.lang.reflect.Type
import java.util.Base64

class ByteArrayToBase64TypeAdapter : JsonSerializer<ByteArray>, JsonDeserializer<ByteArray> {

    override fun serialize(src: ByteArray, typeOfSrc: Type, context: JsonSerializationContext): JsonElement {
        // Convert ByteArray to Base64 String
        val base64String = Base64.getEncoder().encodeToString(src)
        return JsonPrimitive(base64String)
    }

    override fun deserialize(json: JsonElement, typeOfT: Type, context: JsonDeserializationContext): ByteArray {
        // Convert Base64 String back to ByteArray
        return Base64.getDecoder().decode(json.asString)
    }
}