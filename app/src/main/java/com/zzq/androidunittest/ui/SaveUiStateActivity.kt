package com.zzq.androidunittest.ui

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.dylanc.viewbinding.binding
import com.zzq.androidunittest.R
import com.zzq.androidunittest.databinding.ActivitySaveUiStateBinding

class SaveUiStateActivity : AppCompatActivity() {

    private val binding:ActivitySaveUiStateBinding by binding()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setTitle(this.javaClass.simpleName)
        binding.btnVmSave.setOnClickListener {
            startActivity(Intent(this, VmSaveActivity::class.java))
        }
    }
}