package com.example.textview_y;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextViewY textViewY = findViewById(R.id.tv);
        textViewY.setCustomText("android的屏幕碎片化严重，各种屏幕分辨率层出不穷，而在不同分辨率的屏幕上显示出一致的效果，是百度App的研发团队和视觉团队共同追求的目标。\n" +
                "在百度App的Android开发中，TextView的行间距屏幕适配问题在研发和视觉之间纠缠已久。!");
        TextView textView = findViewById(R.id.tv2);
        textView.setText("android的屏幕碎片化严重，各种屏幕分辨率层出不穷，而在不同分辨率的屏幕上显示出一致的效果，是百度App的研发团队和视觉团队共同追求的目标。\n" +
                "在百度App的Android开发中，TextView的行间距屏幕适配问题在研发和视觉之间纠缠已久。!");
    }
}