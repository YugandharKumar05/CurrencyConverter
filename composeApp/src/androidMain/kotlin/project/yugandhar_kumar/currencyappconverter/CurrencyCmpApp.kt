package project.yugandhar_kumar.currencyappconverter

import android.app.Application
import di.initializeKoin

class CurrencyCmpApp : Application() {
    override fun onCreate() {
        super.onCreate()
        initializeKoin()
    }
}