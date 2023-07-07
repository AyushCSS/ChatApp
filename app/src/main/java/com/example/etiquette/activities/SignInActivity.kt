package com.example.etiquette.activities

import android.content.Intent
import android.os.Bundle
import android.os.PersistableBundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.example.etiquette.R


class SignInActivity : AppCompatActivity() {
    private lateinit var edtEmail: EditText
    private lateinit var edtPassword : EditText
    private lateinit var btnLogIn : Button
    private lateinit var tvCreate : TextView

    override fun onCreate(savedInstanceState: Bundle?, persistentState: PersistableBundle?) {
        super.onCreate(savedInstanceState, persistentState)
        setContentView(R.layout.activity_sign_in)

        edtEmail = findViewById(R.id.edt_email)
        edtPassword = findViewById(R.id.edt_password)
        btnLogIn = findViewById(R.id.btnLog)
        tvCreate= findViewById(R.id.tvCreate)

        tvCreate.setOnClickListener{
            val intent = Intent(this, SignUpActivity::class.java)
            startActivity(intent)
        }
    }
}