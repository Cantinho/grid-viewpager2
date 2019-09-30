package br.com.cantinho.gridviewpager2.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import br.com.cantinho.gridviewpager2.R
import br.com.cantinho.gridviewpager2.model.CategoryContainer
import kotlinx.android.synthetic.main.item_category_container_1x1.view.item01

class CategoryContainer1X1ViewHolder constructor(itemView: View) :
    CategoryContainerViewHolder(itemView) {
    constructor(parent: ViewGroup) :
            this(LayoutInflater.from(parent.context).inflate(R.layout.item_category_container_1x1, parent, false))

    override fun bind(categoryContainer: CategoryContainer) {
        itemView.item01.text = categoryContainer.categories[0].name
    }
}