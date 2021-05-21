package com.agathaappb.desafio_dp_n1.ValidaDados

class CategorizaDado {
    fun categorizaDados(dadoUsuario:String): String {
        if(dadoUsuario.length == 11){

            val validaCPF = ValidaDadosCPF()
            if(validaCPF.validaDados(dadoUsuario) == "true"){
                val msg = "CPF Válido"
                return msg
            }else{
                val msg = "CPF Inválido"
            }

           // return validaCPF.validaDados(dadoUsuario)

        }else if(dadoUsuario.length == 14){

            val validaCNPJ = ValidaDadosCNPJ()
            return  validaCNPJ.validaDados(dadoUsuario)

        }
        val msg = "Dado incorreto"
        return msg
    }
}