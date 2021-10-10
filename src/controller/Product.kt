package com.server.controller

import io.ktor.application.*
import io.ktor.http.*
import io.ktor.response.*
import io.ktor.routing.*

fun Route.getProductById() {
    get("/products/{id}") {
        val productId = call.parameters["id"]
        call.respondText("Product: $productId", contentType = ContentType.Text.Plain)
    }
}