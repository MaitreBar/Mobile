package com.example.maitreapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.maitreapp.databinding.ActivityFeedbackBinding
import com.example.maitreapp.databinding.ActivityLoginBinding

class Feedback : AppCompatActivity() {
    val binding by lazy {
        ActivityFeedbackBinding.inflate(layoutInflater)
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
    }
}