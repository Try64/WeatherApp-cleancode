package com.try64.weatherapp.presentation

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.try64.weatherapp.domain.location.LocationTracker
import com.try64.weatherapp.domain.repository.WeatherRepository
import com.try64.weatherapp.domain.util.Resource
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class WeatherViewModel @Inject constructor(
    private val repository: WeatherRepository,
    private val locationTracker:LocationTracker
):ViewModel(){
    var state by mutableStateOf(WeatherState())
    private set

    fun loadWeatherInfo(){
        viewModelScope.launch {
            state = state.copy(
                isLoading = true,
                error = null
            )

            locationTracker.getCurrentLocation()?.let { location ->
                when(val result = repository.getWeatherData(latitude = location.latitude, longitude = location.longitude)){
                    is Resource.Success ->{
                        state = state.copy(
                            isLoading = false,
                            error = null,
                            weatherInfo = result.data
                        )
                    }
                    is Resource.Error ->{
                        state = state.copy(
                            isLoading = false,
                            weatherInfo = null,
                            error = result.message
                        )
                    }
                }
            }?: kotlin.run {
                state = state.copy(
                    isLoading = false,
                    error = "Couldn't retrive location.Make sure you grant all permission and allow GPS."
                )
            }
        }
    }

}