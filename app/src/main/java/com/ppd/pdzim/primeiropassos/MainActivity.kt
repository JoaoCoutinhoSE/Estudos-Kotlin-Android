package com.ppd.pdzim.primeiropassos

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    val username = "pandazim"
    val password = "12345"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        button_login.setOnClickListener{
            if (editText_username.text.toString() == username){
                //usuario encontrado
                if (editText_password.text.toString() == password){
                    //Senha correta
                }else {
                    //Senha incorreta
                }
            }else {
                //usuario não encontrado

            }
        }

    }
}
