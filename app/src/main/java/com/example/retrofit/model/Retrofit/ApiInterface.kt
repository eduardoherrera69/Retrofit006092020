//c 8 m:51
package com.example.retrofit.model.Retrofit

import com.example.retrofit.model.Retrofit.rickandmorty.Inicio.DcPersonajesRAM
import retrofit2.Call
import retrofit2.http.GET

interface ApiInterface {
    @GET("character")
    fun getDataFromApi(): Call<DcPersonajesRAM>
}