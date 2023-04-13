package com.live.login


import android.os.Bundle
import androidx.activity.viewModels
import coil.load
import com.alibaba.android.arouter.launcher.ARouter
import com.live.login.databinding.LoginActivityBinding
import com.live.common.constant.RouteUrl
import com.live.common.ui.BaseActivity
import com.live.common.user.LoginModuleDependencies

import com.live.common.user.UserApiService
import dagger.hilt.android.AndroidEntryPoint
import dagger.hilt.android.EntryPointAccessors
import javax.inject.Inject

@AndroidEntryPoint
class LoginActivity: BaseActivity<LoginActivityBinding, LoginViewMode>() {

    @Inject
    lateinit var userService: UserApiService
//


    override fun onCreate(savedInstanceState: Bundle?) {
            DaggerLoginComponent.builder()
            .context(this)
            .appDependencies(EntryPointAccessors.fromApplication(applicationContext, LoginModuleDependencies::class.java))
            .build()
            .inject(this)
        super.onCreate(savedInstanceState)
    }


    override val mViewModel by viewModels<LoginViewMode>()

    override fun initObserve() {

    }

    override fun initRequestData() {
        userService.isLogin()
    }

    override fun LoginActivityBinding.initView() {
        //coil
         mBinding.loginImageview.load("https://camo.githubusercontent.com/4c5ad7af6eb11acdaa1c6207dcd422cec15ff2807250f72676331099da1a8ad0/68747470733a2f2f666972656261736573746f726167652e676f6f676c65617069732e636f6d2f76302f622f706572736f6e616c776562736974652d63626164342e61707073706f742e636f6d2f6f2f44616767657225323032253230746f25323048696c74253230496e2532304d756c74692532304d6f64756c65253230417070253246696d67696d6777686974652e706e673f616c743d6d6564696126746f6b656e3d39613361616262362d643964372d343137622d616665632d303232373531396532353462")

//        userService.isLogin()

        //
         mBinding.loginButton.setOnClickListener {

             ARouter.getInstance().build(RouteUrl.HomePage).navigation();

         }
    }

}