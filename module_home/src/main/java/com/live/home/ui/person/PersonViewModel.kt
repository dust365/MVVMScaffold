package com.live.home.ui.person

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import com.live.core.mvvm.vm.BaseViewModel

class PersonViewModel : BaseViewModel() {

    private val _text = MutableLiveData<String>().apply {
        value = "This is notifications Fragment"
    }
    val text: LiveData<String> = _text
}