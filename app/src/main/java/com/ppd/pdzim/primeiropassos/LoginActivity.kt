package com.ppd.pdzim.primeiropassos

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import kotlinx.android.synthetic.main.activity_login.*

class LoginActivity : AppCompatActivity() {

    val username = "pandazim"
    val password = "12345"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)
        button_login.setOnClickListener{
            //Foi adicionado um evento que fará coisas quando clicado no botão "login"
            if (login_input.editText?.text.toString() == username){
                //usuario encontrado
                if (password_input.editText?.text.toString() == password){
                    //Senha correta
                    var intent = Intent(this, SplashActivity::class.java)
                    intent.putExtra("USER", username)
                    startActivity(intent)
                }else {
                    //Senha incorreta
                    password_input.error = "Senha não encontrada"
                }
            }else {
                //usuario não encontrado
                login_input.error = "Usuário não encontrado"
            }
        }
        login_input.editText?.addTextChangedListener(object: TextWatcher {
            //Listener de texto que executa algo de acordo com a mudança do texto
            override fun afterTextChanged(s: Editable?) {

            }

            override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) {
            }

            override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {
                login_input.error = null

            }

        })
        password_input.editText?.addTextChangedListener(object: TextWatcher{
            //Mesma coisa
            override fun afterTextChanged(s: Editable?) {

            }

            override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) {
            }

            override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {
                password_input.error = null
            }

        })
    }
}
