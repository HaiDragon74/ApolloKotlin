package com.example.apollokotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val apiNetWork=ApiNetWork()
        CoroutineScope(Dispatchers.IO).launch{
            try {
                val api= apiNetWork.apolloClient.query(GetUserQuery()).execute()
                Log.d("AAAAAAA",api.data?.getUsers.toString())
            }catch (err:Exception){
                Log.d("AAAAAAA",err.message.toString())

            }

        }
    }
}