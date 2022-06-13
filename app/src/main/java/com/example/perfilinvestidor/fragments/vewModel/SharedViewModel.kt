package com.example.perfilinvestidor.fragments.vewModel


import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class SharedViewModel : ViewModel() {

    private val mutableSelectedItem = MutableLiveData<String>()
    val selectedString: LiveData<String?> get() = mutableSelectedItem

    fun selectString(string: String?): String? {
        mutableSelectedItem.value = string
        return string
    }
}








