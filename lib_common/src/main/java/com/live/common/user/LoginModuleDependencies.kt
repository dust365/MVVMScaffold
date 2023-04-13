package com.live.common.user


import dagger.hilt.EntryPoint
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent

@EntryPoint
@InstallIn(SingletonComponent::class)
interface LoginModuleDependencies {

//    @AuthInterceptorOkHttpClient
//    fun okHttpClient(): OkHttpClient
    fun userApiService(): UserApiService

    //
//@AuthInterceptorOkHttpClient
////@Provides
//fun provideAuthInterceptorOkHttpClient(): OkHttpClient {
//    return OkHttpClient.Builder()
//        .build()
//}

}



