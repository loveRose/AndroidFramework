package com.app.lvyerose.huan.framework.base.part;

import android.content.Intent;
import android.view.KeyEvent;

import com.app.lvyerose.huan.framework.R;
import com.app.lvyerose.huan.framework.base.BaseHighestActivity;


/************************************************************************
 *                    .::::.                                            *
 *                  .::::::::.                                          *
 *                 :::::::::::  FUCK YOU                                *
 *             ..:::::::::::'                                           *
 *           '::::::::::::'                                             *
 *             .::::::::::                                              *
 *        '::::::::::::::..                                             *
 *             ..::::::::::::.                                          *
 *           ``::::::::::::::::                                         *
 *            ::::``:::::::::'        .:::.                             *
 *           ::::'   ':::::'       .::::::::.                           *
 *         .::::'      ::::     .:::::::'::::.                          *
 *        .:::'       :::::  .:::::::::' ':::::.                        *
 *       .::'        :::::.:::::::::'      ':::::.                      *
 *      .::'         ::::::::::::::'         ``::::.                    *
 *  ...:::           ::::::::::::'              ``::.                   *
 * ```` ':.          ':::::::::'                  ::::..                *
 *                    '.:::::'                    ':'````..             *
 *              ━━━━━━━━━━━━━━━━━━━━━                                   *
 ************************************************************************
 *
 * 项目名称：AndroidFramework
 * 类描述： 片段化编程Activity父类
 * 创建人：lvyerose
 * 邮箱：lvyerose@163.com
 * 创建时间：17/3/31
 *
 * 修改人：
 * 修改时间：
 * 修改备注：
 *
 *  ......
 */
public abstract class BasePartActivity extends BaseHighestActivity {

    @Override
    protected void initView() {
        if (getSupportActionBar() != null) {
            getSupportActionBar().hide();
        }
        if (null != getIntent()) {
            handleIntent(getIntent());
        }
        //避免重复添加Fragment
        if (getSupportFragmentManager().getFragments() == null) {
            BasePartFragment firstFragment = getFirstFragment();
            if (null != firstFragment) {
                addFragment(firstFragment);
            }
        }
    }

    //承接下去的 初始化方法
    protected abstract void initViews();

    //获取第一个fragment
    protected abstract BasePartFragment getFirstFragment();

    //获取Intent
    protected void handleIntent(Intent intent) {
    }


    //添加fragment
    protected void addFragment(BasePartFragment fragment) {
        if (fragment != null) {
            getSupportFragmentManager().beginTransaction()
                    .replace(getFragmentContentId(), fragment, fragment.getClass().getSimpleName())
                    .addToBackStack(fragment.getClass().getSimpleName())
                    .commitAllowingStateLoss();
        }
    }

    //移除fragment
    protected void removeFragment() {
        if (getSupportFragmentManager().getBackStackEntryCount() > 1) {
            getSupportFragmentManager().popBackStack();
        } else {
            finish();
        }
    }

    //返回键返回事件
    @Override
    public boolean onKeyDown(int keyCode, KeyEvent event) {
        if (KeyEvent.KEYCODE_BACK == keyCode) {
            if (getSupportFragmentManager().getBackStackEntryCount() == 1) {
                finish();
                return true;
            }
        }
        return super.onKeyDown(keyCode, event);
    }


    @Override
    protected int getContentViewId() {
        return R.layout.activity_base;
    }

    //布局中Fragment的ID
    protected int getFragmentContentId() {
        return R.id.part_fragment_container;
    }


}
