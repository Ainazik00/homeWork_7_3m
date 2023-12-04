package com.example.homework_7_3m

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.homework_7_3m.databinding.ActivitySecondBinding

class SecondActivity : AppCompatActivity() {
    private lateinit var binding: ActivitySecondBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySecondBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val receiveData = intent.getStringExtra("key")
        binding.textFromMain.text = receiveData
    }
}