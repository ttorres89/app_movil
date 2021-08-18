package com.example.comparaprecios_tania.View

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.room.Room
import androidx.viewpager2.widget.ViewPager2
import com.example.comparaprecios_tania.Model.UsuarioDB
import com.example.comparaprecios_tania.R
import com.example.comparaprecios_tania.databinding.ActivityLoginBinding
import com.google.android.material.tabs.TabLayout
import com.google.android.material.tabs.TabLayoutMediator

class LoginActivity : AppCompatActivity() {
    companion object {
        lateinit var database : UsuarioDB
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = ActivityLoginBinding.inflate(layoutInflater)
        database = Room.databaseBuilder(applicationContext, UsuarioDB::class.java,"ejemplo").build()
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