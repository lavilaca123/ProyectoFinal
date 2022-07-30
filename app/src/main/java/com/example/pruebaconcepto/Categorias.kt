package com.example.pruebaconcepto

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.pruebaconcepto.databinding.ActivityCategoriasBinding
import com.example.pruebaconcepto.databinding.ActivityMatraBinding
import com.google.firebase.auth.ktx.auth
import com.google.firebase.ktx.Firebase

class Categorias : AppCompatActivity() {
    private lateinit var binding: ActivityCategoriasBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityCategoriasBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnVolverInicio.setOnClickListener(){
            volver()
        }
    }

    private fun volver() {
        val intent = Intent(this,Matra::class.java)
        startActivity(intent)
    }
}