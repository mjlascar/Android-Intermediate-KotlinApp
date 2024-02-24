package com.mjlapps.horoscopoapp.ui.horoscope.adapter

import android.view.View
import android.view.animation.LinearInterpolator
import androidx.recyclerview.widget.RecyclerView
import com.mjlapps.horoscopoapp.databinding.ItemHoroscopeBinding
import com.mjlapps.horoscopoapp.domain.model.HoroscopeInfo

class HoroscopeViewHolder(view: View) : RecyclerView.ViewHolder(view) {

    private val binding = ItemHoroscopeBinding.bind(view)

    fun render(horoscopeInfo: HoroscopeInfo, onItemSelected: (HoroscopeInfo) -> Unit) {
        val context = binding.tvTitle.context
        binding.ivHoroscope.setImageResource(horoscopeInfo.img)
        binding.tvTitle.text = context.getString(horoscopeInfo.name)

        binding.itemHoroscope.setOnClickListener {
            startRotationAnim(binding.ivHoroscope, newLambda = { onItemSelected(horoscopeInfo) }) //uses lambda fun to wait for the animation to end
        }
    }

    private fun startRotationAnim(view: View, newLambda:() -> Unit) {
        view.animate().apply {
            duration = 500
            interpolator = LinearInterpolator()
            rotationBy(360f)
            withEndAction{ newLambda() }
            start()
        }

    }
}