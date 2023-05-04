package com.try64.weatherapp.data.remote

import retrofit2.http.GET
import retrofit2.http.Query


/**
 * This is the only network call for our application
 *
 */

interface WeatherAPI {
    @GET("v1/forecast?hourly=temperature_2m,weathercode,relativehumidity_2m,windspeed_10m,pressure_msl")
    suspend fun getWeatherData(
        @Query("latitude") latitude:Double,
        @Query("longitude") longitude:Double
    ):WeatherDto

}