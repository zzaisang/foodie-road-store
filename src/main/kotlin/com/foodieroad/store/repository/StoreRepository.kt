package com.foodieroad.store.repository

import com.foodieroad.store.domain.store.Store
import org.springframework.data.r2dbc.repository.R2dbcRepository

/**
 * @author zzai_sang
 * @version 0.1.0
 * @since 2022/05/21
 */
interface StoreRepository : R2dbcRepository<Store,Long> {
}