package com.foodieroad.store.domain.payload

import com.fasterxml.jackson.annotation.JsonProperty
import lombok.AllArgsConstructor
import lombok.Builder
import lombok.Getter
import lombok.NoArgsConstructor

/**
 * @author zzai_sang
 * @version 0.1.0
 * @since 2022/05/07
 */
@Getter
@Builder
@NoArgsConstructor
@AllArgsConstructor
class Localdata072404Result {
    @JsonProperty("LOCALDATA_072404")
    var localdata072404: Localdata072404? = null

    @Getter
    @Builder
    @NoArgsConstructor
    @AllArgsConstructor
    class Localdata072404 {
        @JsonProperty("row")
        var row: List<Row>? = null

        @JsonProperty("RESULT")
        var result: Result? = null

        @JsonProperty("list_total_count")
        var listTotalCount = 0
    }

    @Getter
    @Builder
    @NoArgsConstructor
    @AllArgsConstructor
    class Row {
        @JsonProperty("HOMEPAGE")
        var homepage: String? = null

        @JsonProperty("JTUPSOMAINEDF")
        var jtupsomainedf: String? = null

        @JsonProperty("JTUPSOASGNNO")
        var jtupsoasgnno: String? = null

        @JsonProperty("FACILTOTSCP")
        var faciltotscp: String? = null

        @JsonProperty("MULTUSNUPSOYN")
        var multusnupsoyn: String? = null

        @JsonProperty("MONAM")
        var monam: String? = null

        @JsonProperty("ISREAM")
        var isream: String? = null

        @JsonProperty("BDNGOWNSENM")
        var bdngownsenm: String? = null

        @JsonProperty("FCTYPDTJOBEPCNT")
        var fctypdtjobepcnt: String? = null

        @JsonProperty("FCTYSILJOBEPCNT")
        var fctysiljobepcnt: String? = null

        @JsonProperty("FCTYOWKEPCNT")
        var fctyowkepcnt: String? = null

        @JsonProperty("HOFFEPCNT")
        var hoffepcnt: String? = null

        @JsonProperty("TOTEPNUM")
        var totepnum: String? = null

        @JsonProperty("WTRSPLYFACILSENM")
        var wtrsplyfacilsenm: String? = null

        @JsonProperty("LVSENM")
        var lvsenm: String? = null

        @JsonProperty("TRDPJUBNSENM")
        var trdpjubnsenm: String? = null

        @JsonProperty("WMEIPCNT")
        var wmeipcnt: String? = null

        @JsonProperty("MANEIPCNT")
        var maneipcnt: String? = null

        @JsonProperty("SNTUPTAENM")
        var sntuptaenm: String? = null

        @JsonProperty("Y")
        var y: String? = null

        @JsonProperty("X")
        var x: String? = null

        @JsonProperty("UPTAENM")
        var uptaenm: String? = null

        @JsonProperty("UPDATEDT")
        var updatedt: String? = null

        @JsonProperty("UPDATEGBN")
        var updategbn: String? = null

        @JsonProperty("LASTMODTS")
        var lastmodts: String? = null

        @JsonProperty("BPLCNM")
        var bplcnm: String? = null

        @JsonProperty("RDNPOSTNO")
        var rdnpostno: String? = null

        @JsonProperty("RDNWHLADDR")
        var rdnwhladdr: String? = null

        @JsonProperty("SITEWHLADDR")
        var sitewhladdr: String? = null

        @JsonProperty("SITEPOSTNO")
        var sitepostno: String? = null

        @JsonProperty("SITEAREA")
        var sitearea: String? = null

        @JsonProperty("SITETEL")
        var sitetel: String? = null

        @JsonProperty("ROPNYMD")
        var ropnymd: String? = null

        @JsonProperty("CLGENDDT")
        var clgenddt: String? = null

        @JsonProperty("CLGSTDT")
        var clgstdt: String? = null

        @JsonProperty("DCBYMD")
        var dcbymd: String? = null

        @JsonProperty("DTLSTATENM")
        var dtlstatenm: String? = null

        @JsonProperty("DTLSTATEGBN")
        var dtlstategbn: String? = null

        @JsonProperty("TRDSTATENM")
        var trdstatenm: String? = null

        @JsonProperty("TRDSTATEGBN")
        var trdstategbn: String? = null

        @JsonProperty("APVCANCELYMD")
        var apvcancelymd: String? = null

        @JsonProperty("APVPERMYMD")
        var apvpermymd: String? = null

        @JsonProperty("MGTNO")
        var mgtno: String? = null

        @JsonProperty("OPNSFTEAMCODE")
        var opnsfteamcode: String? = null
    }

    @Getter
    @Builder
    @NoArgsConstructor
    @AllArgsConstructor
    class Result {
        @JsonProperty("MESSAGE")
        var message: String? = null

        @JsonProperty("CODE")
        var code: String? = null
    }
}