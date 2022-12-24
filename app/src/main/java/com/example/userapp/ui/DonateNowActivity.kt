package com.example.userapp.ui

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.userapp.R
import com.example.userapp.databinding.ActivityDonateNowBinding

class DonateNowActivity : AppCompatActivity() {
    lateinit var binding: ActivityDonateNowBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityDonateNowBinding.inflate(layoutInflater)
        setContentView(binding.root)


        binding.btnDonateNow.setOnClickListener{
            startActivity(Intent(this,ThankyouActivity::class.java))
        }

    }
}