package com.example.sandesh.ledcontrol

import android.support.constraint.ConstraintLayout
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.TextView
import android.widget.Toast

class ConfigurationAdapter (private val myDataset: Array<Led>) :
        RecyclerView.Adapter<ConfigurationAdapter.MyViewHolder>() {

    // Provide a reference to the views for each data item
    // Complex data items may need more than one view per item, and
    // you provide access to all the views for a data item in a view holder.
    // Each data item is just a string in this case that is shown in a TextView.
    class MyViewHolder(val ledLayout: ConstraintLayout) : RecyclerView.ViewHolder(ledLayout)


    // Create new views (invoked by the layout manager)
    override fun onCreateViewHolder(parent: ViewGroup,
                                    viewType: Int): ConfigurationAdapter.MyViewHolder {
        // create a new view
        val ledView = LayoutInflater.from(parent.context)
                .inflate(R.layout.layout_led_item, parent, false) as ConstraintLayout
        // set the view's size, margins, paddings and layout parameters (i dont do that
        return MyViewHolder(ledView)
    }

    // Replace the contents of a view (invoked by the layout manager)
    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        // - get element from your dataset at this position
        // - replace the contents of the view with that element
        val ledElement = myDataset[position]

        val ledView: ConstraintLayout = holder.ledLayout
        println("stuff")
        ledView.getViewById(R.id.randomCheckBox).setOnClickListener{
           println("checkbox checked")
        }
        val ledName = ledView.getViewById(R.id.ledName) as TextView
        ledName.text = ledElement.name
    }

    // Return the size of your dataset (invoked by the layout manager)
    override fun getItemCount() = myDataset.size
}