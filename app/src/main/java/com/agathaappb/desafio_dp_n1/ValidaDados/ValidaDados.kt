package com.agathaappb.desafio_dp_n1.ValidaDados

import com.agathaappb.desafio_dp_n1.Service.ValidadorModel
import retrofit2.Response

interface ValidaDados {
    fun validaDados(dadoUsuario: String): String
}