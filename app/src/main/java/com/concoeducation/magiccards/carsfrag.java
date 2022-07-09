package com.concoeducation.magiccards;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.drawable.Drawable;
import android.media.Image;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.Toast;

import com.lorentzos.flingswipe.SwipeFlingAdapterView;

import java.util.ArrayList;

import eightbitlab.com.blurview.BlurView;
import eightbitlab.com.blurview.RenderScriptBlur;

public class carsfrag extends AppCompatActivity {




    private ImageButton mab;
    private ImageButton mbb;
    private ImageButton mcb;
    private ImageButton mdb;

    ArrayList<String> mccc;
    ArrayList<lmj> al;
    BlurView blurView;

    mlist  mlista;

    int gh=0;
    SwipeFlingAdapterView flingContainer;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_carsfrag);
        getSupportActionBar().hide();
        //add the view via xml or programmatically


        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.KITKAT) {

            getWindow().setFlags(WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS,
                    WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS);
        }


        blurView=findViewById(R.id.mainaaaaa);
        float radius = 10f;

        View decorView = getWindow().getDecorView();
        // ViewGroup you want to start blur from. Choose root as close to BlurView in hierarchy as possible.
        ViewGroup rootView = (ViewGroup) decorView.findViewById(android.R.id.content);

        // Optional:
        // Set drawable to draw in the beginning of each blurred frame.
        // Can be used in case your layout has a lot of transparent space and your content
        // gets a too low alpha value after blur is applied.
        Drawable windowBackground = decorView.getBackground();

        blurView.setupWith(rootView)
                .setFrameClearDrawable(windowBackground) // Optional
                .setBlurAlgorithm(new RenderScriptBlur(this))
                .setBlurRadius(radius)
                .setBlurAutoUpdate(true);



        new Handler().postDelayed(new Runnable() {
            public void run() {
                findViewById(R.id.mcla).setAnimation(AnimationUtils.loadAnimation(getApplicationContext(),R.anim.fade));
                findViewById(R.id.mcla).setVisibility(View.GONE);
            };
        },  4000);


        mab = findViewById(R.id.btna);
        mbb = findViewById(R.id.btnb);
        mcb = findViewById(R.id.btnc);
        mdb = findViewById(R.id.btnd);


        mab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                flingContainer.getTopCardListener().selectLeft();
            }
        });

        mbb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                al.clear();
                mlista.notifyDataSetChanged();


                final int[] mmmv = {mccc.size() - (gh + 1)};
                gh=0;
                new Handler().postDelayed(new Runnable() {
                    public void run() {
                        for(String ma:mccc) {
                            if (mmmv[0] <= 0) {
                            lmj lmjaaal = new lmj(ma.split(",")[0], ma.split(",")[1], ma.split(",")[2], ma.split(",")[3], "no");
                            al.add(lmjaaal);

                            gh++;
                            }

                            mmmv[0]--;
                        }
                        mlista.notifyDataSetChanged();
                    }
                    ;
                }, 50);

                int g=0;

            }
        });

        mcb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

        mdb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                flingContainer.getTopCardListener().selectRight();
            }
        });

        flingContainer = (SwipeFlingAdapterView) findViewById(R.id.mssw);
        al = new ArrayList<>();


        mccc = new ArrayList<>();

        mccc.add("title1,content1,imagepath1,audiopath1");
        mccc.add("title2,content1,imagepath1,audiopath1");
        mccc.add("title3,content1,imagepath1,audiopath1");



        gh=0;
        for(String ma:mccc)
        {
            String mb="";
            if(ma.split(",")[3]!="null"&&gh==0) {
                mb = "yes";
            }
            else
            {
                mb="no";
            }
            lmj lmjaaa = new lmj(ma.split(",")[0],ma.split(",")[1],ma.split(",")[2],ma.split(",")[3],mb);
            al.add(lmjaaa);



            gh++;
        }


        mlista =  new mlist(getApplicationContext(), al);

        //set the listener and the adapter
        flingContainer.setAdapter(mlista);
        flingContainer.setFlingListener(new SwipeFlingAdapterView.onFlingListener() {

            @Override
            public void removeFirstObjectInAdapter() {
                al.remove(0);
                mlista.notifyDataSetChanged();
            }

            @Override
            public void onAdapterAboutToEmpty(int i) {

            }

            @Override
            public void onScroll(float v) {

            }

            @Override
            public void onLeftCardExit(Object dataObject) {
                //Do something on the left!
                //You also have access to the original object.
                //If you want to use it just cast it (String) dataObject
                Toast.makeText(getApplicationContext(), "Left!", Toast.LENGTH_SHORT).show();
                gh--;
            }

            @Override
            public void onRightCardExit(Object dataObject) {
                Toast.makeText(getApplicationContext(), "Right!", Toast.LENGTH_SHORT).show();
                gh--;
            }



        });
    }

    public void ma(View view)
    {
    }
}