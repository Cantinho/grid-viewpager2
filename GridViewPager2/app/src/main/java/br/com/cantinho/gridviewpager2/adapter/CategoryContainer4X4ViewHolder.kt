package br.com.cantinho.gridviewpager2.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import br.com.cantinho.gridviewpager2.R
import br.com.cantinho.gridviewpager2.model.CategoryContainer
import br.com.cantinho.gridviewpager2.model.nameIfNotEmpty
import kotlinx.android.synthetic.main.item_category_container_4x4.view.*

class CategoryContainer4X4ViewHolder constructor(itemView: View) :
    CategoryContainerViewHolder(itemView) {
    constructor(parent: ViewGroup) :
            this(LayoutInflater.from(parent.context).inflate(R.layout.item_category_container_4x4, parent, false))

    override fun bind(categoryContainer: CategoryContainer) {
        itemView.item01.text = categoryContainer.categories[0].nameIfNotEmpty()
        itemView.item02.text = categoryContainer.categories[1].nameIfNotEmpty()
        itemView.item03.text = categoryContainer.categories[2].nameIfNotEmpty()
        itemView.item04.text = categoryContainer.categories[3].nameIfNotEmpty()
        itemView.item05.text = categoryContainer.categories[4].nameIfNotEmpty()
        itemView.item06.text = categoryContainer.categories[5].nameIfNotEmpty()
        itemView.item07.text = categoryContainer.categories[6].nameIfNotEmpty()
        itemView.item08.text = categoryContainer.categories[7].nameIfNotEmpty()
        itemView.item09.text = categoryContainer.categories[8].nameIfNotEmpty()
        itemView.item10.text = categoryContainer.categories[9].nameIfNotEmpty()
        itemView.item11.text = categoryContainer.categories[10].nameIfNotEmpty()
        itemView.item12.text = categoryContainer.categories[11].nameIfNotEmpty()
        itemView.item13.text = categoryContainer.categories[12].nameIfNotEmpty()
        itemView.item14.text = categoryContainer.categories[13].nameIfNotEmpty()
        itemView.item15.text = categoryContainer.categories[14].nameIfNotEmpty()
        itemView.item16.text = categoryContainer.categories[15].nameIfNotEmpty()
    }
}