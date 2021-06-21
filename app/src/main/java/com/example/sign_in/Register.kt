package com.example.sign_in

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class Register : AppCompatActivity() {
    lateinit var etMail:EditText
    lateinit var etPass:EditText
    lateinit var btnLogin:Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register)
        castVeiw()
        onClick()
    }
    fun castVeiw(){
        etMail=findViewById(R.id.etMail)
        etPass=findViewById(R.id.etPass)
        btnLogin=findViewById(R.id.btnLogin)
    }
    fun onClick(){
        btnLogin.setOnClickListener {
            var password=etPass.text.toString()
            var email=etMail.text.toString()
        }
    }
}