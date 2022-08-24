package com.example.pruebaconcepto

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.pruebaconcepto.databinding.ActivityCursosBinding
import com.google.firebase.auth.ktx.auth
import com.google.firebase.ktx.Firebase

class Cursos : AppCompatActivity() {

    private lateinit var binding: ActivityCursosBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityCursosBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnMoviles.setOnClickListener(){
            verSemanas()
        }

        binding.btnSistemas.setOnClickListener(){
            verSemanas()
        }

        binding.btnBase.setOnClickListener(){
            verSemanas()
        }

        binding.btnVolver.setOnClickListener(){
            volver()
        }
    }


    private fun verSemanas() {
        val intent = Intent(this,Semanas::class.java)
        startActivity(intent)
    }

    private fun volver() {
        Firebase.auth.signOut()
        val intent = Intent(this,MainActivity::class.java)
        startActivity(intent)
    }


}