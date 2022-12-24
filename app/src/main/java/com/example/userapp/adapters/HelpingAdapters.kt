package com.example.userapp.adapters

import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.ViewHolder
import com.example.userapp.R
import com.example.userapp.models.HelpingModel
import com.example.userapp.ui.MyDonationsActivity

class HelpingAdapters (var list: ArrayList<HelpingModel>) : RecyclerView.Adapter<HelpingAdapters.viewHolder>(){


    class viewHolder(itemView: View) : ViewHolder(itemView) {

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): viewHolder {

        return viewHolder(LayoutInflater.from(parent.context).inflate(R.layout.item_helping,parent,false))

    }

    override fun onBindViewHolder(holder: viewHolder, position: Int) {
        holder.itemView.setOnClickListener{
            holder.itemView.context.startActivity(Intent(holder.itemView.context,MyDonationsActivity::class.java))
        }
    }

    override fun getItemCount(): Int {
        return list.size
    }


}