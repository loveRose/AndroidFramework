package com.app.lvyerose.huan.fmk;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.app.lvyerose.huan.fmk.view.activity.AccountActivity;
import com.app.lvyerose.huan.framework.base.BaseHighestActivity;

public class MainActivity extends BaseHighestActivity {

    @Override
    protected void initView() {
    }

    @Override
    protected int getContentViewId() {
        return R.layout.activity_main;
    }

    public void onClickPart(View view) {
        //跳转LoginTestActivity
        Bundle data = new Bundle();
        data.putString("user_name", "lvyerose@163.com");
        Intent intent = new Intent(MainActivity.this, AccountActivity.class);
        intent.putExtras(data);
        startActivity(intent);
    }


}
