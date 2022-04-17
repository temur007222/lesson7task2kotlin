package com.example.lesson7task2kotlin

import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.textfield.TextInputLayout

class MainActivity : AppCompatActivity() {
   private lateinit var  textInputEmail: TextInputLayout
   private lateinit var textInputUsername: TextInputLayout
    private lateinit var textInputPassword: TextInputLayout

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        textInputEmail = findViewById(R.id.text_input_email)
        textInputUsername = findViewById(R.id.text_input_username)
        textInputPassword = findViewById(R.id.text_input_password)
    }

    fun validateEmail(): Boolean{
        val emailInput: String = textInputEmail.editText?.text.toString().trim()

        if (emailInput.isEmpty()){
            textInputEmail.error
            return false
        }else{
            textInputEmail.error
            return true
        }
    }

    fun validateUsername(): Boolean{
        val usernameInput: String = textInputUsername.editText?.text.toString().trim()

        if (usernameInput.isEmpty()){
            textInputUsername.error
            return false
        }else if (usernameInput.length > 15){
            textInputUsername.error
            return false
        } else{
            textInputUsername.error
            return true
        }
    }

    fun validatePassword(): Boolean{
        val passwordInput: String = textInputPassword.editText?.text.toString().trim()

        if (passwordInput.isEmpty()){
            textInputPassword.error
            return false
        }else{
            textInputPassword.error
            return true
        }
    }

    fun confirmInput(view: View?) {
        if (!validateEmail() or !validateUsername() or !validatePassword()) {
            return
        }
        var input = "Email: " + textInputEmail.editText!!.text.toString()
        input += "\n"
        input += "Username: " + textInputUsername.editText!!.text.toString()
        input += "\n"
        input += "Password: " + textInputPassword.editText!!.text.toString()
        Toast.makeText(this, input, Toast.LENGTH_SHORT).show()
    }
}