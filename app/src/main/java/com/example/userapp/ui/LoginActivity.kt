package com.example.userapp.ui

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.example.userapp.databinding.ActivityLoginBinding

class LoginActivity : AppCompatActivity() {
    lateinit var binding: ActivityLoginBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityLoginBinding.inflate(layoutInflater)
        setContentView(binding.root)

        setUpUi()

    }

    private fun setUpUi() {

        binding.tvRegister.setOnClickListener(View.OnClickListener {
            binding.cardLogin.visibility = View.GONE
            binding.cardRegister.visibility = View.VISIBLE
        })

        binding.tvLogin.setOnClickListener(View.OnClickListener {
            binding.cardLogin.visibility = View.VISIBLE
            binding.cardRegister.visibility = View.GONE
        })

        binding.btnLogin.setOnClickListener{
            startActivity(Intent(this,MainActivity::class.java))
        }
    }
}