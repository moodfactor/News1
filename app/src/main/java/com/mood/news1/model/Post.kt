package com.mood.news1.model

import androidx.annotation.DrawableRes
import com.mood.news1.network.model.NetworkPost

data class Post(
    val id: String,
    val title: String,
    val subtitle: String? = null,
    val url: String? = null,
    val publication: Publication? = null,
    val metadata: Metadata,
    val paragraphs: List<Paragraph> = emptyList(),
    @DrawableRes val imageId: Int,
    @DrawableRes val imageThumbId: Int
)

fun NetworkPost.asEntity() = Post(
    id = id,
    title = title,
    subtitle = subtitle,
    url = url,
    publication = publication,
    metadata = metadata,
    paragraphs = paragraphs,
    imageId = imageId,
    imageThumbId = imageThumbId

)

data class Metadata(
    val author: PostAuthor,
    val date: String,
    val readTimeMinutes: Int
)

data class PostAuthor(
    val name: String,
    val url: String? = null
)

data class Publication(
    val name: String,
    val logoUrl: String? = null
)

data class Paragraph(
    val type: ParagraphType,
    val text: String,
)

enum class ParagraphType {
    Title,
    Caption,
    Header,
    Subhead,
    Text,
    CodeBlock,
    Quote,
    Bullet,
}