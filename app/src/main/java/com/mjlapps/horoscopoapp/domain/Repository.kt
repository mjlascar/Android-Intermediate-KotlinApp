package com.mjlapps.horoscopoapp.domain

interface Repository {
    suspend fun getPrediction(sign: String)
}