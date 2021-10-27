package com.example.fragmentdemo

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.fragmentdemo.databinding.Fragment1Binding
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.activityViewModels

class Fragment1 : Fragment(R.layout.fragment_1) {
    private lateinit var binding: Fragment1Binding
    private val viewModel1: Fragment1ViewModel by activityViewModels()

    companion object {
        @JvmStatic
        fun newInstance(): Fragment1 {
            return Fragment1()
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = DataBindingUtil.inflate(inflater, R.layout.fragment_1, container, false)
        binding.lifecycleOwner = viewLifecycleOwner
        binding.viewModel1 = viewModel1
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.button2.setOnClickListener {
            requireActivity().supportFragmentManager.beginTransaction()
                .replace(R.id.fragment_container, Fragment2.newInstance())
                .addToBackStack(null)
                .commit()
        }

    }
}