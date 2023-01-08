package com.example.retrofitsampleapp

class UserModel {
    var albumId:Int
    var id:Int
    var title:String
    var url:String
    var thumbnailUrl:String

    constructor(albumId: Int, id: Int, title: String, url: String, thumbnailUrl: String) {
        this.albumId = albumId
        this.id = id
        this.title = title
        this.url = url
        this.thumbnailUrl = thumbnailUrl
    }
}