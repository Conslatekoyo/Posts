package dev.conslate.myposts

import android.icu.text.CaseMap

data class  Post(
    var userid: Int,
    var id: Int,
    var title: String,
    var body:String,
)
data class  Comment(
    var postid:Int,
    var id:String,
    var name:String,
    var email: String,
    var body: String,
)


