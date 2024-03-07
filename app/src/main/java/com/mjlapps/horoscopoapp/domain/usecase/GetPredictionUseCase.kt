package com.mjlapps.horoscopoapp.domain.usecase

import com.mjlapps.horoscopoapp.domain.Repository
import javax.inject.Inject

class GetPredictionUseCase @Inject constructor(private val repository: Repository) {

    suspend operator fun invoke(sign: String) = repository.getPrediction(sign)


}