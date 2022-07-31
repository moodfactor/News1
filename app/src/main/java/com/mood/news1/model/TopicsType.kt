package com.mood.news1.model

enum class TopicsType(
    val serializedName: String,
    val displayText: String,
    val description: String
) {
    Video(
        serializedName = "Video 📺",
        displayText = "Video 📺",
        description = "A video published on YouTube"
    ),
    APIChange(
        serializedName = "API change",
        displayText = "API change",
        description = "An addition, deprecation or change to the Android platform APIs."
    ),
    Article(
        serializedName = "Article 📚",
        displayText = "Article 📚",
        description = "An article, typically on Medium or the official Android blog"
    ),
    Codelab(
        serializedName = "Codelab",
        displayText = "Codelab",
        description = "A new or updated codelab"
    ),
    Unknown(
        serializedName = "Unknown",
        displayText = "Unknown",
        description = "Unknown"
    )

}

fun String?.asTopicsType() = when (this) {
    null -> TopicsType.Unknown
    else -> TopicsType.values()
        .firstOrNull { type -> type.serializedName == this } ?: TopicsType.Unknown
}