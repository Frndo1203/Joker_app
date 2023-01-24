package com.example.joker_app.data

interface ListCategoryCallback {

    fun onSuccess(response: List<String>)
    fun onError(message: String)
    fun onComplete()

}