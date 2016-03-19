package com.example.android.myapplication3;

import android.app.Activity;
import android.content.Intent;
import android.media.Image;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;

public class mainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_layout);

        /**
         * Change screen and show recipe 1 when image is clicked.
         */
        ImageView receitaUmImage = (ImageView) findViewById(R.id.receitaUm);
        receitaUmImage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent receitaUmScreen = new Intent(getApplicationContext(), receitaUmActivity.class);
                startActivity(receitaUmScreen);
            }
        });

        /**
         * Change screen and show recipe 2 when image is clicked.
         */
        ImageView receitaDoisImage = (ImageView) findViewById(R.id.receitaDois);
        receitaDoisImage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent receitaDoisScreen = new Intent(getApplicationContext(), receitaDoisActivity.class);
                startActivity(receitaDoisScreen);
            }
        });

        /**
         * Change screen and show recipe 3 when image is clicked.
         */
        ImageView receitaTresImage = (ImageView) findViewById(R.id.receitaTres);
        receitaTresImage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent receitaTresScreen = new Intent(getApplicationContext(), receitaTresActivity.class);
                startActivity(receitaTresScreen);
            }
        });

        /**
         * Change screen and show recipe 4 when image is clicked.
         */
        ImageView receitaQuatroImage = (ImageView) findViewById(R.id.receitaQuatro);
        receitaQuatroImage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent receitaQuatroScreen = new Intent(getApplicationContext(), receitaQuatroActivity.class);
                startActivity(receitaQuatroScreen);
            }
        });

        /**
         * Change screen and show recipe 5 when image is clicked.
         */
        ImageView receitaCincoImage = (ImageView) findViewById(R.id.receitaCinco);
        receitaCincoImage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent receitaCincoScreen = new Intent(getApplicationContext(), receitaCincoActivity.class);
                startActivity(receitaCincoScreen);
            }
        });
    }
}
