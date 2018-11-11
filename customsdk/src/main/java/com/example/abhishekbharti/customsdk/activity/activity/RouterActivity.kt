package com.example.abhishekbharti.customsdk.activity.activity

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.core.content.ContextCompat.startActivity

class RouterActivity : BaseActivity() {

    companion object {
        val FEATURE_1 = 101
        val FEATURE_2 = 102
        val FEATURE_3 = 103
        val FEATURE_4 = 104

        val ROUTE_FEATURE = "route_feature"

        fun start(context: Context, feature: Int) {
            var intent: Intent = Intent(context, RouterActivity::class.java)
            intent.putExtra(ROUTE_FEATURE, feature)
            startActivity(context, intent, null)
        }
    }




    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        if (intent != null) {
            routeTo(intent.getIntExtra(ROUTE_FEATURE, 101))
        }

    }

    private fun routeTo(feature: Int) {
        when (feature) {
            101 -> {
                Activity1.start(this, null)
            }
            102 -> {
                Activity2.start(this, null)
            }
            103 -> {

            }
            104 -> {

            }
            else -> {

            }
        }
    }
}