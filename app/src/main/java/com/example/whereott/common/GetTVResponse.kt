package com.example.whereott.common

import com.example.whereott.common.TV
import com.google.gson.annotations.SerializedName

data class GetTVResponse (
    @SerializedName("page") val page: Int,
    @SerializedName("results") val tvlist: List<TV>,
    @SerializedName("total_pages") val total_pages: Int,
    @SerializedName("total_results") val total_results: Int
) {}