package com.example.fundamental_submission2_iman.splashScreen

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.fundamental_submission2_iman.R.layout.activity_splash
import com.example.fundamental_submission2_iman.mainActivity.MainActivity

@SuppressLint("CustomSplashScreen")
    class SplashActivity : AppCompatActivity() {
        override fun onCreate(savedInstanceState: Bundle?) {
            super.onCreate(savedInstanceState)
            setContentView(activity_splash)

        val splash = Thread {
            try {
                Thread.sleep(1000)
            } catch (e: InterruptedException) {
                e.printStackTrace()
            } finally {
                val intent = Intent (this@SplashActivity, MainActivity::class.java)
                startActivity(intent)
            }
        }
        splash.start()
    }
}