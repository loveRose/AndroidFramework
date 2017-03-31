package com.app.lvyerose.huan.fmk.view.fragment;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
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
public class LoginFragment extends BasePartFragment {
    public static String FIRST_FRAGMENT = "login_fragment";
    private String msg;
    private EditText usernameEdt;
    private TextView registerTxt, promiseTxt;
    private ImageView backImg;


    public static LoginFragment newInstance(String msg) {
        LoginFragment fragment = new LoginFragment();
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
        usernameEdt = (EditText) view.findViewById(R.id.username_edt);
        usernameEdt.setText(msg);
        registerTxt = (TextView) view.findViewById(R.id.register_txt);
        registerTxt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                addFragment(RegisterFragment.newInstance(msg));
            }
        });

        backImg = (ImageView) view.findViewById(R.id.first_back);
        backImg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                removeFragment();
            }
        });

        promiseTxt = (TextView) view.findViewById(R.id.promise_txt);
        promiseTxt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                addFragment(ThirdFragment.newInstance());
            }
        });
    }

    @Override
    protected int getLayoutId() {
        return R.layout.fragment_login_layout;
    }
}
