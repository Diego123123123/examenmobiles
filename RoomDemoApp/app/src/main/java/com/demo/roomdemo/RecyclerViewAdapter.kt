package com.demo.roomdemo

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.demo.roomdemo.db.BookEntity
import kotlinx.android.synthetic.main.recyclerview_row.view.*

class RecyclerViewAdapter(val listener: RowClickListener): RecyclerView.Adapter<RecyclerViewAdapter.MyViewHolder>() {
    var items  = ArrayList<BookEntity>()

    fun setListData(data: ArrayList<BookEntity>) {
        this.items = data
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerViewAdapter.MyViewHolder {
       val inflater = LayoutInflater.from(parent.context).inflate(R.layout.recyclerview_row, parent, false)
        return MyViewHolder(inflater, listener)
    }

    override fun getItemCount(): Int {
        return items.size
    }

    override fun onBindViewHolder(holder: RecyclerViewAdapter.MyViewHolder, position: Int) {
        holder.itemView.setOnClickListener {
            listener.onItemClickListener(items[position])
        }
        holder.bind(items[position])
    }



    class MyViewHolder(view: View, val listener: RowClickListener): RecyclerView.ViewHolder(view) {
        val tvTitle = view.tvTitle
        val tvPages = view.tvPages
        val tvEditorial = view.tvEditorial
        val tvAuthor = view.tvAuthor
        val tvDescription = view.tvDescription
        val tvPhotoUrl = view.tvPhotoUrl
        val deleteUserID = view.deleteUserID

        fun bind(data: BookEntity) {
            tvTitle.text = data.title
            tvPages.text = data.pages
            tvEditorial.text = data.editorial
            tvAuthor.text = data.author
            tvDescription.text = data.description
            tvPhotoUrl.text = data.photourl
            deleteUserID.setOnClickListener {
                listener.onDeleteUserClickListener(data)
            }
        }
    }

    interface RowClickListener{
        fun onDeleteUserClickListener(book: BookEntity)
        fun onItemClickListener(book: BookEntity)
    }
}