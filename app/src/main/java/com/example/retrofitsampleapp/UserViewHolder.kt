package com.example.retrofitsampleapp

import android.view.View
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class UserViewHolder(itemView: View) :RecyclerView.ViewHolder(itemView) {
    var tvAlbumId:TextView
    var tvId:TextView
    var tvTitle:TextView
    var tvUrl:TextView
    var tvThumbnailUrl:TextView

    init {
        tvAlbumId = itemView.findViewById(R.id.tvAlbumId)
        tvId = itemView.findViewById(R.id.tvId)
        tvTitle = itemView.findViewById(R.id.tvTitle)
        tvUrl = itemView.findViewById(R.id.tvUrl)
        tvThumbnailUrl = itemView.findViewById(R.id.tvThumbnailUrl)
    }


}