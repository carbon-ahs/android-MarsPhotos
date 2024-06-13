package com.example.marsphotos.data.network


/**
 * Created by Ahsan Habib on 6/13/2024.
 */
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class MarsPhoto(
    val id: String,
    @SerialName(value = "img_src")
    val imgSrc: String
)
