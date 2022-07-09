package com.concoeducation.magiccards;

import android.content.Context;
import android.media.DrmInitData;
import android.media.Image;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Handler;
import android.provider.MediaStore;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;
import androidx.constraintlayout.widget.ConstraintLayout;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.ArrayList;
public class mlist extends ArrayAdapter<lmj>{
    public mlist(Context context, ArrayList<lmj> mjiii) {
        super(context, R.layout.comppps, mjiii);
    }



    ConstraintLayout masd;



    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        lmj lmja =getItem(position);


        if(convertView == null)
        {
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.comppps, parent, false);
        }

        TextView ma = convertView.findViewById(R.id.mtxt);
        TextView maa = convertView.findViewById(R.id.mtxt4);

        Button mvvv = convertView.findViewById(R.id.button3);
        ImageButton mlllo = convertView.findViewById(R.id.imageButton3);







        if(lmja.d.toString()!="null")
        {

            mlllo.setVisibility(View.VISIBLE);
            mvvv.setVisibility(View.VISIBLE);

            final MediaPlayer[] lllc = {new MediaPlayer()};
            lllc[0] = MediaPlayer.create(getContext(), Uri.parse(lmja.d.toString()));



            mlllo.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    if (!lllc[0].isPlaying())
                    {
                        lllc[0].start();
                    }
                }
            });



            mvvv.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if (!lllc[0].isPlaying())
                    {
                        lllc[0].start();
                    }
                }
            });
        }

        ma.setText(lmja.a.toString());
        maa.setText(lmja.b.toString());
        ImageView mlo = convertView.findViewById(R.id.mggg);
        mlo.setImageURI(Uri.parse(lmja.c.toString()));







        if(lmja.e.toString() == "yes")
        {
            masd = convertView.findViewById(R.id.jjjjh);
            masd.setVisibility(View.VISIBLE);

            new Handler().postDelayed(new Runnable() {
                public void run() {
                    masd.setVisibility(View.INVISIBLE);
                }
                ;
            }, 8000);
        }

        Button mlll = convertView.findViewById(R.id.button3);
        ImageButton lop = convertView.findViewById(R.id.imageButton3);
        lop.setImageResource(R.drawable.ic_baseline_volume_up_24);
        mlo.setClipToOutline(true);
        return convertView;
    }
}