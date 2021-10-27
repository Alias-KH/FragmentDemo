package com.example.fragmentdemo

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class Fragment2ViewModel: ViewModel() {
     var message2 = MutableLiveData<String>()
}