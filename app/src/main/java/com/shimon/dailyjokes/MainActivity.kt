package com.shimon.dailyjokes

import android.os.Bundle
import android.util.Log
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.lifecycle.ViewModelProvider

class MainActivity : AppCompatActivity() {


    private lateinit var viewmodel : JokesViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        viewmodel = ViewModelProvider(this)[JokesViewModel::class.java]
        
        viewmodel._jokesData.observe(this){ data ->

            Log.d("TAG", "Jokes : $data")
            
        }

    }
}