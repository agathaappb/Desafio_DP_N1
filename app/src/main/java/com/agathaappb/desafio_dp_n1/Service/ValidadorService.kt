package com.agathaappb.desafio_dp_n1.Service

import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Path
import retrofit2.http.Query


public interface ValidadorService {

    @GET("v1/validador-cpf-cnpj?")
    fun valida(@Query("documento") userDado:String): Call<ValidadorModel>

}