package com.example.bundle

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val myFragment = MyFragment()
        val manager = supportFragmentManager


        btn_give.setOnClickListener {
            val transaction = manager.beginTransaction()
            transaction.replace(R.id.fragment, myFragment).commit()

            val bundle = Bundle()

            bundle.putInt("image",R.drawable.seal)
        bundle.putString("id", et_id.text.toString())
//        bundle.putString("id", "1111")

            bundle.putString("sex", et_sex.text.toString())
            myFragment.arguments = bundle

            Log.i("***5555", "${et_id.text.toString()}")
        }


    }
}
