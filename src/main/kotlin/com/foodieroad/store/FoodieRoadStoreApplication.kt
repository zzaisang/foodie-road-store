package com.foodieroad.store

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.context.properties.ConfigurationPropertiesScan
import org.springframework.boot.runApplication
import org.springframework.data.jpa.repository.config.EnableJpaRepositories
import org.springframework.data.r2dbc.repository.config.EnableR2dbcRepositories

@EnableR2dbcRepositories(basePackages = ["com.foodieroad.store.repository.reactive"])
@EnableJpaRepositories(basePackages = ["com.foodieroad.store.repository.jpa"])
@SpringBootApplication
@ConfigurationPropertiesScan
class FoodieRoadStoreApplication

fun main(args: Array<String>) {
	runApplication<FoodieRoadStoreApplication>(*args)
}
