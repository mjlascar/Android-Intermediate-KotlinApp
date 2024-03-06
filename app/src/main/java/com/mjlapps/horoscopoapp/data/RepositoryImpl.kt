package com.mjlapps.horoscopoapp.data

import com.mjlapps.horoscopoapp.data.network.HoroscopeApiService
import com.mjlapps.horoscopoapp.domain.Repository
import retrofit2.Retrofit
import javax.inject.Inject

class RepositoryImpl @Inject constructor(private val apiService: HoroscopeApiService): Repository {
    override suspend fun getPrediction(sign: String) {
        //Ask Api prediction via retrofit
    }
}