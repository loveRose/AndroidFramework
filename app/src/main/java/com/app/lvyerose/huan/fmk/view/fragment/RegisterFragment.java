package com.app.lvyerose.huan.fmk.view.fragment;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.app.lvyerose.huan.fmk.R;
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
public class RegisterFragment extends BasePartFragment {
    public static String FIRST_FRAGMENT = "regist_fragment";
    private String msg;
    private TextView registerTxt;
    private ImageView backImg;


    public static RegisterFragment newInstance(String msg) {
        RegisterFragment fragment = new RegisterFragment();
        Bundle bundle = new Bundle();
        bundle.putSerializable(FIRST_FRAGMENT, msg);
        fragment.setArguments(bundle);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (null != getArguments()) {
            msg = (String) getArguments().getSerializable(FIRST_FRAGMENT);
        }
    }

    @Override
    protected void initView(View view, Bundle savedInstanceState) {
        registerTxt = (TextView) view.findViewById(R.id.register_tv);
        registerTxt.setText(msg + "--用户来注册咯");

        backImg = (ImageView) view.findViewById(R.id.first_back);
        backImg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                removeFragment();
            }
        });

    }

    @Override
    protected int getLayoutId() {
        return R.layout.fragment_register_layout;
    }
}
