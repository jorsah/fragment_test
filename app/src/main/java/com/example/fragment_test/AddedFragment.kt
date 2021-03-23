package com.example.fragment_test

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.fragment.app.Fragment

class AddedFragment: Fragment() {
    var remover:Buttons? = null
    var replacer:Buttons? = null
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.added_fragment,container,false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)



        val remove = view.findViewById<Button>(R.id.remove1)
        val replace = view.findViewById<Button>(R.id.replace1)

        remove.setOnClickListener {
            remover?.remove()
        }
        replace.setOnClickListener {
            replacer?.replace1()
        }
    }
}