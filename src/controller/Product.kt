package com.server.controller

import io.ktor.application.*
import io.ktor.http.*
import io.ktor.response.*
import io.ktor.routing.*

import com.server.models.getProductById

fun Route.getProductById() {
    get("/products/{id}") {
        val productId = call.parameters["id"]
        if (productId == "") { // probably would want to handle this better
            call.respondText("401", contentType = ContentType.Text.Plain)
        }

        val product = getProductById(productId!!) // naturally would serialize this
        call.respondText("Product: $product", contentType = ContentType.Text.Plain)
    }
}