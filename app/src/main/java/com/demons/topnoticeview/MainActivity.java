package com.demons.topnoticeview;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.demons.cookie.CookieBar;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void noticeViewClick(View view) {
        new CookieBar.Builder(MainActivity.this).setBackgroundColor(R.color.default_bg_color)
                .setMessage(R.string.notice_info)
                .setCookieBarHeight(dip2px(this, 88))
                .setTitleColor(R.color.white)
                .setDuration(1000)
                .show();
    }

    /**
     * dp转px
     *
     * @param context
     * @param dipValue
     * @return
     */
    public int dip2px(Context context, float dipValue) {
        final float scale = context.getResources().getDisplayMetrics().density;
        return (int) (dipValue * scale + 0.5f);
    }
}
