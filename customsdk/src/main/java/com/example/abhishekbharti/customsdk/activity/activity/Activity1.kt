package com.example.abhishekbharti.customsdk.activity.activity

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.core.content.ContextCompat
import com.example.abhishekbharti.customsdk.R

class Activity1: BaseActivity() {

    companion object {
        fun start(context: Context, bundle: Bundle?) {
            var intent: Intent = Intent(context, Activity1::class.java)
            if(bundle != null){
                intent.putExtras(bundle)
            }

            ContextCompat.startActivity(context, intent, null)
        }
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_1)
    }
}