package network.model


import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable
import network.model.Hit

@Serializable
data class PixabayImages(
    @SerialName("hits")
    val hits: List<Hit?>?,
    @SerialName("total")
    val total: Int?,
    @SerialName("totalHits")
    val totalHits: Int?
)