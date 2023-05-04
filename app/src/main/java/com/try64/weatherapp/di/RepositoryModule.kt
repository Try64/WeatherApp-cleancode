package com.try64.weatherapp.di

import com.try64.weatherapp.data.location.DefaultLocationTracker
import com.try64.weatherapp.data.repository.WeatherRepositoryImpl
import com.try64.weatherapp.domain.location.LocationTracker
import com.try64.weatherapp.domain.repository.WeatherRepository
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
abstract class RepositoryModule {

    @Binds
    @Singleton
    abstract fun bindWeatherRepository(
        weatherRepositoryImpl: WeatherRepositoryImpl
    ):WeatherRepository
}