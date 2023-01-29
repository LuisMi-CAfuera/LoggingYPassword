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

        //Aqui creamos las variables de login y pass
        var login :String
        var pass :String

        //Aqui cogemos los datos de la otra activity
        login = intent.getStringExtra("LOGIN2").toString()
        pass = intent.getStringExtra("PASS2").toString()

        //Aqui desactivamos el boton de login si el usuario y la contraseña coinciden

        binding.PassEdit.addTextChangedListener(object : TextWatcher {
            override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) {

            }

            override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {


            }
            override fun afterTextChanged(s: Editable?) {

                    if (login == binding.UsuarioEdit.text.toString() && pass == binding.PassEdit.text.toString()) {
                        binding.Login.isEnabled = true
                    } else {
                        binding.Login.isEnabled = false
                        Toast.makeText(this@MainActivity, "Usuario o contraseña incorrectos", Toast.LENGTH_SHORT).show()
                    }
            }
        })






        //Este es el boton que te lleva a la ultima activity
        binding.Login.setOnClickListener {
            login = binding.UsuarioEdit.text.toString()
            pass = binding.PassEdit.text.toString()
            val intent = Intent(this@MainActivity, MainActivity3::class.java)
            intent.putExtra("LOGIN", login)
            intent.putExtra("PASS", pass)
            startActivity(intent)
        }

        //Este es el boton que te lleva a la activity de registro
        binding.Registro.setOnClickListener {
            val intent = Intent(this@MainActivity, MainActivity2::class.java)
            startActivity(intent)
        }









    }
}