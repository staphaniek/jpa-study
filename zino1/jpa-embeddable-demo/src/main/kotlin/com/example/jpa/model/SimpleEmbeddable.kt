package com.example.jpa.model

import javax.persistence.Column
import javax.persistence.Embeddable
import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.Id

@Entity(name = "Book")
class Book {
    @Id
    @GeneratedValue
    private val id: Long? = null

    private val title: String? = null

    private val author: String? = null

    private val publisher: Publisher? = null
}

@Embeddable
class Publisher {

    @Column(name = "publisher_name")
    private val name: String? = null

    @Column(name = "publisher_country")
    private val country: String? = null
}