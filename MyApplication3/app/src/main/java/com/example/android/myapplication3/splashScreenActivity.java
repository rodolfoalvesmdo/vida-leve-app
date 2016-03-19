package com.example.android.myapplication3;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;

/**
 * Created by Rodolfo Alves on 12/03/2016.
 */
public class splashScreenActivity extends Activity{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        /**
         * Show an image with the app's logo and description of content while app is loading.
         */
        Intent intent = new Intent(this, mainActivity.class);
        startActivity(intent);
        finish();
    }
}
