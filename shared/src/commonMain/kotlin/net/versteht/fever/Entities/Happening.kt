package net.versteht.fever.Entities

import kotlinx.datetime.LocalDate
import kotlinx.serialization.Serializable

@Serializable
data class Happening(
    val id: Int?,
    val name: String,
    val started: LocalDate,
    val docChecked: Boolean
)
