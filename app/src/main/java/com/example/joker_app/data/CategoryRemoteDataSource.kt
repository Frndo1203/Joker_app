package com.example.joker_app.data

import android.os.Handler
import android.os.Looper

class CategoryRemoteDataSource {
    fun findAllCategories(callback: ListCategoryCallback) {
        Handler(Looper.getMainLooper()).postDelayed({
            val response = arrayListOf(
                "Categoria 1", "Categoria 2", "Categoria 3", "Categoria 4", "Categoria 5"
            )

            try {
                callback.onSuccess(response)
            } catch (e: Exception) {
                callback.onError(e.message ?: "Erro desconhecido")
            }
            callback.onComplete()

        }, 2000)
    }
}