package net.versteht.fever.Entities

import kotlinx.datetime.LocalDateTime
import kotlinx.serialization.Serializable

@Serializable
data class Point(
    val time: LocalDateTime,
    val measurement: Float,
    val case: Happening
)
