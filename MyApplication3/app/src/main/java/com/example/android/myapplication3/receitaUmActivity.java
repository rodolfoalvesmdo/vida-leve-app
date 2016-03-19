package com.example.android.myapplication3;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;

/**
 * Created by Rodolfo Alves on 12/03/2016.
 */
public class receitaUmActivity extends Activity{

    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.receita_um_layout);

        /**
         * Return to home screen when the button is clicked
         */
        ImageButton buttonToReturn = (ImageButton) findViewById(R.id.imageReturnButton);
        buttonToReturn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }

}
