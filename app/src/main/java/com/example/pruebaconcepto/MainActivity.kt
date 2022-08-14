package com.example.pruebaconcepto

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import com.example.pruebaconcepto.databinding.ActivityMainBinding
import com.google.firebase.FirebaseApp
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.auth.FirebaseUser
import com.google.firebase.auth.ktx.auth
import com.google.firebase.ktx.Firebase

class MainActivity : AppCompatActivity() {

    private lateinit var auth: FirebaseAuth
    private lateinit var binding: ActivityMainBinding


//
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        FirebaseApp.initializeApp(this)
        auth = Firebase.auth

        binding.btnIngresar.setOnClickListener(){
            haceLogin()
        }

        binding.btnRegistrar.setOnClickListener(){
            haceRegister()
        }

    }

    private fun haceRegister() {
        val email= binding.etCorreo.text.toString()
        val clave = binding.etClave.text.toString()

        auth.createUserWithEmailAndPassword(email,clave).
        addOnCompleteListener(this){ task->
            if(task.isSuccessful){
                Log.d("Creando usuario","Registrado")
                val user=auth.currentUser
                actualiza(user)
            }else{
                Log.d("Creando usuario","Fallo")
                Toast.makeText(baseContext,"Fallo", Toast.LENGTH_LONG).show()
                actualiza(null)
            }

        }
    }

    private fun haceLogin() {
        val email= binding.etCorreo.text.toString()
        val clave = binding.etClave.text.toString()

        if(email!="" && clave!="" ){
            auth.signInWithEmailAndPassword(email,clave).
            addOnCompleteListener(this){ task->
                if(task.isSuccessful){
                    Log.d("Autenticando","Auntenticado")
                    val user=auth.currentUser
                    actualiza(user)
                }else{
                    Log.d("Autenticando","Fallo")
                    Toast.makeText(baseContext,"Fallo", Toast.LENGTH_LONG).show()
                    actualiza(null)
                }

            }
        }else{
            Log.d("Autenticando","Faltan las Credenciales")
            Toast.makeText(baseContext,"Fallo", Toast.LENGTH_LONG).show()
        }


    }

    private fun actualiza(user: FirebaseUser?) {
        if(user!=null){
            val intent = Intent(this,Matra::class.java)
            startActivity(intent)
        }

    }

    //Esto hara que una vez auntenticado...
    public override fun onStart(){
        super.onStart()
        val usuario= auth.currentUser
        actualiza(usuario)
    }
}