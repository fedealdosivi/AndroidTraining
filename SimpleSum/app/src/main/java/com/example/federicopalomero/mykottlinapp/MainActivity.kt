package com.example.federicopalomero.mykottlinapp

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnSum.setOnClickListener{
            val input1=txtValue1.text.toString().toInt()
            val input2=txtValue2.text.toString().toInt()
            txtResult.text="Resultado: ${(input1+input2).toString()}"
        }
    }
}
