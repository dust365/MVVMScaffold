package com.live.login

import android.content.Context
import com.live.common.user.LoginModuleDependencies


import dagger.BindsInstance
import dagger.Component

@Component(dependencies = [LoginModuleDependencies::class])
interface LoginComponent {

    fun inject(activity: LoginActivity)

    @Component.Builder
    interface Builder {
        fun context(@BindsInstance context: Context): Builder
        fun appDependencies(loginModuleDependencies: LoginModuleDependencies): Builder
        fun build(): LoginComponent
    }
}