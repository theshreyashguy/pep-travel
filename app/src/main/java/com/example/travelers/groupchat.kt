package com.example.travelers

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.travelers.databinding.ActivityGroupchatBinding

class groupchat : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_groupchat)
        val ttx = findViewById<TextView>(R.id.mainhu)
        val s:String = savedname.gg.groupname
        ttx.setText(s)

        val sendbtn = findViewById<EditText>(R.id.messagetext)
        val tt = findViewById<Button>(R.id.daba)
        var messagelist =  grouplist.gchat
        val adapter1 = gcader(messagelist)
        val gcrecycle = findViewById<RecyclerView>(R.id.group_recyv)
        gcrecycle.adapter = adapter1
        gcrecycle.layoutManager = LinearLayoutManager(this, LinearLayoutManager.VERTICAL,false)
        tt.setOnClickListener {
            val st = sendbtn.text.toString()
            messagelist.add(st)
            val ss1:String? = ""
            sendbtn.setText(ss1)
            adapter1.notifyDataSetChanged()
        }
    }
}