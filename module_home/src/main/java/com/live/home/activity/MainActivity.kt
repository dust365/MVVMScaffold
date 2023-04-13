package com.live.home.activity

import androidx.activity.viewModels
import androidx.navigation.findNavController
import androidx.navigation.ui.setupWithNavController
import com.alibaba.android.arouter.facade.annotation.Route
import com.google.android.material.bottomnavigation.BottomNavigationView
import com.live.core.ktx.observeLiveData
import com.live.common.constant.RouteUrl
import com.live.common.ui.BaseActivity
import com.live.home.databinding.HomeActivityMainBinding
import com.live.home.R

import dagger.hilt.android.AndroidEntryPoint

/**
 * 首页
 *
 * @author Qu Yunshuo
 * @since 5/22/21 2:26 PM
 */
@AndroidEntryPoint
@Route(path = RouteUrl.HomePage)
class MainActivity : BaseActivity<HomeActivityMainBinding, HomeViewModel>() {

    /**
     * 通过 viewModels() + Hilt 获取 ViewModel 实例
     */
    override val mViewModel by viewModels<HomeViewModel>()

    override fun HomeActivityMainBinding.initView() {

        val navView: BottomNavigationView = mBinding.navView
        val navController = findNavController(R.id.nav_host_fragment_activity_main)
        navView.setupWithNavController(navController)
    }


    override fun initObserve() {
        observeLiveData(mViewModel.data, ::processData)
        addOnContextAvailableListener {

        }

    }

    private fun processData(data: String) {
//        mBinding.vTvHello.text = data
//        mBinding.vTvHello.setTextColor(Color.BLUE)
    }

    override fun initRequestData() {
        // 模拟获取数据
        mViewModel.getData()
    }
}