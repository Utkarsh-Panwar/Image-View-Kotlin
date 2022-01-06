package com.example.imageview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView

class MainActivity : AppCompatActivity() {

    lateinit var image:ImageView
    lateinit var button: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        image=findViewById(R.id.imageView)
        button=findViewById(R.id.button)

        button.setOnClickListener {
            image.setImageResource(R.drawable.image3)
        }
    }
}