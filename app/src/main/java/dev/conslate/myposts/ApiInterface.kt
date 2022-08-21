package dev.conslate.myposts

import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Path

interface ApiInterface {
    @GET("/posts")
    fun getPosts(): Call<List<Post>>

    @GET("/posts/{postId}")
    fun getPostsById(@Path("postId") postId:Int):Call<Post>

    @GET("/comments")
    fun getComments(): Call<List<Comment>>

    @GET("/posts/postsId/comments")
    fun getCommentsbyId(@Path("postId") commentId:Int):Call<List<Comment>>
}
