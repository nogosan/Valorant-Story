package com.jincal.valorantstory.fragment

import android.app.Activity
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import com.jincal.valorantstory.R
import com.jincal.valorantstory.agent.agentcard.RecyclerViewDecoration
import com.jincal.valorantstory.arsenal.Arsenal
import com.jincal.valorantstory.arsenal.arsenalcard.ArsenalCardRecyclerViewAdapter
import kotlinx.android.synthetic.main.fragment_contents_arsenal.view.*
import kotlinx.android.synthetic.main.recyclerview_item_map_card.view.*

class ArsenalContentsFragment: Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_contents_arsenal, container, false)
        val arsenals = arrayOf(
            Arsenal("tacticalknife", activity as Activity),
            Arsenal("classic", activity as Activity),
            Arsenal("shorty", activity as Activity),
            Arsenal("frenzy", activity as Activity),
            Arsenal("ghost", activity as Activity),
            Arsenal("sheriff", activity as Activity),
            Arsenal("stinger", activity as Activity),
            Arsenal("spectre", activity as Activity),
            Arsenal("bucky", activity as Activity),
            Arsenal("judge", activity as Activity),
            Arsenal("bulldog", activity as Activity),
            Arsenal("guardian", activity as Activity),
            Arsenal("vandal", activity as Activity),
            Arsenal("phantom", activity as Activity),
            Arsenal("marshal", activity as Activity),
            Arsenal("operator", activity as Activity),
            Arsenal("ares", activity as Activity),
            Arsenal("odin", activity as Activity)
        )
        with(view.ArsenalContentsFragmentRecyclerView) {
            adapter = ArsenalCardRecyclerViewAdapter(arsenals, this@ArsenalContentsFragment)
            layoutManager = LinearLayoutManager(activity)
            addItemDecoration(RecyclerViewDecoration(3, 3))
        }
        return view
    }
}