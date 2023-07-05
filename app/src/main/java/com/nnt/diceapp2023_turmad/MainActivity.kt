package com.nnt.diceapp2023_turmad

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import androidx.core.splashscreen.SplashScreen.Companion.installSplashScreen
import com.google.android.material.chip.ChipGroup

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        installSplashScreen()
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val texto = findViewById<TextView>(R.id.textoView)
        val botao = findViewById<Button>(R.id.botao)
        val grupoDeDados = findViewById<ChipGroup>(R.id.chipGroup)
        val imagem = findViewById<ImageView>(R.id.imageView)

        botao.setOnClickListener {lancarDado(texto, grupoDeDados, imagem)}
    }

    private fun lancarDado(texto: TextView, grupoDeDados: ChipGroup, imagem: ImageView) {
        val faceSorteada: Int
        when(grupoDeDados.checkedChipId) {
            R.id.d4 -> {
               faceSorteada = (1..4).random()
                when(faceSorteada) {
                    1 -> imagem.setImageResource(R.drawable.d4_1)
                    2 -> imagem.setImageResource(R.drawable.d4_2)
                    3 -> imagem.setImageResource(R.drawable.d4_3)
                    4 -> imagem.setImageResource(R.drawable.d4_4)
                }
                texto.text = faceSorteada.toString()
            }
            R.id.d6 -> {
                faceSorteada = (1..6).random()
                when(faceSorteada) {
                    1 -> imagem.setImageResource(R.drawable.d6_1)
                    2 -> imagem.setImageResource(R.drawable.d6_2)
                    3 -> imagem.setImageResource(R.drawable.d6_3)
                    4 -> imagem.setImageResource(R.drawable.d6_4)
                    5 -> imagem.setImageResource(R.drawable.d6_5)
                    6 -> imagem.setImageResource(R.drawable.d6_6)
                }
                texto.text = faceSorteada.toString()
            }
            R.id.d8 -> {
                faceSorteada = (1..8).random()
                when(faceSorteada) {
                    1 -> imagem.setImageResource(R.drawable.d8_1)
                    2 -> imagem.setImageResource(R.drawable.d8_2)
                    3 -> imagem.setImageResource(R.drawable.d8_3)
                    4 -> imagem.setImageResource(R.drawable.d8_4)
                    5 -> imagem.setImageResource(R.drawable.d8_5)
                    6 -> imagem.setImageResource(R.drawable.d8_6)
                    7 -> imagem.setImageResource(R.drawable.d8_7)
                    8 -> imagem.setImageResource(R.drawable.d8_8)
                }
                texto.text = faceSorteada.toString()
            }
            R.id.d10 -> {
                faceSorteada = (1..10).random()
                when(faceSorteada) {
                    1 -> imagem.setImageResource(R.drawable.d10_1)
                    2 -> imagem.setImageResource(R.drawable.d10_2)
                    3 -> imagem.setImageResource(R.drawable.d10_3)
                    4 -> imagem.setImageResource(R.drawable.d10_4)
                    5 -> imagem.setImageResource(R.drawable.d10_5)
                    6 -> imagem.setImageResource(R.drawable.d10_6)
                    7 -> imagem.setImageResource(R.drawable.d10_7)
                    8 -> imagem.setImageResource(R.drawable.d10_8)
                    9 -> imagem.setImageResource(R.drawable.d10_9)
                    10 -> imagem.setImageResource(R.drawable.d10_10)
                }
                texto.text = faceSorteada.toString()
            }
            R.id.d12 -> {
                faceSorteada = (1..12).random()
                when(faceSorteada) {
                    1 -> imagem.setImageResource(R.drawable.d12_1)
                    2 -> imagem.setImageResource(R.drawable.d12_2)
                    3 -> imagem.setImageResource(R.drawable.d12_3)
                    4 -> imagem.setImageResource(R.drawable.d12_4)
                    5 -> imagem.setImageResource(R.drawable.d12_5)
                    6 -> imagem.setImageResource(R.drawable.d12_6)
                    7 -> imagem.setImageResource(R.drawable.d12_7)
                    8 -> imagem.setImageResource(R.drawable.d12_8)
                    9 -> imagem.setImageResource(R.drawable.d12_9)
                    10 -> imagem.setImageResource(R.drawable.d12_10)
                    11 -> imagem.setImageResource(R.drawable.d12_11)
                    12 -> imagem.setImageResource(R.drawable.d12_12)
                }
                texto.text = faceSorteada.toString()
            }
            R.id.d20 -> {
                faceSorteada = (1..20).random()
                when(faceSorteada) {
                    1 -> imagem.setImageResource(R.drawable.d20_1)
                    2 -> imagem.setImageResource(R.drawable.d20_2)
                    3 -> imagem.setImageResource(R.drawable.d20_3)
                    4 -> imagem.setImageResource(R.drawable.d20_4)
                    5 -> imagem.setImageResource(R.drawable.d20_5)
                    6 -> imagem.setImageResource(R.drawable.d20_6)
                    7 -> imagem.setImageResource(R.drawable.d20_7)
                    8 -> imagem.setImageResource(R.drawable.d20_8)
                    9 -> imagem.setImageResource(R.drawable.d20_9)
                    10 -> imagem.setImageResource(R.drawable.d20_10)
                    11 -> imagem.setImageResource(R.drawable.d20_11)
                    12 -> imagem.setImageResource(R.drawable.d20_12)
                    13 -> imagem.setImageResource(R.drawable.d20_13)
                    14 -> imagem.setImageResource(R.drawable.d20_14)
                    15 -> imagem.setImageResource(R.drawable.d20_15)
                    16 -> imagem.setImageResource(R.drawable.d20_16)
                    17 -> imagem.setImageResource(R.drawable.d20_17)
                    18 -> imagem.setImageResource(R.drawable.d20_18)
                    19 -> imagem.setImageResource(R.drawable.d20_19)
                    20 -> imagem.setImageResource(R.drawable.d20_20)
                }
                texto.text = faceSorteada.toString()
            }
        }
    }

}