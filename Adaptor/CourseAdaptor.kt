package com.yash.caproject.Adaptor

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.yash.caproject.Domain.CourseDomain
import com.yash.caproject.R

class CoursesAdapter(private val items: ArrayList<CourseDomain>) :
    RecyclerView.Adapter<CoursesAdapter.Viewholder>() {

    private lateinit var context: Context

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): Viewholder {
        val inflator = LayoutInflater.from(parent.context).inflate(R.layout.viewholder_list, parent, false)
        context = parent.context
        return Viewholder(inflator)
    }

    override fun onBindViewHolder(holder: Viewholder, position: Int) {
        holder.title.text = items[position].title
        holder.price.text = "S" + items[position].price
        val drawableResourceId = context.resources.getIdentifier(
            items[position].picPath,
            "drawable",
            context.packageName
        )
        Glide.with(context)
            .load(drawableResourceId)
            .into(holder.pic)
        when (position) {
            0 -> {
                holder.background_img.setImageResource(R.drawable.bg_1)
                holder.layout.setBackgroundResource(R.drawable.list_background_1)
            }

            1 -> {
                holder.background_img.setImageResource(R.drawable.bg_2)
                holder.layout.setBackgroundResource(R.drawable.list_background_2)
            }

            2 -> {
                holder.background_img.setImageResource(R.drawable.bg_3)
                holder.layout.setBackgroundResource(R.drawable.list_background_3)
            }

            3 -> {
                holder.background_img.setImageResource(R.drawable.bg_4)
                holder.layout.setBackgroundResource(R.drawable.list_background_4)
            }

            4 -> {
                holder.background_img.setImageResource(R.drawable.bg_5)
                holder.layout.setBackgroundResource(R.drawable.list_background_5)
            }
        }
    }

    override fun getItemCount(): Int {
        return items.size
    }

    inner class Viewholder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var title: TextView = itemView.findViewById(R.id.tittleTxt)
        var price: TextView = itemView.findViewById(R.id.priceTxt)
        var pic: ImageView = itemView.findViewById(R.id.pic)
        var background_img: ImageView = itemView.findViewById(R.id.background_img)
        var layout: ConstraintLayout = itemView.findViewById(R.id.mail_layout)
    }
}