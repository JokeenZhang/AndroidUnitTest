package com.zzq.androidunittest.ui

import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.SavedStateHandle
import androidx.lifecycle.ViewModel
import com.zzq.androidunittest.MyApp

class SaveUiStateViewModel1(private val savedStateHandle: SavedStateHandle) : ViewModel() {

    fun saveInfo(type: String, info: String) {
        savedStateHandle.set(type, info)
    }

    companion object {
        val TYPE_INPUT = "type_input"
        val TYPE_CHECK = "type_check"
    }

}

class SaveUiStateViewMode2l(app: MyApp, private val savedStateHandle: SavedStateHandle) :
    AndroidViewModel(app) {

    fun saveInfo(type: String, info: String) {
        savedStateHandle.set(type, info)
    }

    companion object {
        val TYPE_INPUT = "type_input"
        val TYPE_CHECK = "type_check"
    }

}

