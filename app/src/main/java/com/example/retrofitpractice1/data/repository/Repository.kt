package com.example.retrofitpractice1.data.repository

import com.example.retrofitpractice1.data.api.RetrofitInstance
import com.example.retrofitpractice1.model.beznal.Beznal
import com.example.retrofitpractice1.model.beznal.BeznalItem
import com.example.retrofitpractice1.model.nal.Nalichka
import com.example.retrofitpractice1.model.nal.NalichkaItem
import retrofit2.Response

class Repository {
    suspend fun getNal(): Response<Nalichka>{
        return RetrofitInstance.api.getNalMoney()
    }
    suspend fun getBeznal(): Response<Beznal>{
        return RetrofitInstance.api.getBeznalMoney()
    }
}