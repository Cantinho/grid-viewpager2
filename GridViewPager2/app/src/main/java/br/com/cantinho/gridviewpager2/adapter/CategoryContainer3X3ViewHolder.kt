package br.com.cantinho.gridviewpager2.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import br.com.cantinho.gridviewpager2.R
import br.com.cantinho.gridviewpager2.model.CategoryContainer
import br.com.cantinho.gridviewpager2.model.nameIfNotEmpty
import br.com.cantinho.gridviewpager2.util.asSequence
import kotlinx.android.synthetic.main.item_category_container_3x3.view.*

class CategoryContainer3X3ViewHolder constructor(itemView: View) :
    CategoryContainerViewHolder(itemView) {
    constructor(parent: ViewGroup) :
            this(LayoutInflater.from(parent.context).inflate(R.layout.item_category_container_3x3, parent, false))

    /**
     * All ViewGroup's child items must be in expected order in xml file. Otherwise,
     * a map implementation must be implemented to run as expected.
     */
    private val ViewGroup.views: List<View>
        get() = asSequence().toList()

    override fun bind(categoryContainer: CategoryContainer) {
        itemView.container.views.forEachIndexed { index, view ->
            if(view is TextView && index < categoryContainer.size()) {
                view.text = categoryContainer.categoryAt(index).nameIfNotEmpty()
            }
        }
    }
}