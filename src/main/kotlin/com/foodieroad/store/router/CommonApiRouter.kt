package com.foodieroad.store.router

import com.foodieroad.store.handler.CommonApiHandler
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import org.springframework.web.reactive.function.server.RequestPredicates.path
import org.springframework.web.reactive.function.server.RouterFunctions.nest
import org.springframework.web.reactive.function.server.router

/**
 * @author zzai_sang
 * @version 0.1.0
 * @since 2022/05/14
 */
@Configuration
class CommonApiRouter(
    private val commonApiHandler: CommonApiHandler
) {

//    @Bean
//    fun routeFunction() = nest(path("/public/store/source"),
//        router {
//            listOf(
//                GET("/", commonApiHandler::findAll),
//                POST("/", commonApiHandler::save)
//            )
//        }
//    )

//    @Bean
//    fun routeFunction() = router {
//        "/public/store/source".nest {
//            accept(MediaType.APPLICATION_JSON).nest{
//                GET("/{startPage}/{endPage}", commonApiHandler::find)
//            }
//            POST("/{startPage}/{endPage}", commonApiHandler::save)
//        }
//    }

    @Bean
    fun routerFunction() = nest(path("/public/store/source"),
        router {
            listOf(
                GET("/{startPage}/{endPage}", commonApiHandler::find),
                POST("/{startPage}/{endPage}", commonApiHandler::save))
        }
    )


}