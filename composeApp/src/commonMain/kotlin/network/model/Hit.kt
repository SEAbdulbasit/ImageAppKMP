package network.model

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class Hit(
    @SerialName("collections")
    val collections: Int?,
    @SerialName("comments")
    val comments: Int?,
    @SerialName("downloads")
    val downloads: Int?,
    @SerialName("id")
    val id: Int?,
    @SerialName("imageHeight")
    val imageHeight: Int?,
    @SerialName("imageSize")
    val imageSize: Int?,
    @SerialName("imageWidth")
    val imageWidth: Int?,
    @SerialName("largeImageURL")
    val largeImageURL: String?,
    @SerialName("likes")
    val likes: Int?,
    @SerialName("pageURL")
    val pageURL: String?,
    @SerialName("previewHeight")
    val previewHeight: Int?,
    @SerialName("previewURL")
    val previewURL: String?,
    @SerialName("previewWidth")
    val previewWidth: Int?,
    @SerialName("tags")
    val tags: String?,
    @SerialName("type")
    val type: String?,
    @SerialName("user")
    val user: String?,
    @SerialName("user_id")
    val userId: Int?,
    @SerialName("userImageURL")
    val userImageURL: String?,
    @SerialName("views")
    val views: Int?,
    @SerialName("webformatHeight")
    val webformatHeight: Int?,
    @SerialName("webformatURL")
    val webformatURL: String?,
    @SerialName("webformatWidth")
    val webformatWidth: Int?
)