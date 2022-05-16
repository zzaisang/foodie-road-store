package com.foodieroad.store.handler

import com.foodieroad.store.domain.payload.Localdata072404Result
import com.foodieroad.store.properties.CommonApiProperties
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.beans.factory.annotation.Qualifier
import org.springframework.beans.factory.annotation.Value
import org.springframework.http.MediaType
import org.springframework.stereotype.Component
import org.springframework.web.reactive.function.client.WebClient
import org.springframework.web.reactive.function.server.ServerRequest
import org.springframework.web.reactive.function.server.ServerResponse.*

/**
 * @author zzai_sang
 * @version 0.1.0
 * @since 2022/05/14
 */
@Component
class CommonApiHandler (
    val seoulCommonProperties: CommonApiProperties
){

    fun fetch(path: String): WebClient.ResponseSpec {
        val client = WebClient.create("${seoulCommonProperties.url}/${seoulCommonProperties.key}/json/${seoulCommonProperties.name}/1/1")
        return client.get().uri(path).retrieve()
    }

    fun findAll(request: ServerRequest) =
        fetch("")
            .bodyToMono(Localdata072404Result::class.java)
            .flatMap { v ->
                ok().contentType(MediaType.APPLICATION_JSON).bodyValue(v)
            }

    fun save(request: ServerRequest) =
        fetch("")
            .bodyToMono(Localdata072404Result::class.java)
            .flatMap { v ->
                ok().contentType(MediaType.APPLICATION_JSON).bodyValue(v)
            }

}