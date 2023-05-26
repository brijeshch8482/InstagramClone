package com.example.instagramclone.Model

class User
{
    private var userName: String = ""
    private var fullName: String = ""
    private var bio: String = ""
    private var image: String = ""
    private var uid: String = ""

    constructor()


    constructor(username: String, fullName: String, bio: String,  image: String, uid: String)
    {
        this.userName = username
        this.fullName = fullName
        this.bio = bio
        this.image = image
        this.uid = uid
    }

    fun getUsername(): String
    {
        return userName
    }

    fun setUsername(username: String)
    {
        this.userName = username
    }

    fun getFullname(): String
    {
        return fullName
    }

    fun setFullname(fullName: String)
    {
        this.fullName = fullName
    }

    fun getBio(): String
    {
        return bio
    }

    fun setBio(bio: String)
    {
        this.bio = bio
    }

    fun getImage(): String
    {
        return image
    }

    fun setImage(image: String)
    {
        this.image = image
    }

    fun getUID(): String
    {
        return uid
    }

    fun setUID(uid: String)
    {
        this.uid = uid
    }
}