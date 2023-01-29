package com.example.myapplication

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.myapplication.databinding.ActivityMain3Binding


class MainActivity3 : AppCompatActivity() {
    private lateinit var binding: ActivityMain3Binding
    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMain3Binding.inflate(layoutInflater)
        setContentView(binding.root)


        val login = intent.getStringExtra("LOGIN").toString()
        val pass = intent.getStringExtra("PASS").toString()


        //Te da la bienvenida con el nombre de usuario
        binding.bienvenida.text = "Bienvenido $login"



    }
}