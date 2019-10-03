package br.com.cantinho.gridviewpager2.adapter

import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import br.com.cantinho.gridviewpager2.model.Category
import br.com.cantinho.gridviewpager2.model.CategoryContainer
import java.lang.IllegalArgumentException
import kotlin.math.ceil

class CategoryAdapter : RecyclerView.Adapter<CategoryContainerViewHolder>() {

    companion object {
        const val VIEW_TYPE_1X1_CONTAINER = 1
        const val VIEW_TYPE_2X2_CONTAINER = 2
        const val VIEW_TYPE_3X3_CONTAINER = 3
        const val VIEW_TYPE_4X4_CONTAINER = 4
    }

    private var containerType = VIEW_TYPE_2X2_CONTAINER
    private var list: List<Category> = listOf()
    private var _list: MutableList<CategoryContainer> = mutableListOf()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CategoryContainerViewHolder {
        return when(viewType) {
            VIEW_TYPE_1X1_CONTAINER -> CategoryContainer1X1ViewHolder(parent)
            VIEW_TYPE_2X2_CONTAINER -> CategoryContainer2X2ViewHolder(parent)
            VIEW_TYPE_3X3_CONTAINER -> CategoryContainer3X3ViewHolder(parent)
            VIEW_TYPE_4X4_CONTAINER -> CategoryContainer4X4ViewHolder(parent)
            else -> throw IllegalArgumentException("Unexpected view type $viewType")
        }
    }

    override fun onBindViewHolder(holder: CategoryContainerViewHolder, position: Int) {
        holder.bind(_list[position])
    }

    fun setItem(list: List<Category>) {
        this.list = list
        buildContainers()
        notifyDataSetChanged()
    }

    private fun buildContainers() {
        _list.clear()
        val containersSize = ceil( (1.0 * list.size) / (containerType*containerType) )
        var categoryCounter = 0
        for(i in 0 until containersSize.toInt()) {
            val categories = mutableListOf<Category>()
            for(e in 0 until containerType*containerType) {
                if(categoryCounter < list.size) {
                    categories.add(list[categoryCounter])
                } else {
                    categories.add(Category(id = i, name = "N:$categoryCounter", isEmpty = true))
                }
                categoryCounter++
            }
            _list.add(CategoryContainer(categories))
        }
    }

    fun setContainerType(type: Int) {
        containerType = when(type) {
            VIEW_TYPE_1X1_CONTAINER -> VIEW_TYPE_1X1_CONTAINER
            VIEW_TYPE_2X2_CONTAINER -> VIEW_TYPE_2X2_CONTAINER
            VIEW_TYPE_3X3_CONTAINER -> VIEW_TYPE_3X3_CONTAINER
            VIEW_TYPE_4X4_CONTAINER -> VIEW_TYPE_4X4_CONTAINER
            else -> throw IllegalArgumentException("Unexpected container type: $type")
        }
        buildContainers()
        notifyDataSetChanged()
    }

    override fun getItemCount(): Int = _list.size

    fun getValidItemCount(): Int = list.size

    override fun getItemViewType(position: Int): Int {
        return when(_list[position].size()) {
            1 -> VIEW_TYPE_1X1_CONTAINER
            4 -> VIEW_TYPE_2X2_CONTAINER
            9 -> VIEW_TYPE_3X3_CONTAINER
            16 -> VIEW_TYPE_4X4_CONTAINER
            else -> throw IllegalArgumentException("Unexpected view type at $position")
        }
    }
}