package net.versteht.fever.entities

import kotlinx.datetime.LocalDate
import kotlinx.serialization.Serializable

@Serializable
data class Case(
    val name: String,
    val started: LocalDate,
    val docChecked: Boolean
)
