package com.example.retrofit.model.Retrofit

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class RetrofitClient {
    companion object{
        private const val URL_BASE = "https://rickandmortyapi.com/api/"


        fun getRetrofitClient(): ApiInterface {
            val mCRetrofit = Retrofit.Builder().baseUrl(URL_BASE)
                .addConverterFactory(GsonConverterFactory.create())
                .build()
            return mCRetrofit.create(ApiInterface::class.java)
        }
    }
}