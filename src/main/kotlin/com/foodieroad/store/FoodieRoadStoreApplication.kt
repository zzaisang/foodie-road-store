package com.foodieroad.store

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.context.properties.ConfigurationPropertiesScan
import org.springframework.boot.runApplication

@SpringBootApplication
@ConfigurationPropertiesScan
class FoodieRoadStoreApplication

fun main(args: Array<String>) {
	runApplication<FoodieRoadStoreApplication>(*args)
}
