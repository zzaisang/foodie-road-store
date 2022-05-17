package com.foodieroad.store.config

import lombok.extern.slf4j.Slf4j
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import org.springframework.web.reactive.function.client.WebClient

/**
 * @author zzai_sang
 * @version 0.1.0
 * @since 2022/05/17
 */
@Slf4j
@Configuration
class WebClientConfig {

    @Bean
    fun webclient() {
        WebClient.builder()
            .exchangeStrategies{ builder ->
                builder.codecs {
                    it.defaultCodecs().maxInMemorySize(2 * 1024 * 1024)
                }
            }.build()
    }
}