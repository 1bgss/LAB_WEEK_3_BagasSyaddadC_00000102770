package com.example.lab_week_3

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController

class ListFragment : Fragment(), View.OnClickListener {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_list, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val coffeeList = listOf<View>(
            view.findViewById(R.id.affogato),
            view.findViewById(R.id.americano),
            view.findViewById(R.id.latte),
            view.findViewById(R.id.cortado),
            view.findViewById(R.id.mocha),
            view.findViewById(R.id.flatwhite),
            view.findViewById(R.id.macchiato),
            view.findViewById(R.id.ristretto),
            view.findViewById(R.id.cappuccino),
            view.findViewById(R.id.irish)
        )


        coffeeList.forEach { coffee ->
            coffee.setOnClickListener(this)
        }
    }

    override fun onClick(v: View?) {
        v?.let {
            val bundle = Bundle().apply { putInt(DetailFragment.ARG_COFFEE_ID, it.id) }
            findNavController().navigate(R.id.action_to_detail, bundle)
        }
    }
}