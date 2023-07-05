package com.nnt.diceapp2023_turmad

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import androidx.core.splashscreen.SplashScreen.Companion.installSplashScreen
import com.google.android.material.chip.ChipGroup
import com.nnt.diceapp2023_turmad.databinding.ActivityHomeBinding
import com.nnt.diceapp2023_turmad.databinding.ActivityMainBinding
import com.nnt.diceapp2023_turmad.databinding.ActivityRegisterBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        installSplashScreen()
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.backButton.setOnClickListener {
            val goToSignInScreenIntent = Intent(this, HomeActivity::class.java)
            startActivity(goToSignInScreenIntent)
        }

        val texto = findViewById<TextView>(R.id.textoView)
        val botao = findViewById<Button>(R.id.botao)
        val grupoDeDados = findViewById<ChipGroup>(R.id.chipGroup)
        val imagem = findViewById<ImageView>(R.id.imageView)

        botao.setOnClickListener {lancarDado(texto, grupoDeDados, imagem)}
    }

    private fun lancarDado(texto: TextView, grupoDeDados: ChipGroup, imagem: ImageView) {

        when(grupoDeDados.checkedChipId) {
            R.id.d4 -> {
                imagem.setImageResource(renderData(4, texto))
            }
            R.id.d6 -> {
                imagem.setImageResource(renderData(6, texto))
            }
            R.id.d8 -> {
                imagem.setImageResource(renderData(8, texto))
            }
            R.id.d10 -> {
                imagem.setImageResource(renderData(10, texto))
            }
            R.id.d12 -> {
                imagem.setImageResource(renderData(12, texto))
            }
            R.id.d20 -> {
                imagem.setImageResource(renderData(20, texto))
            }
        }
    }
    private fun renderData(number:Int, text:TextView): Int {
        val faceSort = (1..number).random()
        val nomeArquivo = "d$number" + "_" + "$faceSort"
        val resourceId = resources.getIdentifier(nomeArquivo, "drawable", packageName)

        text.text = faceSort.toString()

        return resourceId
    }

}