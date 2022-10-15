package com.example.bitfit

import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.appcompat.view.menu.ActionMenuItemView
import androidx.appcompat.view.menu.MenuView
import androidx.recyclerview.widget.RecyclerView
import org.w3c.dom.Text

class BitFitAdapter(private val context: Context, private val bitFits: List<BitFit>):
    RecyclerView.Adapter<BitFitAdapter.ViewHolder>() {

    inner class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView){

        val foodView: TextView = itemView.findViewById(R.id.foodView)
        val calorieView: TextView = itemView.findViewById(R.id.calorieView)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(context).inflate(R.layout.item_bitfit, parent, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val bitFit = bitFits[position]
        holder.foodView.text = bitFit.food
        holder.calorieView.text = bitFit.calories
    }

    override fun getItemCount() = bitFits.size
}


