package com.example.joker_app.presentation

import com.example.joker_app.data.CategoryRemoteDataSource
import com.example.joker_app.data.ListCategoryCallback
import com.example.joker_app.model.Category
import com.example.joker_app.view.HomeFragment

class HomePresenter(
    private val view: HomeFragment,
    private val datasource: CategoryRemoteDataSource = CategoryRemoteDataSource()
) : ListCategoryCallback {

    fun findAllCategories() {
        view.showProgress()
        datasource.findAllCategories(this@HomePresenter)
    }

    override fun onSuccess(response: List<String>) {
        val categories = response.map {
            Category(it)
        }

        view.showCategories(categories)
    }

    override fun onError(message: String) {
        view.showFailure(message)
    }

    override fun onComplete() {
        view.hideProgress()
    }
}