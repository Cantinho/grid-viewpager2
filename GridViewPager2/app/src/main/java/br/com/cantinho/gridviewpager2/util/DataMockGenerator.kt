package br.com.cantinho.gridviewpager2.util

import br.com.cantinho.gridviewpager2.model.Category

object DataMockGenerator {

    fun generateCategories(): List<Category> {
        val categories = mutableListOf<Category>()
        for ((counter, i) in (1..25).withIndex()) {
            categories.add(Category(i, i.toString()))
        }
        return categories
    }

}