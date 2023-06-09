package com.example.navigationcomponent

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import androidx.fragment.app.Fragment
import com.example.navigationcomponent.databinding.FragmentTwoBinding


class FragmentTwo : Fragment(){

    private lateinit var binding: FragmentTwoBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = FragmentTwoBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.fragmentFourBtn.setOnClickListener {
            Navigation.findNavController(view).navigate(R.id.action_fragmentTwo_to_fragmentFour)
        }

        binding.mainFragmentBtn.setOnClickListener {
            Navigation.findNavController(view).navigate(R.id.action_fragmentTwo_to_mainFragment)
        }
    }
}