package com.nnt.diceapp2023_turmad

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import com.nnt.diceapp2023_turmad.appusers.User
import com.nnt.diceapp2023_turmad.appusers.database.UsersDatabase
import com.nnt.diceapp2023_turmad.appusers.database.insertUser
import com.nnt.diceapp2023_turmad.databinding.ActivityRegisterBinding
import kotlin.math.log

class RegisterActivity : AppCompatActivity() {

    private lateinit var binding: ActivityRegisterBinding

    private lateinit var editTextName: EditText
    private lateinit var editTextEmail: EditText
    private lateinit var editTextPassword: EditText
    private lateinit var editTextConfirmPassword: EditText
    private lateinit var saveButton: Button

    private lateinit var database: UsersDatabase

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register)

        binding = ActivityRegisterBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.signInNavLink.setOnClickListener {
            val goToSignInScreenIntent = Intent(this, LoginActivity::class.java)
            startActivity(goToSignInScreenIntent)
        }

        editTextName = findViewById(R.id.name_edit_text)
        editTextEmail = findViewById(R.id.email_edit_text)
        editTextPassword = findViewById(R.id.password_edit_text)
        editTextConfirmPassword = findViewById(R.id.confirm_password_edit_text)
        saveButton = findViewById(R.id.signUpButton)

        database = UsersDatabase(this)

        saveButton.setOnClickListener{
            saveUser()
        }

    }

    private fun saveUser() {
        var validationCheck = true

        if (editTextPassword.text.toString() != editTextConfirmPassword.text.toString()) {
            Toast.makeText(this, "As senhas não coincidem", Toast.LENGTH_SHORT).show()
            validationCheck = false
        }

        if (validationCheck) {
            val user = User(
                editTextName.text.toString(),
                editTextEmail.text.toString(),
                editTextPassword.text.toString()
            )

            val idUser = database.insertUser(user)
            if (idUser == -1L) {
                Toast.makeText(this, "Ocorreu um erro ao tentar se cadastrar. Tente novamente mais tarde", Toast.LENGTH_SHORT).show()
            } else {
                Toast.makeText(this, "Cadastrado com sucesso!", Toast.LENGTH_SHORT).show()

                val goToSignInScreenIntent = Intent(this, LoginActivity::class.java)
                startActivity(goToSignInScreenIntent)
            }
        }
    }
}