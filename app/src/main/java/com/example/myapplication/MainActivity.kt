package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.myapplication.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        var login = ""
        var pass = ""
        binding.Login.isEnabled = false

        if(binding.UsuarioEdit.text.toString().equals(binding.PassEdit.text.toString())){
            binding.Login.isEnabled = true
        }else{
            Toast.makeText(getApplicationContext(), "Usuario o contraseña incorrectos", Toast.LENGTH_SHORT).show();
        }

        binding.Login.setOnClickListener {
            login = binding.UsuarioEdit.text.toString()
            pass = binding.PassEdit.text.toString()
            val intent = Intent(this@MainActivity, MainActivity2::class.java)
            intent.putExtra("LOGIN", login)
            intent.putExtra("PASS", pass)
            startActivity(intent)
        }

        binding.Registro.setOnClickListener {
            val intent = Intent(this@MainActivity, MainActivity3::class.java)
            startActivity(intent)
        }









    }
}