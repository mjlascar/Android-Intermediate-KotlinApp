package com.mjlapps.horoscopoapp.ui.horoscope

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.mjlapps.horoscopoapp.databinding.FragmentHoroscopeBinding
import com.mjlapps.horoscopoapp.databinding.FragmentLuckBinding
import com.mjlapps.horoscopoapp.databinding.FragmentPalmistryBinding


class PalmistryFragment : Fragment() {

    private var _binding: FragmentPalmistryBinding? = null
    private val binding get() = _binding!!

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentPalmistryBinding.inflate(layoutInflater, container, false)

        return binding.root
    }

}