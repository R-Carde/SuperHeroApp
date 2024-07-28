package com.example.superheroapp

import com.google.gson.annotations.SerializedName

data class SuperHeroDataResponse(
    @SerializedName("response") val response: String,
    //@SerializedName ("results-for") val resultsFor: String,
    @SerializedName("results") val superheroes:List<SuperheroItemResponse>
    )
data class SuperheroItemResponse(
    @SerializedName("id") val superheroid: Int,
    @SerializedName("name") val superheroname: String

)