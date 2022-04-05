package com.thurainx.scopingtest.features

import android.util.Log
import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel

class FirstScreenViewModel : ViewModel(){
    var name = mutableStateOf("")
    init {
        Log.d("vm", "i am called")
    }
}