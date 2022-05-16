package com.foodieroad.store.properties

import org.springframework.boot.context.properties.ConfigurationProperties
import org.springframework.boot.context.properties.ConstructorBinding

/**
 * @author zzai_sang
 * @version 0.1.0
 * @since 2022/05/14
 */
@ConstructorBinding
@ConfigurationProperties("external.seoul-common")
data class CommonApiProperties(
    val url : String,
    val key : String,
    val name : String
)
