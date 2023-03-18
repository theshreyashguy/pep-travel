package com.example.travelers

import android.app.Activity
import android.app.Dialog
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.renderscript.ScriptGroup.Binding
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.FrameLayout
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView


import kotlin.math.log

class MainActivity3 : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main3)
       val glo =  ArrayList<groups>()
        glo.add( groups("shimla chalo","bhai kabh chalna hian"))
        glo.add(groups("college k dost","bhai chicken k paise bhej"))
        glo.add(groups("24 march club","bhai chandigarh main sahi scene hain"))
        glo.add(groups("ayodhya chalenge","Jai shree Ram"))
        glo.add(groups("ICPC team coders","bhai 333 bhej de"))






        val ader = adapterc(glo)
        val rec = findViewById<RecyclerView>(R.id.recyclerView)
        rec.layoutManager = LinearLayoutManager(this,LinearLayoutManager.VERTICAL,false)
        rec.adapter = ader
    ader.onitemClickListner(object : adapterc.onitemclicklistner{
        override fun onitemclick(position: Int) {
            var l = glo[position].groupname
           savedname.gg.groupname = l

            val inten = Intent(this@MainActivity3,groupchat::class.java)
            startActivity(inten)

        }

    })

        val fn = findViewById<FrameLayout>(R.id.flStart1)
        fn.setOnClickListener{
            val diag = Dialog(this)
            diag.setContentView(R.layout.activity_create_group)
            val btsb = diag.findViewById<Button>(R.id.submt)
            val name = diag.findViewById<EditText>(R.id.createname)
            val amt = diag.findViewById<EditText>(R.id.budget)
            btsb.setOnClickListener {
                glo.add(groups(name.text.toString(),amt.text.toString()))
                ader.notifyDataSetChanged()
                diag.dismiss()
            }

            diag.show()

        }

    }
}