package com.example.fragmentdemo

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class Fragment1ViewModel: ViewModel() {
     var message1 = MutableLiveData<String>()
}