package com.ppd.pdzim.primeiropassos

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import com.google.android.material.snackbar.Snackbar
import androidx.appcompat.app.AppCompatActivity

import kotlinx.android.synthetic.main.activity_principal.*
import kotlinx.android.synthetic.main.content_principal.*

class PrincipalActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_principal)

        val username:String = intent.getStringExtra("USER")
        textView_bemvindo.text = username + ", bem vindo"

        Handler().postDelayed({

            startActivity(Intent(this, MenuCardViewActivity::class.java))
        }, 2000)

    }

}
