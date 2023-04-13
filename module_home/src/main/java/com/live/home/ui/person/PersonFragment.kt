package com.live.home.ui.person


import androidx.fragment.app.viewModels
import com.live.common.ui.BaseFragment
import com.live.home.databinding.HomeFragmentPersonBinding

class PersonFragment : BaseFragment<HomeFragmentPersonBinding, PersonViewModel>() {

    override val mViewModel by viewModels<PersonViewModel>()
    override fun initObserve() {

    }

    override fun initRequestData() {

    }

    override fun HomeFragmentPersonBinding.initView() {

    }

}