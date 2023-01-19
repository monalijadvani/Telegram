package com.example.telegram

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class ChatList(names: Array<String>): RecyclerView.Adapter<ChatList.ChatHolder>(){

    var names = names

    class ChatHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

        var nameItem = itemView.findViewById<TextView>(R.id.namesItem)

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ChatHolder {

        return  ChatHolder(LayoutInflater.from(parent.context).inflate(R.layout.chat_item,parent,false))


    }

    override fun onBindViewHolder(holder: ChatHolder, position: Int) {

        holder.nameItem.text = names[position]

    }

    override fun getItemCount(): Int {

        return  names.size
    }



}
