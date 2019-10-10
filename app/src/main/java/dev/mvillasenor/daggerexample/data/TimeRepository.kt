package dev.mvillasenor.daggerexample.data

interface TimeRepository {

    suspend fun getCurrentUtcTime(): String

}
