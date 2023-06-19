package com.zzq.androidunittest

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.ViewModelProvider.AndroidViewModelFactory
import com.zzq.androidunittest.databinding.ActivityMainBinding
import com.zzq.androidunittest.databinding.ActivityMainBinding.bind
import com.zzq.androidunittest.ui.SaveUiStateActivity
import com.zzq.androidunittest.ui.SaveUiStateViewModel1

class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val factory = AndroidViewModelFactory(MyApp.instance)
        val appVm = ViewModelProvider(this,factory).get(UnitAppViewModel::class.java)

        val saveUiStateVm1 = ViewModelProvider(this).get(SaveUiStateViewModel1::class.java)

        findViewById<Button>(R.id.btn_save_ui).setOnClickListener {
            startActivity(Intent(this,SaveUiStateActivity::class.java))
        }
    }
}