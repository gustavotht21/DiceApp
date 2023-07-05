package com.nnt.diceapp2023_turmad

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.nnt.diceapp2023_turmad.databinding.ActivityRegisterBinding

class RegisterActivity : AppCompatActivity() {

    private lateinit var binding: ActivityRegisterBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register)

        binding = ActivityRegisterBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.signInNavLink.setOnClickListener {
            val goToSignInScreenIntent = Intent(this, LoginActivity::class.java)
            startActivity(goToSignInScreenIntent)
        }
    }
}