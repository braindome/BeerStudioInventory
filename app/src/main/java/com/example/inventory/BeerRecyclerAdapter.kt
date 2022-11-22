package com.example.inventory

import android.annotation.SuppressLint
import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.Recycler

class BeerRecyclerAdapter(val context : Context, val catalogue : List<Beer>) : RecyclerView.Adapter<BeerRecyclerAdapter.ViewHolder>(){

    //Creates an object that creates a view from an xml
    var layoutInflater = LayoutInflater.from(context)

    //Creates all the views that are inside the viewHolder by using an inflater.
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val itemView = layoutInflater.inflate(R.layout.item_layout, parent, false)

        return ViewHolder(itemView)
    }

    @SuppressLint("SetTextI18n")
    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val beer = DataManager.catalogue[position]

        holder.nameTextView.text = beer.name
        holder.typeTextView.text = beer.type
        holder.coverImage.setImageResource(beer.cover)
        holder.priceTextView.text = beer.price.toString() + "0 kr"
    }

    //List's length
    override fun getItemCount(): Int {
        return DataManager.catalogue.size
    }

    //Encapsules the view that shows the beer
    inner class ViewHolder(itemView : View) : RecyclerView.ViewHolder(itemView) {
        val nameTextView = itemView.findViewById<TextView>(R.id.nameTextView)
        val typeTextView = itemView.findViewById<TextView>(R.id.typeTextView)
        val coverImage = itemView.findViewById<ImageView>(R.id.coverImage)
        val priceTextView = itemView.findViewById<TextView>(R.id.priceTextView)

    }
}