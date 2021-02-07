package com.github.orelzion.mvvm101

import androidx.lifecycle.*
import java.util.*

class MainViewModel : ViewModel() {

    private val timer: Timer
    private var mainViewData = MainViewData("", 0)
    private val mainViewLiveData = MutableLiveData<MainViewData>()
    fun bindViewData(): LiveData<MainViewData> = mainViewLiveData

    init {
        timer = kotlin.concurrent.timer(period = 1000) {
            val counter = mainViewData.counter + 1
            mainViewData = mainViewData.copy(text = counter.toString(), counter = counter)
            mainViewLiveData.postValue(mainViewData)
        }
    }

    override fun onCleared() {
        super.onCleared()
        timer.cancel()
    }
}