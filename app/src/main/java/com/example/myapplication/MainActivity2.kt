package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.myapplication.databinding.ActivityMain2Binding


class MainActivity2 : AppCompatActivity() {
    private lateinit var binding: ActivityMain2Binding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMain2Binding.inflate(layoutInflater)
        setContentView(binding.root)

        var login = ""
        var pass = ""

        login = binding.NombreEdit.text.toString()
        pass = binding.ContraseAEdit2.text.toString()

        binding.Registrar.setOnClickListener{
            val intent = Intent(this@MainActivity2, MainActivity::class.java)
            intent.putExtra("LOGIN", login)
            intent.putExtra("PASS", pass)
            startActivity(intent)
        }
    }
}