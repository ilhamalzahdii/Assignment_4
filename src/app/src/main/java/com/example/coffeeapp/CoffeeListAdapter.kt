package com.example.coffeeapp

import android.content.Context
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.cardview.widget.CardView
import androidx.navigation.findNavController
import androidx.recyclerview.widget.RecyclerView
import com.example.coffeeapp.model.Coffee

class CoffeeListAdapter(private val context: Context, private val dataset: List<Coffee>) : RecyclerView.Adapter<CoffeeListAdapter.ItemViewHolder>() {

    class ItemViewHolder(val view: View) : RecyclerView.ViewHolder(view) {
        val itemName : TextView = view.findViewById(R.id.item_name)
        val shortDescription : TextView = view.findViewById(R.id.item_shortdescription)
        val itemImage : ImageView = view.findViewById(R.id.item_image)
        val cardView : CardView = view.findViewById(R.id.coffee_card_view)

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ItemViewHolder {
        val adapterLayout = LayoutInflater.from(parent.context).inflate(R.layout.coffee_item, parent, false)
        return ItemViewHolder(adapterLayout)
    }

    override fun onBindViewHolder(holder: ItemViewHolder, position: Int) {
        val item = dataset[position]
        val coffeeData = context.resources.getStringArray(item.ResourceId)
        holder.itemName.text = coffeeData[0]
        holder.shortDescription.text = coffeeData[1]
        holder.itemImage.setImageResource(item.imageResourceId)
        holder.cardView.setOnClickListener {
            val action = CoffeeListDirections.actionCoffeeListToCoffeeDetails(index = position, name = coffeeData[0])
            holder.view.findNavController().navigate(action)
        }

    }

    override fun getItemCount(): Int {
        return dataset.size
    }
}