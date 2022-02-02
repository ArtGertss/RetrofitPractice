package com.example.retrofitpractice1.screens.second

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.retrofitpractice1.data.repository.Repository
import com.example.retrofitpractice1.model.beznal.Beznal
import com.example.retrofitpractice1.model.nal.Nalichka
import kotlinx.coroutines.launch
import retrofit2.Response

class SecondViewModel: ViewModel() {
    var repo = Repository()
    val myMoneyList : MutableLiveData<Response<Beznal>> = MutableLiveData()

    fun getBeznalMoney(){
        viewModelScope.launch {
            myMoneyList.value = repo.getBeznal()
        }
    }
}