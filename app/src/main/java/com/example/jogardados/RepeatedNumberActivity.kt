package com.example.jogardados

import android.animation.Animator
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.isVisible
import com.airbnb.lottie.LottieAnimationView

class RepeatedNumberActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_repeated_number)
        val number = findViewById<TextView>(R.id.repeatend_number)
        val argument = intent.getIntExtra("number", -1)
        number.text = getString(R.string.valor_repetido, argument)
        var imagem1 = findViewById<ImageView>(R.id.imagem)
        var animation_lottie = findViewById<LottieAnimationView>(R.id.animationView)
        var valor = argument
        imagem1.isVisible = false
        when (valor) {
            1 -> imagem1.setImageResource(R.drawable.dice1)
            2 -> imagem1.setImageResource(R.drawable.dice2)
            3 -> imagem1.setImageResource(R.drawable.dice3)
            4 -> imagem1.setImageResource(R.drawable.dice4)
            5 -> imagem1.setImageResource(R.drawable.dice5)
            6 -> imagem1.setImageResource(R.drawable.dice6)
        }
        animation_lottie.addAnimatorListener(object : Animator.AnimatorListener{
            override fun onAnimationStart(p0: Animator) {

            }

            override fun onAnimationEnd(p0: Animator) {
                animation_lottie.isVisible = false
                imagem1.isVisible = true
            }

            override fun onAnimationCancel(p0: Animator) {

            }

            override fun onAnimationRepeat(p0: Animator) {

            }

        })
    }
}