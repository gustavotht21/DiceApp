package com.nnt.diceapp2023_turmad

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.core.splashscreen.SplashScreen.Companion.installSplashScreen
import com.nnt.diceapp2023_turmad.appusers.database.UsersDatabase
import com.nnt.diceapp2023_turmad.appusers.database.selectUser
import com.nnt.diceapp2023_turmad.databinding.ActivityLoginBinding

class LoginActivity : AppCompatActivity() {

    private lateinit var binding: ActivityLoginBinding
    private lateinit var editTextEmail: EditText
    private lateinit var editTextPassword: EditText
    private lateinit var signInButton: Button

    private lateinit var database: UsersDatabase

    override fun onCreate(savedInstanceState: Bundle?) {
        installSplashScreen()
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        binding = ActivityLoginBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.signUpNavLink.setOnClickListener {
            val goToSignUpScreenIntent = Intent(this, RegisterActivity::class.java)
            startActivity(goToSignUpScreenIntent)
        }

        editTextEmail = findViewById(R.id.email_edit_text)
        editTextPassword = findViewById(R.id.password_edit_text)
        signInButton = findViewById(R.id.signInButton)

        database = UsersDatabase(this)

        signInButton.setOnClickListener{
            login()
        }
    }

    private fun login() {
        val loginUser = database.selectUser(editTextEmail.text.toString(), editTextPassword.text.toString())

        if (loginUser) {
            editTextEmail.text.clear()
            editTextPassword.text.clear()

            val goToMainScreenIntent = Intent(this, MainActivity::class.java)
            startActivity(goToMainScreenIntent)
        } else {
            Toast.makeText(this, "Credenciais incorretas. Verifique se os dados inseridos estão corretos", Toast.LENGTH_SHORT).show()
        }
    }
}