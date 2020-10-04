package com.example.retrofit.model.Retrofit

import android.util.Log
import androidx.lifecycle.MutableLiveData
import com.example.retrofit.model.Retrofit.rickandmorty.Inicio.Result.Result
import com.example.retrofit.model.Retrofit.rickandmorty.Inicio.DcPersonajesRAM
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class Repository () {
    private val services = RetrofitClient.getRetrofitClient()
    val mLiveData = MutableLiveData<List<Result>>(emptyList())

    //la vieja confiable
    fun getDataFromServer() {
        val call2 = services.getDataFromApi()
        call2.enqueue(object : Callback<DcPersonajesRAM> {
            override fun onResponse(call: Call<DcPersonajesRAM>, response: Response<DcPersonajesRAM>) {
               Log.d("Resul",response.body().toString())
                when(response.code()){
                    in 200..299 -> mLiveData.postValue(response.body()?.results)//
                    in 300..399 -> Log.d("ERROR 300", response.errorBody().toString())
                    in 400..499 -> Log.d("ERROR 400", response.errorBody().toString())
                }
            }

            override fun onFailure(call: Call<DcPersonajesRAM>, t: Throwable) {
               Log.d("Repository", t.message.toString())
            }
        })
    }
}