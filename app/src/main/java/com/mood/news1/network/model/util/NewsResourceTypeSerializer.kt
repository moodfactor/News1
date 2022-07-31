package com.mood.news1.network.model.util

import com.mood.news1.model.TopicsType
import com.mood.news1.model.asTopicsType
import kotlinx.serialization.KSerializer
import kotlinx.serialization.descriptors.PrimitiveKind
import kotlinx.serialization.descriptors.PrimitiveSerialDescriptor
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder

object NewsResourceTypeSerializer: KSerializer<TopicsType> {
    override fun deserialize(decoder: Decoder): TopicsType =
        decoder.decodeString().asTopicsType()

    override val descriptor: SerialDescriptor = PrimitiveSerialDescriptor(
        serialName = "type", kind = PrimitiveKind.STRING
    )

    override fun serialize(encoder: Encoder, value: TopicsType) =
        encoder.encodeString(value.serializedName)
}