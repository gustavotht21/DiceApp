package com.nnt.diceapp2023_turmad.appusers

data class User(
    val name: String,
    val email: String,
    val password: String,
    val id: Int? = null
)