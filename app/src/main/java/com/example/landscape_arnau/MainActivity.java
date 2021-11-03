package com.example.landscape_arnau;

import androidx.appcompat.app.AppCompatActivity;

import android.animation.Animator;
import android.animation.AnimatorInflater;
import android.animation.ObjectAnimator;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    private int imageClick1 = 0;
    private int imageClick6 = 0;

    private ImageView image1;
    private ImageView image2;
    private ImageView image3;
    private ImageView image4;
    private ImageView image5;
    private ImageView image6;
    private ImageView image7;
    private ImageView image8;

    ObjectAnimator objectAnimator1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        image1 = (ImageView) findViewById(R.id.image1);
        image2 = (ImageView) findViewById(R.id.image2);
        image3 = (ImageView) findViewById(R.id.image3);
        image4 = (ImageView) findViewById(R.id.image4);
        image5 = (ImageView) findViewById(R.id.image5);
        image6 = (ImageView) findViewById(R.id.image6);
        image7 = (ImageView) findViewById(R.id.image7);
        image8 = (ImageView) findViewById(R.id.image8);

        image1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (imageClick1 < 1) {
                    Animator set;
                    set = AnimatorInflater.loadAnimator(MainActivity.this, R.animator.frontanimator);
                    set.setTarget(view);
                    set.start();
                    imageClick1++;
                } else {
                    Animator set;
                    set = AnimatorInflater.loadAnimator(MainActivity.this, R.animator.backanimator);
                    set.setTarget(view);
                    set.start();
                    imageClick1 = 0;
                }
            }
        });

        image6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (imageClick6 < 1){
                    Animator set;
                    set = AnimatorInflater.loadAnimator(MainActivity.this, R.animator.frontanimator2);
                    set.setTarget(view);
                    set.start();
                    imageClick6++;
                } else {
                    Animator set;
                    set = AnimatorInflater.loadAnimator(MainActivity.this, R.animator.backanimator2);
                    set.setTarget(view);
                    set.start();
                    imageClick6 = 0;
                }
            }
        });
    }
}