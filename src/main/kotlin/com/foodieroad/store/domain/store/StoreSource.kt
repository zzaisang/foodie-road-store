package com.foodieroad.store.domain.store

import com.foodieroad.store.domain.payload.Localdata072404Result
import lombok.AllArgsConstructor
import lombok.Builder
import org.springframework.data.annotation.Id
import org.springframework.data.mongodb.core.mapping.Document

/**
 * @author zzai_sang
 * @version 0.1.0
 * @since 2022/05/17
 */
@Builder
@AllArgsConstructor
@Document
data class StoreSource(
    @Id
    val id: String?,

    var homepage: String? = null,
    var jtupsomainedf: String? = null,
    var jtupsoasgnno: String? = null,
    var faciltotscp: String? = null,
    var multusnupsoyn: String? = null,
    var monam: String? = null,
    var isream: String? = null,
    var bdngownsenm: String? = null,
    var fctypdtjobepcnt: String? = null,
    var fctysiljobepcnt: String? = null,
    var fctyowkepcnt: String? = null,
    var hoffepcnt: String? = null,
    var totepnum: String? = null,
    var wtrsplyfacilsenm: String? = null,
    var lvsenm: String? = null,
    var trdpjubnsenm: String? = null,
    var wmeipcnt: String? = null,
    var maneipcnt: String? = null,
    var sntuptaenm: String? = null,
    var y: String? = null,
    var x: String? = null,
    var uptaenm: String? = null,
    var updatedt: String? = null,
    var updategbn: String? = null,
    var lastmodts: String? = null,
    var bplcnm: String? = null,
    var rdnpostno: String? = null,
    var rdnwhladdr: String? = null,
    var sitewhladdr: String? = null,
    var sitepostno: String? = null,
    var sitearea: String? = null,
    var sitetel: String? = null,
    var ropnymd: String? = null,
    var clgenddt: String? = null,
    var clgstdt: String? = null,
    var dcbymd: String? = null,
    var dtlstatenm: String? = null,
    var dtlstategbn: String? = null,
    var trdstatenm: String? = null,
    var trdstategbn: String? = null,
    var apvcancelymd: String? = null,
    var apvpermymd: String? = null,
    var mgtno: String? = null,
    var opnsfteamcode: String? = null

){
    class StoreSource (row: Localdata072404Result.Row) {
        val homepage = row.homepage
        val jtupsomainedf = row.jtupsomainedf
        val jtupsoasgnno = row.jtupsoasgnno
        val faciltotscp = row.faciltotscp
        val multusnupsoyn = row.multusnupsoyn
        val monam = row.monam
        val isream = row.isream
        val bdngownsenm = row.bdngownsenm
        val fctypdtjobepcnt = row.fctypdtjobepcnt
        val fctysiljobepcnt = row.fctysiljobepcnt
        val fctyowkepcnt = row.fctyowkepcnt
        val hoffepcnt = row.hoffepcnt
        val totepnum = row.totepnum
        val wtrsplyfacilsenm = row.wtrsplyfacilsenm
        val lvsenm = row.lvsenm
        val trdpjubnsenm = row.trdpjubnsenm
        val wmeipcnt = row.wmeipcnt
        val maneipcnt = row.maneipcnt
        val sntuptaenm = row.sntuptaenm
        val y = row.y
        val x = row.x
        val uptaenm = row.uptaenm
        val updatedt = row.updatedt
        val updategbn = row.updategbn
        val lastmodts = row.lastmodts
        val bplcnm = row.bplcnm
        val rdnpostno = row.rdnpostno
        val rdnwhladdr = row.rdnwhladdr
        val sitewhladdr = row.sitewhladdr
        val sitepostno = row.sitepostno
        val sitearea = row.sitearea
        val sitetel = row.sitetel
        val ropnymd = row.ropnymd
        val clgenddt = row.clgenddt
        val clgstdt = row.clgstdt
        val dcbymd = row.dcbymd
        val dtlstatenm = row.dtlstatenm
        val dtlstategbn = row.dtlstategbn
        val trdstatenm = row.trdstatenm
        val trdstategbn = row.trdstategbn
        val apvcancelymd = row.apvcancelymd
        val apvpermymd = row.apvpermymd
        val mgtno = row.mgtno
        val opnsfteamcode = row.opnsfteamcode
    }
}
