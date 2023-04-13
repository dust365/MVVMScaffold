package com.live.common.di


import com.live.common.user.UserApiService
import com.live.common.user.UserApiServiceIml
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent

/**
 * @author dust
 * @Date 2023/4/12
 * @function  用户信息提供者
 */
@Module
@InstallIn(SingletonComponent::class)
 abstract class UserModule {


//    @Singleton
    @Binds
    abstract fun bindUserInform(iml: UserApiServiceIml): UserApiService
}