package com.agathaappb.desafio_dp_n1.ValidaDados

import androidx.lifecycle.MutableLiveData
import com.agathaappb.desafio_dp_n1.Service.RetrofitClient
import com.agathaappb.desafio_dp_n1.Service.ValidadorModel
import com.agathaappb.desafio_dp_n1.Service.ValidadorService
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import kotlin.String as String


class ValidaDadosCPF:ValidaDados {
    override fun validaDados(dadoUsuario: String): String {
         val serviceCPF = RetrofitClient.createService(ValidadorService::class.java)
         val liveData = MutableLiveData<ValidadorModel>()
         serviceCPF.valida(dadoUsuario).enqueue(object : Callback<ValidadorModel>{

             override fun onResponse(
                 call: Call<ValidadorModel>,
                 response: Response<ValidadorModel>
             ) {
                 val resp= response.body()
                 liveData.value = resp


             }

             override fun onFailure(call: Call<ValidadorModel>, t: Throwable) {
                 t.printStackTrace()

             }

         })
        return liveData.toString()


    }
}

//Esse var validacao não está sendo utilizado por isso eu sugiro que essa linha fique assim:
//serviceCPF.valida(dadoUsuario).enqueue(object : <ValidadorModel>{