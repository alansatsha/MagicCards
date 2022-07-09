package com.concoeducation.magiccards;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentTransaction;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.view.WindowManager;
import android.view.animation.AnimationUtils;

public class qner extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_qner);

        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.KITKAT) {

            getWindow().setFlags(WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS,
                    WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS);
        }


        getSupportActionBar().hide();

        FragmentTransaction ft = getSupportFragmentManager().beginTransaction();

        txtch bbb = new txtch();
        ft.replace(R.id.lft, bbb);



        soucho bbba = new soucho();
        ft.replace(R.id.lft, bbba);


        ft.commit();


        Intent as = new Intent(getApplicationContext(), carsfrag.class);
        startActivity(as);
    }
}