package com.example.retrofitsampleapp

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView

class UserAdapter(mainActivity: MainActivity, allUsers: ArrayList<UserModel>?) : RecyclerView.Adapter<UserViewHolder>() {

    var mainActivity:MainActivity?=null
    var allUsers:ArrayList<UserModel>?=null

    init {
        this.mainActivity = mainActivity
        this.allUsers = allUsers
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): UserViewHolder {
        //create viewholder
        return UserViewHolder(LayoutInflater.from(mainActivity).inflate(R.layout.item_photos,parent,false))
    }

    override fun onBindViewHolder(holder: UserViewHolder, position: Int) {
        val currentUser = allUsers!![position]
        holder.tvAlbumId.text = currentUser.albumId.toString()
        holder.tvId.text = currentUser.id.toString()
        holder.tvTitle.text = currentUser.title
        holder.tvUrl.text = currentUser.url
        holder.tvThumbnailUrl.text = currentUser.thumbnailUrl

    }

    override fun getItemCount(): Int {
        // tell the itemcount
        return  allUsers!!.size
    }
}