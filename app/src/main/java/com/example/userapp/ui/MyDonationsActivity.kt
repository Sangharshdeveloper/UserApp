package com.example.userapp.ui

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.userapp.adapters.DonationHistoryAdapter
import com.example.userapp.adapters.DonationsAdapters
import com.example.userapp.adapters.HelpingAdapters
import com.example.userapp.databinding.ActivityMyDonationsBinding
import com.example.userapp.models.HelpingModel

class MyDonationsActivity : AppCompatActivity() {
    lateinit var binding: ActivityMyDonationsBinding
    lateinit var adapters: DonationHistoryAdapter
    lateinit var list: ArrayList<HelpingModel>


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMyDonationsBinding.inflate(layoutInflater)
        setContentView(binding.root)



        setUpUi()


    }

    private fun setUpUi() {
        binding.rvDonationList.layoutManager = LinearLayoutManager(this)
        list = ArrayList()

        list.add(HelpingModel("",""))
        list.add(HelpingModel("",""))

        list.add(HelpingModel("",""))
        list.add(HelpingModel("",""))
        list.add(HelpingModel("",""))
        list.add(HelpingModel("",""))

        adapters = DonationHistoryAdapter(list)
        binding.rvDonationList.adapter = adapters

    }
}