package com.example.fragmentdemo

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import androidx.fragment.app.activityViewModels
import com.example.fragmentdemo.databinding.Fragment2Binding

class Fragment2 : Fragment(R.layout.fragment_2) {
    private lateinit var binding: Fragment2Binding
    private val viewModel2: Fragment2ViewModel by activityViewModels()

    companion object {
        @JvmStatic
        fun newInstance(): Fragment2 {
            return Fragment2()
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = DataBindingUtil.inflate(inflater, R.layout.fragment_2, container, false)
        binding.lifecycleOwner = viewLifecycleOwner
        binding.viewModel2 = viewModel2
        return binding.root
    }
}