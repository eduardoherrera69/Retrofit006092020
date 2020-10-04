package com.example.retrofit.model.Retrofit.rickandmorty.Inicio


import com.example.retrofit.model.Retrofit.rickandmorty.Inicio.Info.Info
import com.example.retrofit.model.Retrofit.rickandmorty.Inicio.Result.Result
import com.google.gson.annotations.SerializedName

data class DcPersonajesRAM(
    @SerializedName("info")
    val info: Info,
    @SerializedName("results")
    val results: List<Result>
)