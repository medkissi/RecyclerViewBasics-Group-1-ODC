package com.medkissi.recyclerviewbasicsgroup1

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.Adapter


class AnimalAdapter(
    val data: List<Animal>,
    val listner:OnItemClickListner
    ) : Adapter<AnimalAdapter.AnimalViewHolder>() {

    inner class AnimalViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView.rootView) {
        val image = itemView.findViewById<ImageView>(R.id.img)
        val nom = itemView.findViewById<TextView>(R.id.tv_nom)
        val vitesse = itemView.findViewById<TextView>(R.id.tv_vitesse)
        init {
            itemView.setOnClickListener {
                if(adapterPosition != RecyclerView.NO_POSITION){}
                val animal = data.get(adapterPosition)
                listner.onClick(animal)
            }
        }

        fun bind(animal: Animal) {
            image.setImageResource(animal.image)
            nom.text = animal.nom
            vitesse.text = "${animal.vitesse} km/h"
        }


    }


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): AnimalViewHolder {

        val context = parent.context
        val inflater = LayoutInflater.from(context)
        val view = inflater.inflate(R.layout.item_list, parent, false)

        return AnimalViewHolder(view)

    }

    override fun getItemCount(): Int {
        return data.size
    }

    override fun onBindViewHolder(holder: AnimalViewHolder, position: Int) {
        val animal = data.get(position)
        holder.bind(animal)
    }


}

interface OnItemClickListner{
    fun onClick(animal:Animal)
}