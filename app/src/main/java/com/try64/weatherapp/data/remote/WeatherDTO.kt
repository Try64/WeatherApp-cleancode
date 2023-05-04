package com.try64.weatherapp.data.remote

import com.squareup.moshi.Json

/**
 * this is only the part we are interested in
 */
data class WeatherDto(
    @field:Json(name = "hourly")
    val weatherData: WeatherDataDto
)