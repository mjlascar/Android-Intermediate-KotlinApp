package com.mjlapps.horoscopoapp.domain

import com.mjlapps.horoscopoapp.data.network.response.PredictionResponse
import com.mjlapps.horoscopoapp.domain.model.PredictionModel

interface Repository {
    suspend fun getPrediction(sign: String): PredictionModel?
}