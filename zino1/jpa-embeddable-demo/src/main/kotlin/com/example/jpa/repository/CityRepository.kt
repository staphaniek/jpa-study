package com.example.jpa.repository

import com.example.jpa.model.City
import org.springframework.data.repository.CrudRepository

interface CityRepository : CrudRepository<City, Int> {
}