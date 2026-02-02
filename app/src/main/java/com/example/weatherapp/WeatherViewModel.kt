package com.example.weatherapp

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.weatherapp.api.Constants
import com.example.weatherapp.api.NetworkResponse
import com.example.weatherapp.api.RetrofitInstance
import com.example.weatherapp.api.WeatherModel
import kotlinx.coroutines.launch

class WeatherViewModel : ViewModel() {
    private val weatherApi = RetrofitInstance.weatherApi
    private val _weatherApi = MutableLiveData<NetworkResponse<WeatherModel>>()
    val weatherResult: LiveData<NetworkResponse<WeatherModel>> = _weatherApi

    fun getData(city: String) {
        _weatherApi.postValue(NetworkResponse.Loading)
        viewModelScope.launch {
            try {
                val response = weatherApi.getWeather(Constants.API_KEY, city)
                if (response.isSuccessful) {
                    val weatherData = response.body()
                    weatherData?.let {
                        _weatherApi.postValue(NetworkResponse.Success(it))
                    }
                } else {
                    _weatherApi.postValue(NetworkResponse.Error("Error: ${response.message()}"))
                }
            } catch (e: Exception) {
                _weatherApi.postValue(NetworkResponse.Error("Error: ${e.message}"))

            }
        }
    }
}