package br.com.cantinho.gridviewpager2.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import br.com.cantinho.gridviewpager2.R
import br.com.cantinho.gridviewpager2.model.CategoryContainer
import br.com.cantinho.gridviewpager2.model.nameIfNotEmpty
import kotlinx.android.synthetic.main.item_category_container_2x2.view.*

class CategoryContainer2X2ViewHolder constructor(itemView: View) :
    CategoryContainerViewHolder(itemView) {
    constructor(parent: ViewGroup) :
            this(LayoutInflater.from(parent.context).inflate(R.layout.item_category_container_2x2, parent, false))

    override fun bind(categoryContainer: CategoryContainer) {
        itemView.item01.text = categoryContainer.categories[0].nameIfNotEmpty()
        itemView.item02.text = categoryContainer.categories[1].nameIfNotEmpty()
        itemView.item03.text = categoryContainer.categories[2].nameIfNotEmpty()
        itemView.item04.text = categoryContainer.categories[3].nameIfNotEmpty()
    }
}