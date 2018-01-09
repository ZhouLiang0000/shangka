package com.car.shangka.business.home

import android.app.Fragment
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.car.shangka.R

/**
 * 作者：zhouliang
 * 时间：2018/1/9:22:49
 * 邮箱：18510971680@163.com
 * 说明：
 */
class HomeFragment : Fragment() {
    override fun onCreateView(inflater: LayoutInflater?, container: ViewGroup?, savedInstanceState: Bundle?): View {
        return inflater!!.inflate(R.layout.fragment_home, container, false)
    }
}