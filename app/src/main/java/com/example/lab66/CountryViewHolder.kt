package com.example.lab66

import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class CountryViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
    val flagView: ImageView = itemView.findViewById(R.id.imageView_flag)
    val countryNameView: TextView = itemView.findViewById(R.id.textView_countryName)
    val populationView: TextView = itemView.findViewById(R.id.textView_population)
}

