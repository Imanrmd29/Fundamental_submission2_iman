package com.example.fundamental_submission2_iman.api

import com.example.fundamental_submission2_iman.model.DetailuserModel
import com.example.fundamental_submission2_iman.model.User
import com.example.fundamental_submission2_iman.model.UserModel
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Headers
import retrofit2.http.Path
import retrofit2.http.Query

interface ApiService {

    @GET("search/users")
    @Headers("Authorization: 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")
    fun getUser(
        @Query("q") query: String): Call<UserModel>


    @GET("users/{username}")
    @Headers("Authorization: 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")
    fun getUserDetail(
        @Path("username") username: String): Call<DetailuserModel>


    @GET("users/{username}/followers")
    @Headers("Authorization: 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")
    fun getUserFollowers(
        @Path("username") username: String): Call<ArrayList<User>>


    @GET("users/{username}/following")
    @Headers("Authorization: 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")
    fun getUserFollowing(
        @Path("username") username: String): Call<ArrayList<User>>
}