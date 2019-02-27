package com.example.jpa.model

import javax.persistence.Embeddable

@Embeddable
class Publisher1 {

    private val name: String

    private val location: Location

    constructor(name: String, location: Location) {
        this.name = name
        this.location = location
    }
}

@Embeddable
class Location {

    private val country: String

    private val city: String

    constructor(country: String, city: String) {
        this.country = country
        this.city = city
    }
}