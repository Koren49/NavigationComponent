package com.example.navigationcomponent

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.navigation.Navigation
import com.example.navigationcomponent.databinding.ActivityMainBinding
import com.example.navigationcomponent.databinding.FragmentMainBinding

class MainFragment : androidx.fragment.app.Fragment(){

    private lateinit var binding: FragmentMainBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = FragmentMainBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.fragmentTwoBtn.setOnClickListener {
            Navigation.findNavController(view).navigate(R.id.action_mainFragment_to_fragmentTwo)
        }

        binding.fragmentThreeBtn.setOnClickListener {
            Navigation.findNavController(view).navigate(R.id.action_mainFragment_to_fragmentThree)
        }
    }
}