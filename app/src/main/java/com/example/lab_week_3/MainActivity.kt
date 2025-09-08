package com.example.lab_week_3

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.FragmentContainerView

interface CoffeeListener {
    fun onSelected(id: Int)
}

class MainActivity : AppCompatActivity(), CoffeeListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        if (savedInstanceState == null) {
            // Pertama kali: tampilkan ListFragment
            val listFragment = ListFragment()
            supportFragmentManager.beginTransaction()
                .add(R.id.fragment_container, listFragment)
                .commit()
        }
    }

    override fun onSelected(id: Int) {
        // Ganti ListFragment dengan DetailFragment
        val detailFragment = DetailFragment.newInstance(id)
        supportFragmentManager.beginTransaction()
            .replace(R.id.fragment_container, detailFragment)
            .addToBackStack(null) // biar bisa pencet tombol back
            .commit()
    }
}
