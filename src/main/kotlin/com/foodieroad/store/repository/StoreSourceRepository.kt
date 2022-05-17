package com.foodieroad.store.repository

import com.foodieroad.store.domain.store.StoreSource
import org.springframework.data.mongodb.repository.ReactiveMongoRepository

/**
 * @author zzai_sang
 * @version 0.1.0
 * @since 2022/05/17
 */
interface StoreSourceRepository : ReactiveMongoRepository<StoreSource,String> {
}