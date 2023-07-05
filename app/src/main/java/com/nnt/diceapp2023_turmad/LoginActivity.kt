package com.nnt.diceapp2023_turmad

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.core.splashscreen.SplashScreen.Companion.installSplashScreen
import com.nnt.diceapp2023_turmad.databinding.ActivityLoginBinding

class LoginActivity : AppCompatActivity() {

    private lateinit var binding: ActivityLoginBinding

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

        binding.signInButton.setOnClickListener {
            val goToMainScreenIntent = Intent(this, MainActivity::class.java)
            startActivity(goToMainScreenIntent)
        }
    }
}