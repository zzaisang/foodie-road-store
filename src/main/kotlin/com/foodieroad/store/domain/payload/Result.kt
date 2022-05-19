package com.foodieroad.store.domain.payload

import com.fasterxml.jackson.annotation.JsonProperty

/**
 * @author zzai_sang
 * @version 0.1.0
 * @since 2022/05/20
 */
data class Result(
    @JsonProperty("MESSAGE")
    var message: String? = null,

    @JsonProperty("CODE")
    var code: String? = null
)
