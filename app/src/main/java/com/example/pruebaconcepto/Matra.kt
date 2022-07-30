package com.example.pruebaconcepto

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.pruebaconcepto.databinding.ActivityMatraBinding
import com.google.firebase.auth.ktx.auth
import com.google.firebase.ktx.Firebase

class Matra : AppCompatActivity() {

    private lateinit var binding: ActivityMatraBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMatraBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnCategorias.setOnClickListener(){
            verCategorias()
        }

        binding.btnVolver.setOnClickListener(){
            volver()
        }
    }


    private fun verCategorias() {
        val intent = Intent(this,Categorias::class.java)
        startActivity(intent)
    }

    private fun volver() {
        Firebase.auth.signOut()
        val intent = Intent(this,MainActivity::class.java)
        startActivity(intent)
    }


}