package com.try64.weatherapp.domain.repository

import com.try64.weatherapp.domain.util.Resource
import com.try64.weatherapp.domain.weather.WeatherInfo

interface WeatherRepository {
    suspend fun getWeatherData(latitude:Double,longitude:Double):Resource<WeatherInfo>
}