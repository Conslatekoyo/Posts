package dev.conslate.myposts

import retrofit2.converter.gson.GsonConverterFactory

import retrofit2.Retrofit
object ApiClient{
    var retrofit = Retrofit.Builder()
        .baseUrl("https://jsonplaceholder.typicode.com/")
        .addConverterFactory(GsonConverterFactory.create())
        .build()

    fun <T> buildApiClient(apiInterface: Class<T>): T {
        return retrofit.create(apiInterface)
    }
}