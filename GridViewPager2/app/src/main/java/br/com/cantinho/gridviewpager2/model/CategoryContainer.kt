package br.com.cantinho.gridviewpager2.model

class CategoryContainer(val categories: List<Category>) {

    private val size = categories.size

    fun size(): Int {
        return size
    }

}