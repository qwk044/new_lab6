package com.example.lab66

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView

class CountryAdapter(private val countryList: List<Country>) :
    RecyclerView.Adapter<CountryViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CountryViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.list_item_layout, parent, false)
        return CountryViewHolder(view)
    }

    override fun onBindViewHolder(holder: CountryViewHolder, position: Int) {
        val country = countryList[position]
        holder.countryNameView.text = country.countryName
        holder.populationView.text = "Population: ${country.population}"

        val imageId = holder.itemView.context.resources.getIdentifier(
            country.flagName, "mipmap", holder.itemView.context.packageName
        )
        holder.flagView.setImageResource(imageId)
    }

    override fun getItemCount() = countryList.size
}
