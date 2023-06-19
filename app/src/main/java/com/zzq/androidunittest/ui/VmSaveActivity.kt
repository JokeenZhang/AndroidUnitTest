package com.zzq.androidunittest.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.core.widget.addTextChangedListener
import androidx.lifecycle.SavedStateViewModelFactory
import androidx.lifecycle.ViewModelProvider
import com.dylanc.viewbinding.binding
import com.zzq.androidunittest.MyApp
import com.zzq.androidunittest.R
import com.zzq.androidunittest.databinding.ActivityVmSaveBinding

class VmSaveActivity : AppCompatActivity() {

    private val viewBinding: ActivityVmSaveBinding by binding()

    private lateinit var viewModel:SaveUiStateViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
//        setContentView(R.layout.activity_vm_save)
        setTitle(this.javaClass.simpleName)

        val factory = SavedStateViewModelFactory(MyApp.instance, this)
        viewModel = ViewModelProvider(this, factory).get(SaveUiStateViewModel::class.java)

        viewBinding.etInput.addTextChangedListener {
            viewBinding.tvInput.text = viewBinding.etInput.text.toString()
        }

        viewBinding.rgCheck.setOnCheckedChangeListener { group, checkedId ->
            viewBinding.tvCheck.text = "选择了：${checkedId}"
        }

        viewBinding.btnSave.setOnClickListener {
            viewModel.saveInfo(SaveUiStateViewModel.TYPE_INPUT,viewBinding.tvInput.text.toString())
            viewModel.saveInfo(SaveUiStateViewModel.TYPE_CHECK,viewBinding.tvCheck.text.toString())
            finish()
        }
    }
}