package com.live.home.ui.home

import androidx.fragment.app.viewModels
import com.live.common.ui.BaseFragment
import com.live.home.databinding.HomeFragmentMainBinding
import dagger.hilt.android.AndroidEntryPoint


@AndroidEntryPoint
class HomeFragment : BaseFragment<HomeFragmentMainBinding, HomeViewModel>() {



    override val mViewModel by viewModels<HomeViewModel>()
    override fun initObserve() {

    }

    override fun initRequestData() {

    }

    override fun HomeFragmentMainBinding.initView() {

    }


}