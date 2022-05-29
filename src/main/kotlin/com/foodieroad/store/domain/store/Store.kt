package com.foodieroad.store.domain.store

import org.springframework.data.annotation.Id
import javax.persistence.Entity

/**
 * @author zzai_sang
 * @version 0.1.0
 * @since 2022/05/21
 */
@Entity
class Store (
    @javax.persistence.Id
    var id:Long
        ){


}