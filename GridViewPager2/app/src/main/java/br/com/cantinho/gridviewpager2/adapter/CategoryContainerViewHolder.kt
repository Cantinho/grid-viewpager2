package br.com.cantinho.gridviewpager2.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import br.com.cantinho.gridviewpager2.R
import br.com.cantinho.gridviewpager2.model.Category
import br.com.cantinho.gridviewpager2.model.CategoryContainer
import br.com.cantinho.gridviewpager2.util.asSequence
import kotlinx.android.synthetic.main.item_category.view.*

open class CategoryContainerViewHolder constructor(itemView: View) :
    RecyclerView.ViewHolder(itemView) {
    constructor(parent: ViewGroup) :
            this(LayoutInflater.from(parent.context).inflate(R.layout.item_category_container_1x1, parent, false))

    private val ViewGroup.views: List<View>
        get() = asSequence().toList()

    open fun bind(categoryContainer: CategoryContainer) {
        // It will be overrided
    }
}