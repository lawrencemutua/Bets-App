package com.example.betsapp.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.betsapp.R

class SafePicksAdapter(val context: Context, val FootballList: List<com.example.betsapp.models.Football>): RecyclerView.Adapter<SafePicksViewHolder> (){
    override fun getItemCount(): Int {
        return FootballList.size
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): SafePicksViewHolder {
        return SafePicksViewHolder(
            LayoutInflater.from(parent.context)
                .inflate(R.layout.safepicks_row, parent,false)
        )
    }

    override fun onBindViewHolder(holder: SafePicksViewHolder, position: Int) {
        val free = FootballList[position]
        holder.awayTeam.text = free.awayTeam
        holder.homeTeam.text = free.homeTeam
        holder.tip.text = free.tip
        holder.result.text = free.result
        holder.outCome.text = free.outCome
        holder.leagueTime.text = free.leagueTime
        Glide.with(context)
            .load(free.homeTeamImage)
            .into(holder.homeTeamImage)
        Glide.with(context)
            .load(free.awayTeamImage)
            .into(holder.awayTeamImage)
    }
}



class SafePicksViewHolder(view: View):RecyclerView.ViewHolder(view){
    val leagueTime: TextView = view.findViewById(R.id.leagueTime)
    val awayTeam: TextView = view.findViewById(R.id.awayTeam)
    val homeTeam: TextView = view.findViewById(R.id.homeTeam)
    val tip: TextView = view.findViewById(R.id.tip)
    val result: TextView = view.findViewById(R.id.result)
    val outCome: TextView = view.findViewById(R.id.outCome)
    val homeTeamImage: ImageView = view.findViewById(R.id.homeTeamImage)
    val awayTeamImage: ImageView = view.findViewById(R.id.awayTeamImage)

}