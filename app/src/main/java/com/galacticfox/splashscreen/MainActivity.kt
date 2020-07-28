package com.galacticfox.splashscreen

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        /* TODO 7: Indicación para utilizar el splash screen desde el momento de inicio de la aplicación */
        //Thread.sleep(1000) // Detiene la aplicación 1 segundo
        setTheme(R.style.SplashScreenTheme)

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
}