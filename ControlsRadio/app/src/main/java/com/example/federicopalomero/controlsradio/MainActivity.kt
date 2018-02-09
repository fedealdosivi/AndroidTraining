package com.example.federicopalomero.controlsradio

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnAccept.setOnClickListener{
            if (rbtn1.isChecked)
                txtResult.text = "Resultado: ${txtValue1.text.toString().toInt() + txtValue2.text.toString().toInt()}"
            if (rbtn2.isChecked)
                txtResult.text = "Resultado: ${txtValue1.text.toString().toInt() - txtValue2.text.toString().toInt()}"
        }
    }
}
