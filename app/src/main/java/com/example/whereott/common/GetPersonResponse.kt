package com.example.whereott.common

import com.google.gson.annotations.SerializedName

data class GetPersonResponse(
    @SerializedName("page") val page: Int,
    @SerializedName("results") val persons: List<Person>,
    @SerializedName("total_pages") val total_pages: Int,
    @SerializedName("total_results") val total_results: Int
) {}