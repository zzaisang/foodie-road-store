package com.foodieroad.store.domain.payload

import com.fasterxml.jackson.annotation.JsonProperty

/**
 * @author zzai_sang
 * @version 0.1.0
 * @since 2022/05/20
 */
data class Localdata072404(
    @JsonProperty("row")
    var row: List<Row>? = null,

    @JsonProperty("RESULT")
    var result: Result? = null,

    @JsonProperty("list_total_count")
    var listTotalCount: Int? = 0
)
