package com.live.common.user

import android.content.Context
import dagger.hilt.android.qualifiers.ApplicationContext
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class UserApiServiceIml @Inject constructor(@ApplicationContext val context: Context)  :
    UserApiService {

    override fun isLogin(): Boolean {
       return UserManager.isLogin()
    }

    override fun userId(): Int {
        return UserManager.getUserInform().userId
    }

    override fun userName(): String? {
        return UserManager.getUserInform().userName
    }

    override fun saveUser(user: User) {
        UserManager.savaUser(user)
    }
}