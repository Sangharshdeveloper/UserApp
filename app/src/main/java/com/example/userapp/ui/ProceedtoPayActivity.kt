package com.example.userapp.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.userapp.databinding.ActivityDonateNowBinding
import com.example.userapp.databinding.ActivityProceedtoPayBinding

class ProceedtoPayActivity : AppCompatActivity() {
    lateinit var binding: ActivityProceedtoPayBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityProceedtoPayBinding.inflate(layoutInflater)
        setContentView(binding.root)


    }
}