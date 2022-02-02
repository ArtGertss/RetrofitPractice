package com.example.retrofitpractice1.data.api

import com.example.retrofitpractice1.model.beznal.Beznal
import com.example.retrofitpractice1.model.beznal.BeznalItem
import com.example.retrofitpractice1.model.nal.Nalichka
import com.example.retrofitpractice1.model.nal.NalichkaItem
import retrofit2.Response
import retrofit2.http.GET

interface ApiService     {

    @GET("p24api/pubinfo?json&exchange&coursid=5")
    suspend fun getNalMoney(): Response<Nalichka>

    @GET("p24api/pubinfo?exchange&json&coursid=11")
    suspend fun getBeznalMoney(): Response<Beznal>


}