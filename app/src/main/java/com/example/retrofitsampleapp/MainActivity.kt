package com.example.retrofitsampleapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_main.*
import retrofit2.*

class MainActivity : AppCompatActivity() {
    // /photos
    var api = "https://jsonplaceholder.typicode.com"

    var allUsers:ArrayList<UserModel>?=null


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        rcvMain.layoutManager = LinearLayoutManager(this)

        ApiInterface().getUsers().enqueue(object: Callback<ArrayList<UserModel>>{
            override fun onResponse(call: Call<ArrayList<UserModel>>, response: Response<ArrayList<UserModel>>) {
                allUsers = response.body()

                rcvMain.adapter = UserAdapter(this@MainActivity,allUsers)
            }

            override fun onFailure(call: Call<ArrayList<UserModel>>, t: Throwable) {
                Log.d("OnFailure: ",t.localizedMessage!!.toString())
            }

        })
    }
}