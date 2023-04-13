package com.live.common.user


interface UserApiService {

    fun isLogin():Boolean
    fun userId():Int
    fun userName():String?
    fun saveUser(user: User)
}