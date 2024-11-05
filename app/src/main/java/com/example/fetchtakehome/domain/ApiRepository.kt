package com.example.fetchtakehome.domain

import com.example.fetchtakehome.data.models.DataItem
import com.example.fetchtakehome.data.network.RetrofitInstance
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow

class ApiRepository {

    private val api = RetrofitInstance.api

    fun getListData(): Flow<List<DataItem>> = flow {
        val response = api.getData()
        emit(response)
    }
}