package com.try64.weatherapp.data.repository

import com.try64.weatherapp.data.mappers.toWeatherInfo
import com.try64.weatherapp.data.remote.WeatherAPI
import com.try64.weatherapp.domain.repository.WeatherRepository
import com.try64.weatherapp.domain.util.Resource
import com.try64.weatherapp.domain.weather.WeatherInfo
import javax.inject.Inject

class WeatherRepositoryImpl @Inject constructor(
    private val api:WeatherAPI
):WeatherRepository {
    override suspend fun getWeatherData(
        latitude: Double,
        longitude: Double
    ): Resource<WeatherInfo> {
        return try {
            Resource.Success(
                data = api.getWeatherData(
                    latitude = latitude,
                    longitude = longitude
                ).toWeatherInfo()
            )

        }catch (ex:Exception){
            ex.printStackTrace()
            Resource.Error(ex.message ?: "An unknown error occurred")
        }
    }
}