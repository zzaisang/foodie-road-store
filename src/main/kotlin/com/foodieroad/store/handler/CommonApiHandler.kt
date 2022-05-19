package com.foodieroad.store.handler

import com.foodieroad.store.domain.payload.LocalData072404Result
import com.foodieroad.store.properties.CommonApiProperties
import com.foodieroad.store.repository.LocalData072404ResultRepository
import com.foodieroad.store.repository.StoreSourceRepository
import org.springframework.http.MediaType
import org.springframework.stereotype.Component
import org.springframework.web.reactive.function.client.WebClient
import org.springframework.web.reactive.function.server.ServerRequest
import org.springframework.web.reactive.function.server.ServerResponse.ok
import reactor.core.publisher.Mono

/**
 * @author zzai_sang
 * @version 0.1.0
 * @since 2022/05/14
 */
@Component
class CommonApiHandler (
    val seoulCommonProperties: CommonApiProperties,
    val localData072404ResultRepository: LocalData072404ResultRepository
){

    fun fetch(path: String): WebClient.ResponseSpec {
        val client = WebClient.create("${seoulCommonProperties.url}/${seoulCommonProperties.key}/json/${seoulCommonProperties.name}")
        return client.get().uri(path).retrieve()
    }

    fun find(req: ServerRequest) =
        fetch("/${req.pathVariable("startPage")}/${req.pathVariable("endPage")}/")
            .bodyToMono(LocalData072404Result::class.java)
            .flatMap { v ->
                ok().contentType(MediaType.APPLICATION_JSON).bodyValue(v)
            }

    fun save(req: ServerRequest) =
        fetch("/${req.pathVariable("startPage")}/${req.pathVariable("endPage")}/")
            .bodyToMono(LocalData072404Result::class.java)
            .flatMap { data -> localData072404ResultRepository.save(data) }
            .flatMap { v ->
                ok().contentType(MediaType.APPLICATION_JSON).bodyValue(v)
            }

}