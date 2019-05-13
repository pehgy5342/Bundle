package com.example.bundle


import android.os.Bundle
import android.support.v4.app.Fragment
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import kotlinx.android.synthetic.main.fragment_my.view.*


class MyFragment : Fragment() {
    var getId :String?=null
    var getSex :String?=null
    var getImage :Int?=null



    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?
    ): View? {
        val view = LayoutInflater.from(context).inflate(R.layout.fragment_my, container, false)


        arguments?.let {
            getId = it.getString("id")
          getSex = it.getString("sex")
        getImage = it.getInt("image")

        }


        view.tv_id.text = getId
        view.tv_sex.text = getSex
        view.iv_seal.setImageResource(getImage!!)

        Log.i("*****","$getId")

        return view
    }




}
