package com.live.common.ui

import androidx.viewbinding.ViewBinding
import com.live.core.mvvm.v.BaseFrameFragment
import com.live.core.mvvm.vm.BaseViewModel

/**
 * Fragment基类
 *
 * @author Qu Yunshuo
 * @since 8/27/20
 */
abstract class BaseFragment<VB : ViewBinding, VM : BaseViewModel> : BaseFrameFragment<VB, VM>()