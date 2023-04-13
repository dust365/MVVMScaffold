package com.live.common.user

object UserManager {

   private var user: User?=null

    fun isLogin():Boolean{
        return  user?.isLogin?:false
    }

    fun getUserInform(): User {
        return  user ?: User()
    }

    fun savaUser(user: User){
       UserManager.user =user
    }
}