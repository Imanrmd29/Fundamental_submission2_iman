package com.example.fundamental_submission2_iman.model

import com.google.gson.annotations.SerializedName

data class  UserModel(
    @field:SerializedName("items")
    val item : ArrayList<User>


)