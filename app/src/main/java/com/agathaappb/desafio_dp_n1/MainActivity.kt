package com.agathaappb.desafio_dp_n1

import android.os.Bundle
import android.os.StrictMode
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.agathaappb.desafio_dp_n1.ValidaDados.CategorizaDado


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val policy = StrictMode.ThreadPolicy.Builder().permitAll().build()
        StrictMode.setThreadPolicy(policy)
        val editUser:EditText = findViewById(R.id.editDados)
        val btnValida:Button = findViewById(R.id.btnVerificaDados)

        btnValida.setOnClickListener{
            val dado = CategorizaDado()
            val s = dado.categorizaDados(editUser.text.toString())

            val msgRetorno = Toast.makeText(applicationContext, s,Toast.LENGTH_LONG)
            msgRetorno.show()

        }




    }
}