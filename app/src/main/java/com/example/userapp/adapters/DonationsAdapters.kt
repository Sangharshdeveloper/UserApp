package com.example.userapp.adapters

import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.ViewHolder
import com.example.userapp.R
import com.example.userapp.models.HelpingModel

class DonationsAdapters (var list: ArrayList<HelpingModel>) : RecyclerView.Adapter<DonationsAdapters.viewHolder>(){


    class viewHolder(itemView: View) : ViewHolder(itemView) {

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): viewHolder {

        return viewHolder(LayoutInflater.from(parent.context).inflate(R.layout.item_donate_now,parent,false))

    }

    override fun onBindViewHolder(holder: viewHolder, position: Int) {
        holder.itemView.setOnClickListener{
//            holder.itemView.context.startActivity(Intent(holder.itemView.context,VisitorInfoActivity::class.java))
        }
    }

    override fun getItemCount(): Int {
        return list.size
    }


}