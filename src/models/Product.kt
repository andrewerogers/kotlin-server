package com.server.models

data class Product(
    val id: String,
    val type: String
)

fun getProductById(id: String): Product? {
    Thread.sleep(100)
    System.out.println("Querying product $id")
    return Product(id, "fashion")
}