package br.com.packapps.androidroom_arc

import android.content.Context
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView

class MyRecycleViewAdapter(val context: Context) : RecyclerView.Adapter<MyRecycleViewAdapter.MyHolder>() {
    var listData : MutableList<String> = mutableListOf()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyHolder {
        return MyHolder(LayoutInflater.from(context).inflate(R.layout.item_data, parent, false))
    }

    override fun getItemCount(): Int {
        return listData.size
    }

    override fun onBindViewHolder(holder: MyHolder, position: Int) {
        holder.tvName.setText(listData.get(position))
    }


    class MyHolder(itemView: View?) : RecyclerView.ViewHolder(itemView) {
        var tvName = itemView!!.findViewById<TextView>(R.id.tvName)

    }
}


