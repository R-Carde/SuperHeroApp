package com.example.superheroapp
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.Adapter

class SuperHeroAdapter(var superheroList:List<SuperheroItemResponse> = emptyList()) :
    Adapter<SuperheroViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): SuperheroViewHolder {
        return SuperheroViewHolder(LayoutInflater.from(parent.context)
            .inflate(R.layout.item_superhero, parent,false))
    }

    fun updateList(superheroList:List<SuperheroItemResponse>){
        this.superheroList = superheroList
        notifyDataSetChanged()
    }

    override fun getItemCount() = superheroList.size


    override fun onBindViewHolder(viewholder: SuperheroViewHolder, position: Int) {
        viewholder.bind(superheroList[position])
    }
}