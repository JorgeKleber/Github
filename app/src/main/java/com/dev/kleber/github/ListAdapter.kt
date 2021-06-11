package com.dev.kleber.github

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class ListAdapter(
    val list : List<String>,
    val callback: ItemClickCallback
) : RecyclerView.Adapter<MyViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.cell_text, parent,false)
        return  MyViewHolder(view)
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        holder.bind(list[position])

        holder.itemView.setOnClickListener{
            callback.itemClick(position)
        }
    }
    override fun getItemCount() = list.size
}

class MyViewHolder(itemView : View) : RecyclerView.ViewHolder(itemView) {
    fun bind(text: String) {
        itemView.findViewById<TextView>(R.id.text).text = text
    }
}