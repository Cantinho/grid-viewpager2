package br.com.cantinho.gridviewpager2.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import br.com.cantinho.gridviewpager2.R
import br.com.cantinho.gridviewpager2.model.Category
import kotlinx.android.synthetic.main.item_category.view.*

class CategoryViewHolder constructor(itemView: View) :
    RecyclerView.ViewHolder(itemView) {
    constructor(parent: ViewGroup) :
            this(LayoutInflater.from(parent.context).inflate(R.layout.item_category, parent, false))
    fun bind(category: Category) {
        itemView.tvCategoryName.text = category.name
    }
}