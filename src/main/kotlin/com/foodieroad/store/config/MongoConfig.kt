package com.foodieroad.store.config

import com.foodieroad.store.repository.LocalData072404ResultRepository
import com.mongodb.reactivestreams.client.MongoClients
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import org.springframework.data.mongodb.config.AbstractReactiveMongoConfiguration
import org.springframework.data.mongodb.core.ReactiveMongoTemplate
import org.springframework.data.mongodb.repository.config.EnableReactiveMongoRepositories

/**
 * @author zzai_sang
 * @version 0.1.0
 * @since 2022/05/19
 */
@Configuration
@EnableReactiveMongoRepositories(
    basePackageClasses = arrayOf(LocalData072404ResultRepository::class)
)
class MongoConfig : AbstractReactiveMongoConfiguration(){

    override fun getDatabaseName() = "foodieRoad"

    override fun reactiveMongoClient() = mongoClient()

    @Bean
    fun mongoClient() = MongoClients.create()

    @Bean
    fun reactiveMongoTemplate() = ReactiveMongoTemplate(mongoClient(), databaseName)
}