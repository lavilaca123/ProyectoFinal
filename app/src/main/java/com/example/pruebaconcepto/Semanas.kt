package com.example.pruebaconcepto

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.pruebaconcepto.databinding.ActivityDocsBinding
import com.example.pruebaconcepto.databinding.ActivitySemanasBinding

class Semanas : AppCompatActivity() {

    private lateinit var binding: ActivitySemanasBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySemanasBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnVolver2.setOnClickListener(){
            volver()
        }

        binding.btnMoviles2.setOnClickListener(){
            verDocs()
        }

        binding.btnMoviles3.setOnClickListener(){
            verDocs()
        }

        binding.btnMoviles4.setOnClickListener(){
            verDocs()
        }
    }

    private fun volver() {
        val intent = Intent(this,Cursos::class.java)
        startActivity(intent)
    }


    private fun verDocs() {
        val intent = Intent(this,Documentos::class.java)
        startActivity(intent)
    }
}