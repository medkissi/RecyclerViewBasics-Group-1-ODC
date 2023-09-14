package com.medkissi.recyclerviewbasicsgroup1

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.ViewHolder
import com.medkissi.recyclerviewbasicsgroupe2.model.President

class PresidentAdapter(
    val listner:OnPresidentClickListner
):ListAdapter<President,PresidentAdapter.PresidentViewHolder>(PresidentDiffUtils()) {

    inner class PresidentViewHolder(itemView: View) : ViewHolder(itemView.rootView) {

        val photo = itemView.findViewById<ImageView>(R.id.circleImageView)
        val nom = itemView.findViewById<TextView>(R.id.president_nom)
        val pays = itemView.findViewById<TextView>(R.id.president_pays)


        fun bind(president: President) {
            photo.setImageResource(president.photo)
            nom.text = president.nom
            pays.text = president.pays
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PresidentViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_list2,parent,false)

        return PresidentViewHolder(view)
    }

    override fun onBindViewHolder(holder: PresidentViewHolder, position: Int) {
        val president = getItem(position)
        holder.bind(president)
    }
}


class PresidentDiffUtils:DiffUtil.ItemCallback<President>(){
    override fun areItemsTheSame(oldItem: President, newItem: President): Boolean {
        return  oldItem.id == newItem.id

    }

    override fun areContentsTheSame(oldItem: President, newItem: President): Boolean {
        return  oldItem == newItem
    }

}

interface  OnPresidentClickListner{
    fun onClick(president: President)
}