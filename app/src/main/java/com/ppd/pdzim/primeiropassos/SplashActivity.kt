package com.ppd.pdzim.primeiropassos

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler

class SplashActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        val SPLASH_TIME_OUT:Long=5000
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)
        supportActionBar?.hide()

        Handler().postDelayed({
           //Metodo que inicializa a activity Depois do tempo marcado
            startActivity(Intent(this, LoginActivity::class.java))
            //Finaliza a Splash
            finish()
            //Quantos segundos deve conter
        }, SPLASH_TIME_OUT)
    }
}
