package com.example.aplikasikita

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.ComponentActivity
import com.example.aplikasi.Dashboard

class Login : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.login)


        val btn_login:Button = findViewById(R.id.btn_login);

        //btn_login ditekan
        btn_login.setOnClickListener {
            //pindah ke halaman dashboard
            val pindah:Intent = Intent(this, Dashboard::class.java)
            startActivity(pindah);
        }
    }

}