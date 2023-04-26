package com.example.navigationcomponent

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import com.example.navigationcomponent.databinding.FragmentThreeBinding



class FragmentThree : Fragment(){

    private lateinit var binding: FragmentThreeBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = FragmentThreeBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.fragmentFourBtn.setOnClickListener {
            Navigation.findNavController(view).navigate(R.id.action_fragmentThree_to_fragmentFour)
        }

        binding.mainFragmentBtn.setOnClickListener {
            Navigation.findNavController(view).navigate(R.id.action_fragmentThree_to_mainFragment)
        }
    }
}