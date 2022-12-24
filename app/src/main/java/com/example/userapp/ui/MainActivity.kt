package com.example.userapp.ui

import android.R
import android.content.Intent
import android.os.Bundle
import android.view.MenuItem
import androidx.appcompat.app.ActionBarDrawerToggle
import androidx.appcompat.app.AppCompatActivity
import androidx.drawerlayout.widget.DrawerLayout
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.userapp.adapters.DonationsAdapters
import com.example.userapp.adapters.HelpingAdapters
import com.example.userapp.databinding.ActivityMainBinding
import com.example.userapp.models.HelpingModel


class MainActivity : AppCompatActivity() {
    var drawerLayout: DrawerLayout? = null
    var actionBarDrawerToggle: ActionBarDrawerToggle? = null
    lateinit var binding: ActivityMainBinding
    lateinit var list: ArrayList<HelpingModel>
    lateinit var list1: ArrayList<HelpingModel>
    lateinit var adapters: HelpingAdapters
    lateinit var donationAdapters: DonationsAdapters
//    lateinit var binding : binding


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)


        setUpUi()
    }

    private fun setUpUi() {
        // drawer and back button to close drawer
//        drawerLayout = binding.myDrawerLayout
//        actionBarDrawerToggle =
//            ActionBarDrawerToggle(this, drawerLayout, R.string.ok ,  R.string.ok)
//
//        // pass the Open and Close toggle for the drawer layout listener
//        // to toggle the button
//        drawerLayout!!.addDrawerListener(actionBarDrawerToggle!!)
//        actionBarDrawerToggle!!.syncState()




        binding.cardProfileView.setOnClickListener{
            startActivity(Intent(this,ProfileActivity::class.java))
        }
        // to make the Navigation drawer icon always appear on the action bar
//        supportActionBar!!.setDisplayHomeAsUpEnabled(true)

        binding.rvHelpingList.layoutManager = LinearLayoutManager(this)
        list = ArrayList()

        list.add(HelpingModel("",""))
        list.add(HelpingModel("",""))

        list.add(HelpingModel("",""))
        list.add(HelpingModel("",""))
        list.add(HelpingModel("",""))
        list.add(HelpingModel("",""))

        adapters = HelpingAdapters(list)
        binding.rvHelpingList.adapter = adapters


        binding.rvDonatersList.layoutManager = LinearLayoutManager(this,LinearLayoutManager.HORIZONTAL,false)
        list1 = ArrayList()

        list1.add(HelpingModel("",""))
        list1.add(HelpingModel("",""))

        list1.add(HelpingModel("",""))
        list1.add(HelpingModel("",""))
        list1.add(HelpingModel("",""))
        list1.add(HelpingModel("",""))

        donationAdapters = DonationsAdapters(list1)
        binding.rvDonatersList.adapter = donationAdapters

        binding.btnDonateNow.setOnClickListener{
//            drawerLayout!!.isActivated = true
            startActivity(Intent(this,DonateNowActivity::class.java))
        }

    }
//    override fun onOptionsItemSelected(item: MenuItem): Boolean {
//        return if (actionBarDrawerToggle!!.onOptionsItemSelected(item)) {
//            true
//        } else super.onOptionsItemSelected(item)
//    }
}