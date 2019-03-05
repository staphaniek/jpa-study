package com.example.jpa.model

import org.hibernate.annotations.NaturalId
import javax.persistence.Embeddable
import javax.persistence.Entity
import javax.persistence.FetchType
import javax.persistence.GeneratedValue
import javax.persistence.Id
import javax.persistence.ManyToOne


@Entity(name = "Book")
class Book {
    @Id
    @GeneratedValue
    private val id: Long? = null

    private val title: String? = null

    private val author: String? = null

    private val ebookPublisher: Publisher? = null

    private val paperBackPublisher: Publisher? = null
}

@Embeddable
class Publisher {

    private val name: String? = null

    @ManyToOne(fetch = FetchType.LAZY)
    private val country: Country? = null
}

@Entity(name = "Country")
class Country {
    @Id
    @GeneratedValue
    private val id: Long? = null

    @NaturalId
    private val name: String? = null
}

