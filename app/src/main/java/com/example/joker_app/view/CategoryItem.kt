package com.example.joker_app.view

import android.view.View
import android.widget.TextView
import com.example.joker_app.R
import com.example.joker_app.model.Category
import com.xwray.groupie.GroupieViewHolder
import com.xwray.groupie.Item

class CategoryItem(private val category: Category) : Item<CategoryItem.CategoryViewHolder>() {

    class CategoryViewHolder(view: View) : GroupieViewHolder(view)

    override fun createViewHolder(itemView: View): CategoryViewHolder = CategoryViewHolder(itemView)

    override fun bind(viewHolder: CategoryViewHolder, position: Int) {
        viewHolder.let {
            it.itemView.findViewById<TextView>(R.id.txt_category_name).text = category.name
            it.itemView.setBackgroundColor(category.bgColor.toInt())
        }
    }

    override fun getLayout(): Int = R.layout.item_category

}