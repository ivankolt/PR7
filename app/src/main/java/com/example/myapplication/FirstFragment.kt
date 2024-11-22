package com.example.myapplication

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.navigation.NavController
import androidx.navigation.Navigation

class FirstFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_first, container, false)

        val button: Button = view.findViewById(R.id.button_to_second)
        button.setOnClickListener {
            // Передать данные во SecondFragment
            val bundle = Bundle().apply {
                putString("dataKey", "Привет из первого фрагмента!")
            }
            val navController: NavController = Navigation.findNavController(view)
            navController.navigate(R.id.secondFragment, bundle)
        }

        return view
    }
}