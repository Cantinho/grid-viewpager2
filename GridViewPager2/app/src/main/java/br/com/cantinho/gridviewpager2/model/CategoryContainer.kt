package br.com.cantinho.gridviewpager2.model

class CategoryContainer(private val categories: List<Category>) {

    private val size = categories.size

    fun size(): Int {
        return size
    }

    fun categories(): List<Category> {
        return categories
    }

    fun categoryAt(position: Int): Category {
        return categories[position]
    }

}