package br.com.cantinho.gridviewpager2.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import br.com.cantinho.gridviewpager2.R
import br.com.cantinho.gridviewpager2.model.CategoryContainer
import kotlinx.android.synthetic.main.item_category_container_3x3.view.*

class CategoryContainer3X3ViewHolder constructor(itemView: View) :
    CategoryContainerViewHolder(itemView) {
    constructor(parent: ViewGroup) :
            this(LayoutInflater.from(parent.context).inflate(R.layout.item_category_container_3x3, parent, false))

    override fun bind(categoryContainer: CategoryContainer) {
        itemView.item01.text = categoryContainer.categories[0].name
        itemView.item02.text = categoryContainer.categories[1].name
        itemView.item03.text = categoryContainer.categories[2].name
        itemView.item04.text = categoryContainer.categories[3].name
        itemView.item05.text = categoryContainer.categories[4].name
        itemView.item06.text = categoryContainer.categories[5].name
        itemView.item07.text = categoryContainer.categories[6].name
        itemView.item08.text = categoryContainer.categories[7].name
        itemView.item09.text = categoryContainer.categories[8].name
    }
}