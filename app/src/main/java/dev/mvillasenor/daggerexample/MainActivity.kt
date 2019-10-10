package dev.mvillasenor.daggerexample

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import dev.mvillasenor.daggerexample.api.TimeApi
import dev.mvillasenor.daggerexample.data.TimeRepository
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch
import retrofit2.Retrofit
import javax.inject.Inject

class MainActivity : AppCompatActivity(R.layout.activity_main)
