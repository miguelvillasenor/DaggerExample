package dev.mvillasenor.daggerexample.data

import dev.mvillasenor.daggerexample.api.TimeApi

class TimeRepositoryImpl(
    private val timeApi: TimeApi
) : TimeRepository {
    override suspend fun getCurrentUtcTime(): String = timeApi.getUtcTime().currentDateTime
}
