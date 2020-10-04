package com.example.retrofit.model.Retrofit.rickandmorty.Inicio.Result.Origin


import com.google.gson.annotations.SerializedName

data class Origin(
    @SerializedName("name")
    val name: String,
    @SerializedName("url")
    val url: String
)