package com.example.icare.model


data class User(
    val id: String,
    val name: String,
    val email: String,
    val profileImageUrl: String? = null,
    val bio: String? = null
)

