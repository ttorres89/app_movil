package com.example.comparaprecios_tania.ui.View

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.room.Room
import com.example.comparaprecios_tania.db.config.DB
import com.example.comparaprecios_tania.databinding.ActivityLoginBinding
import com.google.android.material.tabs.TabLayout
import com.google.android.material.tabs.TabLayoutMediator

class LoginActivity : AppCompatActivity() {
    companion object {
        lateinit var database : DB
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = ActivityLoginBinding.inflate(layoutInflater)
        database = Room.databaseBuilder(applicationContext, DB::class.java,"ejemplo").build()
        setContentView(binding.root)

        binding.tabLayout.tabGravity = TabLayout.GRAVITY_FILL

        val adapter = LoginAdapter(supportFragmentManager,lifecycle)

        binding.viewPager2.adapter=adapter

        TabLayoutMediator(binding.tabLayout, binding.viewPager2){tab,position->
            when(position){
                0 -> {
                    tab.text = "Ingreso"
                }
                1 -> {
                    tab.text="Registro"
                }
            }
        }.attach()


    }


}