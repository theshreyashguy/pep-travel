package com.example.travelers


import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.EditText
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.mikhaellopez.circularimageview.CircularImageView


class gcader(val gl:ArrayList<String>):RecyclerView.Adapter<gcader.Mainviewholder1>() {
    class Mainviewholder1( val itemBinding:View)
        :RecyclerView.ViewHolder(itemBinding){

            val textti : TextView = itemBinding.findViewById<TextView>(R.id.senttext)

        }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): gcader.Mainviewholder1 {
        val itemView = LayoutInflater.from(parent.context).inflate(R.layout.yel,parent,false)
        return gcader.Mainviewholder1(itemView)
    }

    override fun onBindViewHolder(holder: gcader.Mainviewholder1, position: Int) {
       val ss : String = gl[position]
        holder.textti.setText(ss)

    }

    override fun getItemCount(): Int {
        return gl.size
    }


}




