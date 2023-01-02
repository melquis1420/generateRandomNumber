package com.example.sorteio

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import kotlin.random.Random

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        jogar()


    }

    fun jogar(){
        val jogar:Button = findViewById<Button>(R.id.btnJogar)
        var saida:TextView = findViewById(R.id.txtSaida)
        jogar.setOnClickListener(View.OnClickListener {
            var x = Random.nextInt(11)
           saida.setText("O numero selecionado foi: " + x)

        })
    }

}