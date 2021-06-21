package com.example.sign_in

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.Button
import android.widget.EditText
import android.widget.Spinner

class MainActivity : AppCompatActivity() {
    lateinit var etName:EditText
    lateinit var etEmail:EditText
    lateinit var spGender:Spinner
    lateinit var etPhone:EditText
    lateinit var etPass:EditText
    lateinit var btnSign:Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        castView()
        clickRegister()
    }
    fun castView(){
        etName=findViewById(R.id.etName)
        etEmail=findViewById(R.id.etEmail)
        spGender=findViewById(R.id.spGender)
        etPass=findViewById(R.id.etPass)
        etPhone=findViewById(R.id.etPhone)
        btnSign=findViewById(R.id.btnSign)
        var gender= arrayOf("Male","Female","Others")
        var  adapter=ArrayAdapter(baseContext,android.R.layout.simple_spinner_dropdown_item,gender)
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
        spGender.adapter=adapter

    }
    fun clickRegister(){
        btnSign.setOnClickListener {
            var name=etName.text.toString()
            var email=etEmail.text.toString()
            var gender=""
            var password=etPass.text.toString()
            var phones=etPhone.text.toString()
            if (email.isEmpty()){
                etEmail.setError("Name is required")
            }
            var login=Login(name,email,gender,password,phones)
            var intent=Intent(baseContext,Register::class.java)
            startActivity(intent)
        }

    }
    data class Login(var name:String,var email:String,
                     var gender:String,var password:String,
                     var phones:String)


}