package com.car.shangka.business.home

import android.content.Context
import android.os.Bundle
import android.support.design.widget.TabLayout
import android.view.LayoutInflater
import android.view.View
import com.car.shangka.R
import com.zl.mvp.utils.base.BaseMvpActivity
import kotlinx.android.synthetic.main.activity_home.*
import kotlinx.android.synthetic.main.tab_view.view.*

/**
 * 作者：zhouliang
 * 时间：2018/1/9:10:10
 * 邮箱：18510971680@163.com
 * 说明：
 */
class homeActivity : BaseMvpActivity<homeContract.View, homePersenter>(), homeContract.View {

    override var mPresenter: homePersenter = homePersenter()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)
        initView()
    }

    private fun initView() {
        bottom_tab_layout.addOnTabSelectedListener(object : TabLayout.OnTabSelectedListener {
            override fun onTabSelected(tab: TabLayout.Tab) {
                onTabItemSelected(tab.position)
                // Tab 选中之后，改变各个Tab的状态
                for (i in 0 until bottom_tab_layout.tabCount) {
                    val view = bottom_tab_layout.getTabAt(i)!!.customView

                    if (i == tab.position) { // 选中状态
                        view?.tab_content_image?.setImageResource(homeData.mainTabResPressed[i])
                        view?.tab_content_text?.setTextColor(resources.getColor(android.R.color.black))

                    } else {// 未选中状态
                        view?.tab_content_image?.setImageResource(homeData.mainTabRes[i])
                        view?.tab_content_text?.setTextColor(resources.getColor(android.R.color.darker_gray))
                    }
                }
            }

            override fun onTabUnselected(tab: TabLayout.Tab) {

            }

            override fun onTabReselected(tab: TabLayout.Tab) {

            }
        })

        for (i in 0..3) {
            bottom_tab_layout.addTab(bottom_tab_layout.newTab().setCustomView(getTabView(this, i)))
        }
    }

    private fun getTabView(context: Context, position: Int): View {
        val view = LayoutInflater.from(context).inflate(R.layout.tab_view, null)
        view.tab_content_image.setImageResource(homeData.mainTabRes[position])
        view.tab_content_text.text = homeData.mainTabStr[position]
        return view
    }

    fun onTabItemSelected(position: Int) {
        val transaction = fragmentManager.beginTransaction()
        transaction.replace(R.id.main_container, homeData.mainFragmentList[position]).commit()
    }

    override fun onDestroy() {
        super.onDestroy()
    }
}