package models

import kotlinx.serialization.Serializable

@Serializable
data class UserPassword(val username: String, val password: String)