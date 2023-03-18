package com.example.travelers


import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.mikhaellopez.circularimageview.CircularImageView


class adapterc( val gl:ArrayList<groups>):RecyclerView.Adapter<adapterc.Mainviewholder>() {
    class Mainviewholder( val itemBinding:View,listner:onitemclicklistner)
        :RecyclerView.ViewHolder(itemBinding){

            val titlegr:TextView = itemBinding.findViewById(R.id.gname)
            val lastm:TextView = itemBinding.findViewById(R.id.glast)
            init{
                  itemBinding.setOnClickListener {
                        listner.onitemclick(adapterPosition)
                  }
            }
    }
      private lateinit var mlistner:onitemclicklistner
    interface onitemclicklistner  {
           fun onitemclick(position :Int)
    }
    fun onitemClickListner(listner:onitemclicklistner){
        mlistner = listner
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): Mainviewholder {
        val itemView = LayoutInflater.from(parent.context).inflate(R.layout.rvlayoutgrou,parent,false)
        return Mainviewholder(itemView,mlistner)
    }

    override fun onBindViewHolder(holder: Mainviewholder, position: Int) {
       val currentitem = gl[position]
        holder.titlegr.setText(currentitem.groupname)
        holder.lastm.setText(currentitem.lastmessage)

    }

    override fun getItemCount(): Int {
        return gl.size
    }


}