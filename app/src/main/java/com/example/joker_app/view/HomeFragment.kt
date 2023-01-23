package com.example.joker_app.view

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.joker_app.R
import com.example.joker_app.model.Category
import com.xwray.groupie.GroupieAdapter

class HomeFragment : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_home, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        view.findViewById<RecyclerView>(R.id.rv_fragment_home).let {
            it.layoutManager = LinearLayoutManager(requireContext())

            val adapter = GroupieAdapter()
            it.adapter = adapter

            adapter.add(CategoryItem(Category("Categoria 1", 0xFF76335e)))
            adapter.add(CategoryItem(Category("Categoria 2", 0xFFA73E5C)))
            adapter.add(CategoryItem(Category("Categoria 3", 0xFFEC4863)))
            adapter.add(CategoryItem(Category("Categoria 4", 0xFFFF733F)))
            adapter.add(CategoryItem(Category("Categoria 5", 0xFFFFD285)))
            
            adapter.notifyDataSetChanged()
        }

    }
}