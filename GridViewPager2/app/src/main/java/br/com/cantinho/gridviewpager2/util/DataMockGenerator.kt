package br.com.cantinho.gridviewpager2.util

import br.com.cantinho.gridviewpager2.model.Category
import br.com.cantinho.gridviewpager2.model.CategoryContainer
import kotlin.random.Random

object DataMockGenerator {

    fun generateCategories(): List<CategoryContainer> {
        val containers = mutableListOf<CategoryContainer>()
        if(Random.nextBoolean()) {
            // 1x1
            for(i in 1..25){
                containers.add(CategoryContainer(listOf(Category(i, ('A'.plus(i)).toString()))))
            }
        } else {
            // 3x3
            var counter: Int = 0
            for(i in 1..25){
                containers.add(CategoryContainer(listOf(
                    Category(i, counter++.toString()),
                    Category(i, counter++.toString()),
                    Category(i, counter++.toString()),
                    Category(i, counter++.toString()),
                    Category(i, counter++.toString()),
                    Category(i, counter++.toString()),
                    Category(i, counter++.toString()),
                    Category(i, counter++.toString()),
                    Category(i, counter++.toString())
                )))
            }
        }
        return containers
    }



}