package com.demo.roomdemo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProviders
import androidx.recyclerview.widget.DividerItemDecoration
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.StaggeredGridLayoutManager.VERTICAL
import com.demo.roomdemo.db.BookEntity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(), RecyclerViewAdapter.RowClickListener {

    lateinit var recyclerViewAdapter: RecyclerViewAdapter
    lateinit var viewModel: MainActivityViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)



        recyclerView.apply {
            layoutManager = LinearLayoutManager(this@MainActivity)
            recyclerViewAdapter = RecyclerViewAdapter(this@MainActivity)
            adapter = recyclerViewAdapter
            val divider = DividerItemDecoration(applicationContext, VERTICAL)
            addItemDecoration(divider)
        }

        viewModel = ViewModelProviders.of(this).get(MainActivityViewModel::class.java)
        viewModel.getAllUsersObservers().observe(this, Observer {
            recyclerViewAdapter.setListData(ArrayList(it))
            recyclerViewAdapter.notifyDataSetChanged()
        })


        saveButton.setOnClickListener {
            val title = titleInput.text.toString()
            val pages = pagesInput.text.toString()
            val editorial = editorialInput.text.toString()
            val author = authorInput.text.toString()
            val description = descriptionInput.text.toString()
            val photoUrl = photoUrlInput.text.toString()
            if(saveButton.text.equals("Save")) {
                val user = BookEntity(0, title = title, pages = pages, editorial = editorial, author = author, description = description, photourl = photoUrl)
                viewModel.insertUserInfo(user)
            }
            titleInput.setText("")
            pagesInput.setText("")
            editorialInput.setText("")
            authorInput.setText("")
            descriptionInput.setText("")
            photoUrlInput.setText("")
        }
    }



    override fun onDeleteUserClickListener(book: BookEntity) {
        viewModel.deleteUserInfo(book)
    }

    override fun onItemClickListener(book: BookEntity) {
        titleInput.setText(book.title)
        pagesInput.setText(book.pages)
        editorialInput.setText(book.editorial)
        authorInput.setText(book.author)
        descriptionInput.setText(book.description)
        photoUrlInput.setText(book.photourl)
        saveButton.setText("Update")
    }
}