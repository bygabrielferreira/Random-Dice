package com.example.jogardados

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    private var ultimoValor = -1
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val botao = findViewById<Button>(R.id.botao)
        val imagem = findViewById<ImageView>(R.id.imagem)
        val contaNumero = findViewById<TextView>(R.id.contaNumero)
        botao.setOnClickListener {
            val valor = (1..6).random()
            contaNumero.text = getString(R.string.mostra_valor, valor)
            when (valor) {
                1 -> imagem.setImageResource(R.drawable.dice1)
                2 -> imagem.setImageResource(R.drawable.dice2)
                3 -> imagem.setImageResource(R.drawable.dice3)
                4 -> imagem.setImageResource(R.drawable.dice4)
                5 -> imagem.setImageResource(R.drawable.dice5)
                6 -> imagem.setImageResource(R.drawable.dice6)
            }

            if(valor == ultimoValor){
                val intent = Intent(this, RepeatedNumberActivity::class.java)
                intent.putExtra("number", valor)
                startActivities(arrayOf(intent))
            }
            ultimoValor = valor
        }
    }
}