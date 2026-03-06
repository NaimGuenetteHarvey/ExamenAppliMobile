package ca.cem.composeretrofitbase.api

import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Path

interface api {
    @GET("films/{quantite}")
    fun listReposString(@Path("quantite") quantite: Int): Call<Int>
}