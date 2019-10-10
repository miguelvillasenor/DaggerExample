package dev.mvillasenor.daggerexample.api

import retrofit2.http.GET

interface TimeApi {
    @GET("json/utc/now")
    suspend fun getUtcTime(): CurrentTime
}
