package com.example.photoapp

import android.os.Bundle
import android.os.PersistableBundle
import androidx.appcompat.app.AppCompatActivity

class SecondActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?, persistentState: PersistableBundle?) {
        super.onCreate(savedInstanceState, persistentState)



        doneWithWorkGoBack()
    }

    fun doneWithWorkGoBack() {
        setResult(RESULT_OK)
    }
}