package com.com.kotlinretrofit2rxjavaproject.Retrofit

import com.com.kotlinretrofit2rxjavaproject.Model.Post
import io.reactivex.Observable
import retrofit2.http.GET

interface MyAPI {
    @get : GET("posts")
    val posts:Observable<List<Post>>
}