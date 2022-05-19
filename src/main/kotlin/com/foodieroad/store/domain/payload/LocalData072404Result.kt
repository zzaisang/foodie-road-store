package com.foodieroad.store.domain.payload

import com.fasterxml.jackson.annotation.JsonProperty
import lombok.AllArgsConstructor
import lombok.Builder
import lombok.Getter
import lombok.NoArgsConstructor
import org.springframework.data.annotation.Id
import org.springframework.data.mongodb.core.mapping.Document

/**
 * @author zzai_sang
 * @version 0.1.0
 * @since 2022/05/07
 */
@Getter
@Document("LocalData07240")
data class LocalData072404Result(

    @Id var id: Long,

    var localdata072404: Localdata072404? = null
)
