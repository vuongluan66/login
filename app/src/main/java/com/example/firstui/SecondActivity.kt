package com.example.firstui

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.firstui.databinding.ActivitySecondBinding

class SecondActivity : AppCompatActivity() {
    private lateinit var binding: ActivitySecondBinding

    override fun onCreate(savedInstanceState: Bundle?) {

        binding = ActivitySecondBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        binding.arrowLeft.setOnClickListener {
            intent = Intent(this, MainActivity::class.java)
            startActivity(intent)

        }
    }
}