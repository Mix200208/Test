package com.example.test.Model

class Post {
    private lateinit var nick:String
    private lateinit var text:String
    private lateinit var ImgUrl:String
    private var drawableResourse:Int

    val info :Int
        get() =  drawableResourse

    val text_info :String
        get() =  text
    val nick_info :String
        get() =  nick

    constructor( drawableResourse: Int,nick: String, text: String) {
        this.nick = nick
        this.text = text
        this.drawableResourse = drawableResourse
    }
    constructor(nick: String, text: String, ImgUrl: String, drawableResourse: Int) {
        this.nick = nick.toString()
        this.text = text
        this.ImgUrl = ImgUrl
        this.drawableResourse = drawableResourse
    }




}