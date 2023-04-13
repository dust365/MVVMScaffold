package com.live.common.ui

import android.util.Log
import androidx.viewbinding.ViewBinding
import com.live.core.mvvm.v.BaseFrameActivity
import com.live.core.mvvm.vm.BaseViewModel
import com.live.core.utils.ActivityStackManager
import com.live.core.utils.AndroidBugFixUtils
import com.live.core.utils.BarUtils

/**
 * Activity基类
 *
 * @author Qu Yunshuo
 * @since 8/27/20
 */
abstract class BaseActivity<VB : ViewBinding, VM : BaseViewModel> : com.live.core.mvvm.v.BaseFrameActivity<VB, VM>() {

    /**
     * 设置状态栏
     * 子类需要自定义时重写该方法即可
     * @return Unit
     */
    override fun setStatusBar() {
        BarUtils.transparentStatusBar(this)
        BarUtils.setStatusBarLightMode(this, true)
    }

    override fun onResume() {
        super.onResume()
        Log.d("ActivityLifecycle", "ActivityStack: ${ActivityStackManager.activityStack}")
    }

    override fun onDestroy() {
        super.onDestroy()
        // 解决某些特定机型会触发的Android本身的Bug
        AndroidBugFixUtils().fixSoftInputLeaks(this)
    }
}