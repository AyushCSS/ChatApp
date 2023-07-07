package com.example.etiquette.activities

import android.content.Intent
import android.os.Bundle
import android.os.PersistableBundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.example.etiquette.R

class SignUpActivity : AppCompatActivity() {
    private lateinit var edtNane: EditText
    private lateinit var edtEmail: EditText
    private lateinit var edtPassword: EditText
    private lateinit var edtConfirmPassword: EditText
    private lateinit var btnSignUp: Button
    private lateinit var tvLogIn: TextView

    override fun onCreate(savedInstanceState: Bundle?, persistentState: PersistableBundle?) {
        super.onCreate(savedInstanceState, persistentState)
        setContentView(R.layout.activity_sign_up)

        edtEmail = findViewById(R.id.edt_email)
        edtNane = findViewById(R.id.edt_name)
        edtConfirmPassword = findViewById(R.id.edt_confirm_password)
        edtPassword = findViewById(R.id.edt_password)
        btnSignUp = findViewById(R.id.btnSignUp)
        tvLogIn = findViewById(R.id.tvLog_In)

        tvLogIn.setOnClickListener{
            val intent = Intent(this, SignInActivity::class.java)
            startActivity(intent)
        }
    }
}