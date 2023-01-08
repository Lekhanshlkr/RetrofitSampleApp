package com.example.retrofitsampleapp

import retrofit2.Call
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.create
import retrofit2.http.GET

interface ApiInterface {

    @GET("/photos")
    fun getUsers(): Call<ArrayList<UserModel>>

    companion object{
        operator fun invoke():ApiInterface{
            return Retrofit.Builder()
                .baseUrl(MainActivity().api)
                .addConverterFactory(GsonConverterFactory.create())
                .build()
                .create(ApiInterface::class.java)
        }
    }
}