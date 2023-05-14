package com.example.s4dpafragments.ui.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.s4dpafragments.R
import com.example.s4dpafragments.ui.fragments.adapter.SongAdapter
import com.example.s4dpafragments.ui.fragments.model.SongModel


class MusicaFragment : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view: View = inflater.inflate(R.layout.fragment_musica, container, false)

        val rvMusica: RecyclerView = view.findViewById(R.id.rvMusica)
        rvMusica.layoutManager = LinearLayoutManager(requireContext())
        rvMusica.adapter =SongAdapter(listSong())

        return view
    }

    private fun listSong():List<SongModel>{
        val lstSong: ArrayList<SongModel> = ArrayList()

        lstSong.add(SongModel(1,R.drawable.a2002,"Cancion1","Album1","20,000","3:36"))
        lstSong.add(SongModel(1,R.drawable.a2012,"Cancion2","Album2","30,000","3:00"))
        lstSong.add(SongModel(1,R.drawable.a2014,"Cancion3","Album3","40,000","3:15"))
        lstSong.add(SongModel(1,R.drawable.a2017,"Cancion4","Album4","50,000","3:12"))
        lstSong.add(SongModel(1,R.drawable.a2021,"Cancion5","Album5","60,000","3:20"))

        return lstSong
    }


}