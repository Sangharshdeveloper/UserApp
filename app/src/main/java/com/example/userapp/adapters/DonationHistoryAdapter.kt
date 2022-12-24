package com.example.userapp.adapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.userapp.R
import com.example.userapp.models.HelpingModel

class DonationHistoryAdapter (var list: ArrayList<HelpingModel>) : RecyclerView.Adapter<DonationHistoryAdapter.viewHolder>(){


    class viewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): viewHolder {

        return viewHolder(LayoutInflater.from(parent.context).inflate(R.layout.item_donation_history,parent,false))

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