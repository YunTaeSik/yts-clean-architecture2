package com.yts.ytscleanarchitecture.extension

import androidx.lifecycle.MutableLiveData

fun <T> MutableLiveData<List<T>>.addAll(values: List<T>) {
    var value: ArrayList<T> = ArrayList()
    if (this.value != null) {
        value = this.value as ArrayList<T>

    }
    value.addAll(values)
    this.postValue(value)
}

fun <T> MutableLiveData<List<T>>.clear() {
    this.postValue(ArrayList<T>())
}