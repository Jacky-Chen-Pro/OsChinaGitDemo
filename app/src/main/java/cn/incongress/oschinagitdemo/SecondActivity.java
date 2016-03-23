package cn.incongress.oschinagitdemo;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

/**
 * Created by Jacky on 2016/3/23.
 */
public class SecondActivity extends AppCompatActivity {
    private TextView mTvHello;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        mTvHello = (TextView) findViewById(R.id.tv_home);

        mTvHello.setText("我是第二页");
    }
}
