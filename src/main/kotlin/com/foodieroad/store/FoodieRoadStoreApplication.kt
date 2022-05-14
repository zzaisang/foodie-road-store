package com.foodieroad.store

import com.foodieroad.store.properties.CommonApiProperties
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.context.properties.ConfigurationPropertiesScan
import org.springframework.boot.context.properties.EnableConfigurationProperties
import org.springframework.boot.runApplication

@SpringBootApplication
@ConfigurationPropertiesScan
class FoodieRoadStoreApplication

fun main(args: Array<String>) {
	runApplication<FoodieRoadStoreApplication>(*args)
}
