package br.com.cantinho.gridviewpager2.util

import br.com.cantinho.gridviewpager2.model.Category

object DataMockGenerator {

    fun generateCategories(): List<Category> {
        return listOf(
            Category(1, "Your Recording"),
            Category(2, "Film"),
            Category(3, "Series"),
            Category(4, "Kids"),
            Category(5, "Sport"))
    }



}