package com.example.animation;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.view.animation.Interpolator;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onplayanim(View view){
        Animation anim= AnimationUtils.loadAnimation(this,R.anim.rotate);//change the xml file name

        anim.setInterpolator(new wobbyBounceInterpolator(0.3,30));
        findViewById(R.id.imageviewanim).startAnimation(anim);
    }

    private class wobbyBounceInterpolator implements Interpolator {
        private double amplitude;
        private double frequency;

        public wobbyBounceInterpolator(double amplitude, double frequency) {
            this.amplitude=amplitude;
            this.frequency=frequency;
        }

        @Override
        public float getInterpolation(float time) {
            return (float) (-1 * Math.pow(Math.E, -time / amplitude)*Math.cos(frequency * time) + 1);
        }
    }
}
