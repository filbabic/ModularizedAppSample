package com.filbabic.modularizationapp.core
import kotlinx.serialization.Serializable

@Serializable
sealed class Route {
    @Serializable
    data object Login : Route()
    @Serializable
    data object Register : Route()
}
