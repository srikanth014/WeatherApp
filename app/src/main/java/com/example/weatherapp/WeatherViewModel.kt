package com.example.weatherapp

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.weatherapp.api.Constants
import com.example.weatherapp.api.NetworkResponse
import com.example.weatherapp.api.RetrofitInstance
import com.example.weatherapp.api.WeatherModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.launch

class WeatherViewModel : ViewModel() {
    private val weatherApi = RetrofitInstance.weatherApi
    private val _weatherState = MutableStateFlow<NetworkResponse<WeatherModel>?>(null)
    val weatherState: StateFlow<NetworkResponse<WeatherModel>?> = _weatherState.asStateFlow()

    fun getData(city: String) {
        _weatherState.value = NetworkResponse.Loading
        viewModelScope.launch {
            try {
                val response = weatherApi.getWeather(Constants.API_KEY, city)
                if (response.isSuccessful) {
                    val weatherData = response.body()
                    weatherData?.let {
                        _weatherState.value = NetworkResponse.Success(it)
                    }
                } else {
                    _weatherState.value = NetworkResponse.Error("Error: ${response.message()}")
                }
            } catch (e: Exception) {
                _weatherState.value = NetworkResponse.Error("Error: ${e.message}")
            }
        }
    }
}