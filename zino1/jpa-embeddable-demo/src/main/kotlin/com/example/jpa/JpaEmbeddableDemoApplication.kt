package com.example.jpa

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class JpaEmbeddableDemoApplication

fun main(args: Array<String>) {
	runApplication<JpaEmbeddableDemoApplication>(*args)
}
