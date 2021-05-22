package com.example.test.Model

class Post {
    private lateinit var nick:String
    private lateinit var text:String
    private lateinit var ImgUrl:String
    private var drawableResourse:Int

    val info :Int
        get() =  drawableResourse

    constructor( drawableResourse: Int) {

        this.drawableResourse = drawableResourse
    }
    constructor(nick: Int, text: String, ImgUrl: String, drawableResourse: Int) {
        this.nick = nick.toString()
        this.text = text
        this.ImgUrl = ImgUrl
        this.drawableResourse = drawableResourse
    }




}