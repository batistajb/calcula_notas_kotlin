package com.example.calculanotas

import android.annotation.SuppressLint
import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val btnCalcula = button_calcula
        val resultado = resultado

        btnCalcula.setOnClickListener {
            val nota1 :Int = Integer.parseInt(input_nota.text.toString())
            val nota2 :Int = Integer.parseInt(input_nota2.text.toString())
            val faltas :Int = Integer.parseInt(input_faltas.text.toString())
            val media :Int = (nota1 + nota2)/2

            if(media >= 6 && faltas <= 10) {
                resultado.setText("Aluno foi APROVADO\nNota Final: $media\nFaltas: $faltas")
                resultado.setTextColor(Color.GREEN)
            }
            else {
                resultado.setText("Aluno foi REPROVADO\nNota Final: $media\nFaltas: $faltas")
                resultado.setTextColor(Color.RED)
            }
        }
    }
}