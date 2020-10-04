package com.example.retrofit.model.Retrofit.rickandmorty.Inicio.Info


import com.google.gson.annotations.SerializedName

data class Info(
    @SerializedName("count")
    val count: Int,
    @SerializedName("next")
    val next: String,
    @SerializedName("pages")
    val pages: Int,
    @SerializedName("prev")
    val prev: Any
)