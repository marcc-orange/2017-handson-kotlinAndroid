package fr.ekito.myweatherapp

import android.app.Application

import com.joanzapata.iconify.Iconify
import com.joanzapata.iconify.fonts.WeathericonsModule

import fr.ekito.myweatherlibrary.WeatherSDK

class MainApplication : Application() {

    override fun onCreate() {
        super.onCreate()

        WeatherSDK.init(this)
        Iconify.with(WeathericonsModule())

        instance = this
    }

    companion object {

        private var instance: MainApplication? = null

        fun get(): Application {
            return instance
        }
    }
}