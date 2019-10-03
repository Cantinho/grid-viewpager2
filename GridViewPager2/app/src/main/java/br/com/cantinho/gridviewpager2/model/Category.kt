package br.com.cantinho.gridviewpager2.model

data class Category(val id: Int, val name: String, val isEmpty: Boolean = false)

fun Category.nameIfNotEmpty() : String {
    return if(this.isEmpty) {
        "Empty"
    } else {
        name
    }
}