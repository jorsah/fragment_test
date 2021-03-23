package com.example.fragment_test

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.fragment.app.Fragment

class MyFirstFragment: Fragment() {

    var remover:Buttons? = null
    var adder:Buttons? = null
    var replacer:Buttons? = null

    override fun onCreateView(
            inflater: LayoutInflater,
            container: ViewGroup?,
            savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.main_fragment,container,false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val addBtn = view.findViewById<Button>(R.id.add)
        val removeBtn = view.findViewById<Button>(R.id.remove)
        val replaceBtn = view.findViewById<Button>(R.id.replace)

        addBtn.setOnClickListener {
            adder?.add()
        }
        removeBtn.setOnClickListener {
            remover?.remove()
        }
        replaceBtn.setOnClickListener {
            replacer?.replace()
        }
    }
}

