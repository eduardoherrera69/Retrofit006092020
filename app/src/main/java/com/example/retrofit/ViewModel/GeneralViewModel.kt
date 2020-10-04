package com.example.retrofit.ViewModel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.retrofit.model.Retrofit.Repository
import com.example.retrofit.model.Retrofit.rickandmorty.Inicio.Result.Result

class GeneralViewModel:ViewModel() {
    private val  repository= Repository()
    init {
        repository.getDataFromServer()
    }
    fun exposeLiveDataFromServer(): MutableLiveData<List<Result>> {
        return repository.mLiveData
    }
}