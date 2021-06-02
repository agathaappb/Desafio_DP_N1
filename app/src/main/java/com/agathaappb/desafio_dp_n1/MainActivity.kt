package com.agathaappb.desafio_dp_n1

import android.os.Bundle
import android.os.StrictMode
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.agathaappb.desafio_dp_n1.ValidaDados.CategorizaDado
import com.agathaappb.desafio_dp_n1.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        val policy = StrictMode.ThreadPolicy.Builder().permitAll().build()
        StrictMode.setThreadPolicy(policy)
        val editUser:EditText = binding.editDados
        val btnValida:Button = binding.btnVerificaDados

        btnValida.setOnClickListener{
            val dado = CategorizaDado()
            val s = dado.categorizaDados(editUser.text.toString())


            val msgRetorno = Toast.makeText(applicationContext, s,Toast.LENGTH_LONG)
            msgRetorno.show()

        }

    //Notei que não está funcionando a validação após o clique.
    // Como uma chamada a api é assincrona e até o servidor devolver uma resposta e atualizar o livedata,
    // esse tratamento deve ser feita em uma thread separada




    }
}