package com.example.jpa.model

import org.hibernate.annotations.Parent
import org.hibernate.annotations.Target
import javax.persistence.GeneratedValue
import javax.persistence.Embeddable
import javax.persistence.Embedded
import javax.persistence.Entity
import javax.persistence.Id

@Embeddable
class GPS {
    private val latitude: Double = 0.toDouble()

    private val longitude: Double = 0.toDouble()

    @Parent
    private val city: City? = null

    @Parent
    private val corporation: Corporation? = null
}

@Entity(name = "City")
class City {
    @Id
    @GeneratedValue
    private val id: Long? = null

    private val name: String? = null

    @Embedded
    @Target(GPS::class)
    private val coordinates: GPS? = null
}

@Entity(name = "Corporation")
class Corporation {
    @Id
    @GeneratedValue
    private val id: Long? = null

    private val name: String? = null

    private val workSpace: String? = null

    @Embedded
    @Target(GPS::class)
    private val coordinates: GPS? = null
}