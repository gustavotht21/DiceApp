package com.nnt.diceapp2023_turmad

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import com.nnt.diceapp2023_turmad.databinding.ActivityHomeBinding
import com.nnt.diceapp2023_turmad.databinding.ActivityLoginBinding

class HomeActivity : AppCompatActivity() {

    private lateinit var binding: ActivityHomeBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)
        replaceFragment(Profile())

        binding = ActivityHomeBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.bottomNavigationView.setOnItemSelectedListener {
            when (it.itemId) {
                R.id.home -> {
                    val goToSignUpScreenIntent = Intent(this, MainActivity::class.java)
                    startActivity(goToSignUpScreenIntent)
                }
                R.id.profile -> {replaceFragment(Profile())}
                R.id.settings -> {replaceFragment(Settings())}
            }

            true
        }
    }

    private fun replaceFragment(fragment: Fragment) {
        val fragmentManager = supportFragmentManager
        val fragmentTransaction = fragmentManager.beginTransaction()
        fragmentTransaction.replace(R.id.frame_layout,fragment)
        fragmentTransaction.commit()
    }
}