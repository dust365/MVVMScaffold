package com.live.lsg.app

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.live.login.LoginActivity

import com.live.home.activity.MainActivity
import com.quyunshuo.androidbaseframemvvm.R
import kotlinx.coroutines.MainScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch

class SplashActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)
        checkState()
    }

    fun checkState(){
       MainScope().launch {
           delay(2000)
           goToPage()
       }
    }

    private fun goToPage(){
        val isLogin=false
        if (isLogin){
            val intent=Intent(this, MainActivity::class.java)
            startActivity(intent)
        }else{
            val intent=Intent(this,LoginActivity::class.java)
            startActivity(intent)
        }
    }
}