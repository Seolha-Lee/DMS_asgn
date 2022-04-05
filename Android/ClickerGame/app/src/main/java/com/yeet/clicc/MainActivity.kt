package com.yeet.clicc

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    lateinit var plus: Button
    lateinit var minus: Button
    lateinit var reset: Button
    lateinit var result: TextView

    var a: Int = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        plus = findViewById(R.id.bt_plus)
        minus = findViewById(R.id.bt_minus)
        reset = findViewById(R.id.bt_zero)
        result = findViewById(R.id.tvResult)

        result.text = a.toString()

        plus.setOnClickListener{
            a = result.text.toString().toInt()
            a += 1
            result.text = a.toString()
        }

        minus.setOnClickListener{
            a = result.text.toString().toInt()
            a -= 1
            result.text = a.toString()
        }

        reset.setOnClickListener{
            a = result.text.toString().toInt()
            a = 0
            result.text = a.toString()
        }
    }
}