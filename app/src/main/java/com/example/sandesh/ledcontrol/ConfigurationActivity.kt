package com.example.sandesh.ledcontrol

import android.os.Bundle
import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.RecyclerView
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class ConfigurationActivity : AppCompatActivity() {
    private lateinit var recyclerView: RecyclerView
    private lateinit var viewAdapter: RecyclerView.Adapter<*>
    private lateinit var viewManager: RecyclerView.LayoutManager

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_configuration_edit)
        viewManager = LinearLayoutManager(this)
        val basicLedObj: Led = Led("ledName", 0, 50, false)
        val myDataset: Array<Led> = Array(5, { i -> basicLedObj })

        viewAdapter = ConfigurationAdapter(myDataset)
        recyclerView = findViewById<RecyclerView>(R.id.ledOverview).apply {
            // use this setting to improve performance if you know that changes
            // in content do not change the layout size of the RecyclerView
            setHasFixedSize(true)

            // use a linear layout manager
            layoutManager = viewManager

            // specify an viewAdapter (see also next example)
            adapter = viewAdapter

        }
    }


}