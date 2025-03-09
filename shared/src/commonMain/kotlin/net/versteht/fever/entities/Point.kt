package net.versteht.fever.entities

import kotlinx.datetime.LocalDateTime
import kotlinx.serialization.Serializable

@Serializable
data class Point(
    val time: LocalDateTime,
    val measurement: Float,
    val case: Case
)
