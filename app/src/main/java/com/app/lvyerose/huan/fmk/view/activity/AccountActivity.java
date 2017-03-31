package com.app.lvyerose.huan.fmk.view.activity;

import android.content.Intent;
import android.os.Bundle;

import com.app.lvyerose.huan.fmk.view.fragment.LoginFragment;
import com.app.lvyerose.huan.framework.base.part.BasePartActivity;
import com.app.lvyerose.huan.framework.base.part.BasePartFragment;

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
 * 类描述： 
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
public class AccountActivity extends BasePartActivity {
    private String userName;

    @Override
    protected void initViews() {

    }

    @Override
    protected void handleIntent(Intent intent) {
        super.handleIntent(intent);
        super.handleIntent(intent);
        Bundle bundle = intent.getExtras();
        if (null != bundle) {
            userName = bundle.getString("user_name");
        }
    }

    @Override
    protected BasePartFragment getFirstFragment() {
        return LoginFragment.newInstance(userName);
    }
}
