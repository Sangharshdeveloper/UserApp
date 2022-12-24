package com.example.userapp.ui

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.userapp.databinding.ActivityThankyouBinding

class ThankyouActivity : AppCompatActivity() {
    lateinit var binding: ActivityThankyouBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityThankyouBinding.inflate(layoutInflater)
        setContentView(binding.root)





        binding.btnReturnHome.setOnClickListener{
            startActivity(Intent(this,MainActivity::class.java))
            finish()
        }

    }
}