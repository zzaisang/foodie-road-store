package com.foodieroad.store.router

import com.foodieroad.store.handler.CommonApiHandler
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import org.springframework.web.reactive.function.server.router

/**
 * @author zzai_sang
 * @version 0.1.0
 * @since 2022/05/14
 */
@Configuration
class CommonApiRouter(private val commonApiRouter: CommonApiHandler) {

    @Bean
    fun routeFunction() = router {
                GET("/public/store/source", commonApiRouter::findAll)
        }

}