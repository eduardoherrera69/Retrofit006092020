package com.example.retrofit.model.Retrofit

import com.google.gson.annotations.SerializedName

data class dcGeneral ( val price: Long,
                     val id: String,
                     val type: String,
                     @SerializedName("img_src")val imgSrc: String)