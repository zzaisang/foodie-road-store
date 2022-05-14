package com.foodieroad.store.config

import org.springframework.context.annotation.Configuration
import org.springframework.http.codec.ServerCodecConfigurer
import org.springframework.web.reactive.config.EnableWebFlux
import org.springframework.web.reactive.config.WebFluxConfigurer

/**
 * @author zzai_sang
 * @version 0.1.0
 * @since 2022/05/14
 */
@Configuration
@EnableWebFlux
class WebFluxConfig : WebFluxConfigurer{

    override fun configureHttpMessageCodecs(configurer: ServerCodecConfigurer) {
        configurer.defaultCodecs().enableLoggingRequestDetails(true)
    }

}