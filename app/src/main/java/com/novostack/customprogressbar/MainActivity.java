package com.novostack.customprogressbar;

import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
     private ImageView mImageView;
     private ViewDialog viewDialog;
     private Button mShowDialog;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        viewDialog = new ViewDialog(this);
        mShowDialog = findViewById(R.id.button_show);
        mShowDialog.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                     viewDialog.showDialog();
                Handler handler = new Handler();
                handler.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                viewDialog.hideDialog();
                    }
                },4000);
            }
        });

    }
}
