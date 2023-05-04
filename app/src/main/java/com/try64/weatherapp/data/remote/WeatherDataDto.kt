package com.try64.weatherapp.data.remote

import com.squareup.moshi.Json

/**
 * This the POJO class from the response data we get from server
 */
data class WeatherDataDto(
    val time: List<String>,
    @field:Json(name = "temperature_2m") // this works like map . ie map ("temperature_2m" to "temperatures") in kotlin
    val temperatures: List<Double>,
    @field:Json(name = "weathercode")
    val weatherCodes: List<Int>,
    @field:Json(name = "pressure_msl")
    val pressures: List<Double>,
    @field:Json(name = "windspeed_10m")
    val windSpeeds: List<Double>,
    @field:Json(name = "relativehumidity_2m")
    val humidities: List<Double>
)