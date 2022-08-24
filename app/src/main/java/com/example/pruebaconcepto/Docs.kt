package com.example.pruebaconcepto

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.pruebaconcepto.databinding.ActivityDocsBinding
import com.example.pruebaconcepto.databinding.ActivityCursosBinding
import com.google.firebase.auth.ktx.auth
import com.google.firebase.ktx.Firebase

class Docs : AppCompatActivity() {

    private lateinit var binding: ActivityDocsBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityDocsBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }

}