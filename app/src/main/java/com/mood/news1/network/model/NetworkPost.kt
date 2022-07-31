package com.mood.news1.network.model

import com.mood.news1.model.Metadata
import com.mood.news1.model.Paragraph
import com.mood.news1.model.Publication
import kotlinx.serialization.Serializable

/**
 * Network representation of [Post]
 */
@Serializable
data class NetworkPost (
    val id: String,
    val title: String,
    val subtitle: String? = null,
    val url: String? = null,
    val publication: Publication? = null,
    val metadata: Metadata,
    val paragraphs: List<Paragraph> = emptyList(),
    val imageId: Int,
    val imageThumbId: Int
)