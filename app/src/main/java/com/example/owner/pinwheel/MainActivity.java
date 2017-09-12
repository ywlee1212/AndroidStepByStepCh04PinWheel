package com.example.owner.pinwheel;

import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.animation.LinearInterpolator;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ImageView iv= (ImageView) findViewById(R.id.pinwheel);

        ObjectAnimator objectAnimator=ObjectAnimator.ofFloat(iv,"rotation",360);
        objectAnimator.setInterpolator(new LinearInterpolator());
        objectAnimator.setDuration(2000);
        objectAnimator.setRepeatCount(ValueAnimator.INFINITE);
        objectAnimator.start();
    }
}
