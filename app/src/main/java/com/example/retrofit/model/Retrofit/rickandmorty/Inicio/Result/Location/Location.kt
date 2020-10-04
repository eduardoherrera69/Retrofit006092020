package com.example.retrofit.model.Retrofit.rickandmorty.Inicio.Result.Location


import com.google.gson.annotations.SerializedName

data class Location(
    @SerializedName("name")
    val name: String,
    @SerializedName("url")
    val url: String
)