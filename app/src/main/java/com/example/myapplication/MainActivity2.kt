package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import android.widget.Toast
import com.example.myapplication.databinding.ActivityMain2Binding


class MainActivity2 : AppCompatActivity() {
    private lateinit var binding: ActivityMain2Binding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMain2Binding.inflate(layoutInflater)
        setContentView(binding.root)

        var login = ""
        var pass = ""

        binding.NombreEdit.addTextChangedListener(object : TextWatcher {
            override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) {

            }

            override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {
                login = binding.NombreEdit.text.toString()

            }
            override fun afterTextChanged(s: Editable?) {
            }
        })
        binding.ContraEdit2.addTextChangedListener(object : TextWatcher {
            override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) {

            }

            override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {
                pass = binding.ContraEdit2.text.toString()
            }
            override fun afterTextChanged(s: Editable?) {
            }
        })

        binding.Registrar.setOnClickListener{
            val intent = Intent(this@MainActivity2, MainActivity::class.java)

            println("login: $login")
            println("pass: $pass")
            intent.putExtra("LOGIN2", login)
            intent.putExtra("PASS2", pass)
            startActivity(intent)
        }
    }
}