package com.foodieroad.store.domain.store

import org.springframework.data.annotation.Id
import org.springframework.data.mongodb.core.mapping.Document

/**
 * @author zzai_sang
 * @version 0.1.0
 * @since 2022/05/17
 */
@Document
class StoreSource private constructor(
    @Id
    val id: String?,

    var apvpermymd: String? = null,
    var bplcnm: String? = null,
    var mgtno: String? = null,
    var lastmodts: String? = null,
    var rdnwhladdr: String? = null,
    var rdnpostno: String? = null,
    var sitetel: String? = null,
    var sitewhladdr: String? = null,
    var sntuptaenm: String? = null,
    var updatedt: String? = null,
    var y: String? = null,
    var x: String? = null,
){
    data class Builder(
        var apvpermymd: String? = null,
        var bplcnm: String? = null,
        var mgtno: String? = null,
        var lastmodts: String? = null,
        var rdnwhladdr: String? = null,
        var rdnpostno: String? = null,
        var sitetel: String? = null,
        var sitewhladdr: String? = null,
        var sntuptaenm: String? = null,
        var updatedt: String? = null,
        var y: String? = null,
        var x: String? = null
    )
}

