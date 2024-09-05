package com.devspace.recyclerview

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        // Set adapter
        // Linear Layout Manager
        // Submeter a lista


        val rvList = findViewById<RecyclerView>(R.id.rv_list)
        val adapter = ContactListAdapter()

        rvList.adapter = adapter
        rvList.layoutManager = LinearLayoutManager(this)
        adapter.submitList(contacts)

    }
}

val contacts = listOf(
    Contact(
        name = "Dax",
        phone = "+351 931 322 434",
        icon = R.drawable.sample1
    ),
    Contact(
        name = "Dax",
        phone = "+351 931 322 434",
        icon = R.drawable.sample2
    ),
    Contact(
        name = "Dax",
        phone = "+351 931 322 434",
        icon = R.drawable.sample3
    ),
    Contact(
        name = "Dax",
        phone = "+351 931 322 434",
        icon = R.drawable.sample4
    ),
    Contact(
        name = "Dax",
        phone = "+351 931 322 434",
        icon = R.drawable.sample5
    ),
    Contact(
        name = "Dax",
        phone = "+351 931 322 434",
        icon = R.drawable.sample6
    ),
    Contact(
        name = "Dax",
        phone = "+351 931 322 434",
        icon = R.drawable.sample7
    ),
    Contact(
        name = "Dax",
        phone = "+351 931 322 434",
        icon = R.drawable.sample8
    ),
    Contact(
        name = "Dax",
        phone = "+351 931 322 434",
        icon = R.drawable.sample9
    ),
    Contact(
        name = "Dax",
        phone = "+351 931 322 434",
        icon = R.drawable.sample10
    ),
    Contact(
        name = "Dax",
        phone = "+351 931 322 434",
        icon = R.drawable.sample11
    ),
    Contact(
        name = "Dax",
        phone = "+351 931 322 434",
        icon = R.drawable.sample12
    ),
    Contact(
        name = "Dax",
        phone = "+351 931 322 434",
        icon = R.drawable.sample13
    ),
    Contact(
        name = "Dax",
        phone = "+351 931 322 434",
        icon = R.drawable.sample14
    ),
    Contact(
        name = "Dax",
        phone = "+351 931 322 434",
        icon = R.drawable.sample15
    ),
    Contact(
        name = "Dax",
        phone = "+351 931 322 434",
        icon = R.drawable.sample16
    )
)