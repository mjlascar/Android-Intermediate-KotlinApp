package com.mjlapps.horoscopoapp.data

import android.util.Log
import com.mjlapps.horoscopoapp.data.network.HoroscopeApiService
import com.mjlapps.horoscopoapp.data.network.response.PredictionResponse
import com.mjlapps.horoscopoapp.domain.Repository
import com.mjlapps.horoscopoapp.domain.model.PredictionModel
import retrofit2.Retrofit
import javax.inject.Inject

class RepositoryImpl @Inject constructor(private val apiService: HoroscopeApiService) : Repository {
    override suspend fun getPrediction(sign: String): PredictionModel? {
        runCatching { apiService.getHoroscope(sign) }
            .onSuccess { return it.toDomain() } //converted it from data PredictionResponse to domain PredictionModel
            .onFailure { Log.i("oof", "an error has ocurred ${it.message}") }

        return null
    }
}