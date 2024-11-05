package com.example.fetchtakehome.presentation

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.fetchtakehome.data.models.DataItem
import com.example.fetchtakehome.domain.ApiRepository
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.launch

class MainViewModel: ViewModel() {

    private val repository = ApiRepository()

    private val _listItem = MutableStateFlow<List<DataItem>>(emptyList())
    val listItem: StateFlow<List<DataItem>> = _listItem

    fun getDataItems() {
        viewModelScope.launch {
            repository.getListData().collect { items ->
                _listItem.value = items
            }
        }
    }
}