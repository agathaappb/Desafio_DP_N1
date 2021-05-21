package com.agathaappb.desafio_dp_n1.Service
import okhttp3.OkHttpClient
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class RetrofitClient private constructor() {

    companion object{

        private lateinit var retrofit : Retrofit
        private val baseUrl = "https://ezfoil8tgj.execute-api.us-east-1.amazonaws.com/"

        private fun getRetrofitInstance(): Retrofit{
            val httpClient = OkHttpClient.Builder()
            if(!::retrofit.isInitialized){
                retrofit = Retrofit.Builder()
                    .baseUrl(baseUrl)
                    .client(httpClient.build())
                    .addConverterFactory(GsonConverterFactory.create())
                    .build()


            }
            return retrofit
        }

        fun <T>  createService(serviceClass:Class<T>):T {
            return getRetrofitInstance().create(serviceClass)
        }

    }
}