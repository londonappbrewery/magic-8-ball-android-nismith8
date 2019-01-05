package com.londonappbrewery.magiceightball;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final Button mAskButton = findViewById(R.id.button);
        final ImageView mBallImageView = findViewById(R.id.imageView);
        final int[] balls = {
                R.drawable.ball1,
                R.drawable.ball2,
                R.drawable.ball3,
                R.drawable.ball4,
                R.drawable.ball5
        };

        mAskButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Random rng = new Random();
                mBallImageView.setImageResource(balls[rng.nextInt(5)]);

            }
        });


    }
}
