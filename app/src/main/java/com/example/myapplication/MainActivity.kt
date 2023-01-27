package com.example.myapplication

import android.content.Intent
import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import android.view.View
import android.widget.Toast
import com.example.myapplication.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        var login :String
        var pass :String
        //si usurio y contraseña estan vacios no se puede iniciar sesion
        login = intent.getStringExtra("LOGIN2").toString()
        pass = intent.getStringExtra("PASS2").toString()


        binding.PassEdit.addTextChangedListener(object : TextWatcher {
            override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) {

            }

            override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {


            }
            override fun afterTextChanged(s: Editable?) {

                if (pass == null && binding.UsuarioEdit.text.toString() != binding.PassEdit.text.toString()) {
                    Toast.makeText(this@MainActivity, "Usuario y contraseña incorrectos o no te has registrado", Toast.LENGTH_SHORT).show()
                    binding.Login.isEnabled = false
                } else if( (login.isNotEmpty() && pass.isNotEmpty()) && binding.UsuarioEdit.text.toString() == binding.PassEdit.text.toString()){
                    binding.Login.isEnabled = true
                }
            }
        })







        binding.Login.setOnClickListener {
            login = binding.UsuarioEdit.text.toString()
            pass = binding.PassEdit.text.toString()
            val intent = Intent(this@MainActivity, MainActivity3::class.java)
            intent.putExtra("LOGIN", login)
            intent.putExtra("PASS", pass)
            startActivity(intent)
        }

        binding.Registro.setOnClickListener {
            val intent = Intent(this@MainActivity, MainActivity2::class.java)
            startActivity(intent)
        }









    }
}