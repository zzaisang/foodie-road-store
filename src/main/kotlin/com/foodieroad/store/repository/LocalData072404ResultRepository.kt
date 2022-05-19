package com.foodieroad.store.repository

import com.foodieroad.store.domain.payload.LocalData072404Result
import org.springframework.data.mongodb.repository.ReactiveMongoRepository

/**
 * @author zzai_sang
 * @version 0.1.0
 * @since 2022/05/20
 */
interface LocalData072404ResultRepository : ReactiveMongoRepository<LocalData072404Result, Long> {
}