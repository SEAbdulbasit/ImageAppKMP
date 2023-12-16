package network

import io.ktor.client.HttpClient
import io.ktor.client.call.body
import io.ktor.client.plugins.contentnegotiation.ContentNegotiation
import io.ktor.client.request.get
import io.ktor.serialization.kotlinx.json.json
import network.model.PixabayImages


/**
 * Created by abdulbasit on 16/12/2023.
 */
class Network {
    private val client = HttpClient {
        install(ContentNegotiation) {
            json()
        }
    }

    suspend fun getFlowers(): PixabayImages {
        return client.get("https://pixabay.com/api/?key=11970216-69b90b3288af7654f2c0e1219&q=yellow+flowers&image_type=photo&pretty=true")
            .body<PixabayImages>()
    }

}