package com.example.jinhui.androiddemo.day23.send_data.fragment_activity;

import android.app.FragmentTransaction;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.FrameLayout;
import android.widget.TextView;

import com.example.jinhui.androiddemo.R;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * Created by jinhui on 2018/2/5.
 * Email:1004260403@qq.com
 */

public class Fragment_activityActivity extends AppCompatActivity {

    @BindView(R.id.textView1)
    TextView textView1;
    @BindView(R.id.fl)
    FrameLayout fl;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fragment_activity);
        ButterKnife.bind(this);

        FragmentTransaction tran = getFragmentManager().beginTransaction();
        tran.add(R.id.fl, new FragmentB());

        tran.commit();
    }

    public void setFragmentProgress(int progress) {
        textView1.setText(String.valueOf(progress));
    }
}
