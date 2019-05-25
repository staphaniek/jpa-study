package com.example.jpa.model

import java.io.Serializable
import java.util.*
import javax.persistence.Entity
import javax.persistence.Id
import javax.persistence.IdClass
import javax.persistence.GeneratedValue


@Entity(name = "SystemUser")
@IdClass(PK::class)
class SystemUser {

    @Id
    private var subsystem: String? = null

    @Id
    private var username: String? = null

    @Id
    @GeneratedValue
    private var registrationId: Int? = null

    private val name: String? = null

    var id: PK
        get() = PK(
                subsystem!!,
                username!!,
                registrationId
        )
        set(id) {
            this.subsystem = id.getSubsystem()
            this.username = id.getUsername()
            this.registrationId = id.getRegistrationId()
        }
}

class PK : Serializable {

    private var subsystem: String? = null

    private var username: String? = null

    private val registrationId: Int?

    constructor(subsystem: String, username: String, registrationId: Int?) {
        this.subsystem = subsystem
        this.username = username
        this.registrationId = registrationId
    }

    private constructor(registrationId: Int?) {
        this.registrationId = registrationId
    }

    override fun equals(o: Any?): Boolean {
        if (this === o) {
            return true
        }
        if (o == null || javaClass != o.javaClass) {
            return false
        }
        val pk = o as PK?
        return Objects.equals(subsystem, pk!!.subsystem) &&
                Objects.equals(username, pk.username) &&
                Objects.equals(registrationId, pk.registrationId)
    }

    override fun hashCode(): Int {
        return Objects.hash(subsystem, username, registrationId)
    }
}