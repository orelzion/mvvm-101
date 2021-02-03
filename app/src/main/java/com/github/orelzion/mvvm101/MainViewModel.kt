package com.github.orelzion.mvvm101

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MainViewModel: ViewModel() {

    private var mainViewData = MainViewData("")
    val mainViewLiveData = MutableLiveData<MainViewData>()

    fun onInputChanged(text: String) {
        mainViewData = mainViewData.copy(text = text)
        mainViewLiveData.postValue(mainViewData)
    }
}