package com.example.pruebaconcepto

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.pruebaconcepto.databinding.ActivityDocsBinding
import com.example.pruebaconcepto.databinding.ActivityDocumentosBinding

class Documentos : AppCompatActivity() {

    private lateinit var binding: ActivityDocumentosBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityDocumentosBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnBack.setOnClickListener { volver() }
    }


    private fun volver() {
        val intent = Intent(this,Semanas::class.java)
        startActivity(intent)
    }
}