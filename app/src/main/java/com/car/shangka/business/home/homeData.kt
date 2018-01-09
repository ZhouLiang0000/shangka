package com.car.shangka.business.home

import com.car.shangka.R
import com.car.shangka.business.mine.MineFragment
import com.car.shangka.business.service.ServiceFragment
import com.car.shangka.business.tool.ToolFragment

/**
 * 作者：zhouliang
 * 时间：2018/1/9:22:20
 * 邮箱：18510971680@163.com
 * 说明：
 */
object homeData {
    val mainFragmentList = arrayOf(HomeFragment(), ToolFragment(), ServiceFragment(), MineFragment())
    val mainTabRes = listOf(R.mipmap.home_normol, R.mipmap.tool_normol,
            R.mipmap.service_normol, R.mipmap.mine_normol)
    val mainTabResPressed = listOf(R.drawable.ic_tab_home_selected, R.drawable.ic_tab_tool_selected,
            R.drawable.ic_tab_service_selected, R.drawable.ic_tab_mine_selected)
    val mainTabStr = listOf("首页", "工具", "服务", "我的")
}