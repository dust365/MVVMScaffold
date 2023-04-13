package com.live.home.ui.home

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import com.live.core.mvvm.vm.BaseViewModel


class HomeViewModel : BaseViewModel() {

    private val _text = MutableLiveData<String>().apply {
        value = "This is home Fragment"
    }
    val text: LiveData<String> = _text
}