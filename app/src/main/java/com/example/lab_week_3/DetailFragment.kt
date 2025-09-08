package com.example.lab_week_3

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController

class DetailFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_detail, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val coffeeId = arguments?.getInt("coffee_id", 0) ?: 0
        setCoffeeData(coffeeId, view)

        // Back button handler
        view.findViewById<Button>(R.id.back_button)?.setOnClickListener {
            findNavController().navigateUp()
        }
    }

    private fun setCoffeeData(id: Int, view: View) {
        val coffeeTitle = view.findViewById<TextView>(R.id.coffee_title)
        val coffeeDesc = view.findViewById<TextView>(R.id.coffee_desc)

        when (id) {
            R.id.affogato -> {
                coffeeTitle.text = getString(R.string.affogato_title)
                coffeeDesc.text = getString(R.string.affogato_desc)
            }
            R.id.americano -> {
                coffeeTitle.text = getString(R.string.americano_title)
                coffeeDesc.text = getString(R.string.americano_desc)
            }
            R.id.latte -> {
                coffeeTitle.text = getString(R.string.latte_title)
                coffeeDesc.text = getString(R.string.latte_desc)
            }
            R.id.cortado -> {
                coffeeTitle.text = getString(R.string.cortado_title)
                coffeeDesc.text = getString(R.string.cortado_desc)
            }
            R.id.mocha -> {
                coffeeTitle.text = getString(R.string.mocha_title)
                coffeeDesc.text = getString(R.string.mocha_desc)
            }
            R.id.flatwhite -> {
                coffeeTitle.text = getString(R.string.flatwhite_title)
                coffeeDesc.text = getString(R.string.flatwhite_desc)
            }
            R.id.macchiato -> {
                coffeeTitle.text = getString(R.string.macchiato_title)
                coffeeDesc.text = getString(R.string.macchiato_desc)
            }
            R.id.ristretto -> {
                coffeeTitle.text = getString(R.string.ristretto_title)
                coffeeDesc.text = getString(R.string.ristretto_desc)
            }
            R.id.cappuccino -> {
                coffeeTitle.text = getString(R.string.cappuccino_title)
                coffeeDesc.text = getString(R.string.cappuccino_desc)
            }
            R.id.irish -> {
                coffeeTitle.text = getString(R.string.irish_title)
                coffeeDesc.text = getString(R.string.irish_desc)
            }
        }

    }
    companion object {
        const val ARG_COFFEE_ID = "coffee_id"
    }
}