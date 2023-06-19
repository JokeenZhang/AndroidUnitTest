package com.zzq.androidunittest

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.viewbinding.ViewBinding

abstract class BaseActivity<VB : ViewBinding> : AppCompatActivity() {

    private lateinit var viewBinding: VB

    final override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        viewBinding = initBinding()
        initView()
        initData()
    }

    abstract fun initBinding(): VB

    open fun initData() {

    }

    open fun initView() {

    }
}