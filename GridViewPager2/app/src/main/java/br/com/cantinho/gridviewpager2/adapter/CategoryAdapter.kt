package br.com.cantinho.gridviewpager2.adapter

import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import br.com.cantinho.gridviewpager2.R
import br.com.cantinho.gridviewpager2.model.Category
import br.com.cantinho.gridviewpager2.model.CategoryContainer
import java.lang.IllegalArgumentException

class CategoryAdapter : RecyclerView.Adapter<CategoryContainerViewHolder>() {

    companion object {
        private const val VIEW_TYPE_1X1_CONTAINER = R.layout.item_category_container_1x1
        private const val VIEW_TYPE_3X3_CONTAINER  = R.layout.item_category_container_3x3
    }

    private var list: List<CategoryContainer> = listOf()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CategoryContainerViewHolder {
        return when(viewType) {
            VIEW_TYPE_1X1_CONTAINER -> CategoryContainer1X1ViewHolder(parent)
            VIEW_TYPE_3X3_CONTAINER -> CategoryContainer3X3ViewHolder(parent)
            else -> throw IllegalArgumentException("Unexpected view type $viewType")
        }
    }

    override fun onBindViewHolder(holder: CategoryContainerViewHolder, position: Int) {
        holder.bind(list[position])
    }

    fun setItem(list: List<CategoryContainer>) {
        this.list = list
        notifyDataSetChanged()
    }

    override fun getItemCount(): Int = list.size

    override fun getItemViewType(position: Int): Int {
        return when(list[position].size()) {
            1 -> VIEW_TYPE_1X1_CONTAINER
            9 -> VIEW_TYPE_3X3_CONTAINER
            else -> throw IllegalArgumentException("Unexpected view type at $position")
        }
    }
}