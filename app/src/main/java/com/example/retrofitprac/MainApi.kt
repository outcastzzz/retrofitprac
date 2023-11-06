package com.example.retrofitprac

import retrofit2.http.POST

interface MainApi {

    @POST("products")
    suspend fun getProducts(): Products

}