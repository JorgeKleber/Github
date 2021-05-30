package com.dev.kleber.github.getUser.data

import com.google.gson.annotations.SerializedName

data class User(

    @SerializedName("id")
    val id : Int,
    @SerializedName("login")
    val login : String,
    @SerializedName("name")
    val name: String
)

fun User?.isValid() : Boolean{

    return true
}