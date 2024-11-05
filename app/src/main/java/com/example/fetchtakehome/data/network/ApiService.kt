package com.example.fetchtakehome.data.network

import com.example.fetchtakehome.data.models.DataItem
import retrofit2.http.GET

interface ApiService {

    @GET("hiring.json")
    suspend fun getData(): List<DataItem>
}
