package com.concoeducation.magiccards;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.ArrayList;

public class listada extends ArrayAdapter<arrayada> {


    ImageView maa;ImageView mba;ImageView mca;ImageView mda;ImageView mea;ImageView mfa;
    TextView tma;TextView tmb;TextView tmc;TextView tmd;TextView tme;TextView tmf;


    LinearLayout lnya;
    LinearLayout lnyb;
    LinearLayout lnyc;
    LinearLayout lnyd;
    LinearLayout lnye;
    LinearLayout lnyf;



    LinearLayout mvvba;

    TextView matr;

    public listada(Context context, ArrayList<arrayada> arrayadasa)
    {
        super(context, R.layout.hsssc, arrayadasa);
    }


    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        arrayada ma = getItem(position);


        if (convertView == null) {
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.hsssc, parent, false);
        }
        matr = convertView.findViewById(R.id.textView8);


        maa = convertView.findViewById(R.id.imga);
        mba = convertView.findViewById(R.id.imgb);
        mca = convertView.findViewById(R.id.imgc);
        mda = convertView.findViewById(R.id.imgd);
        mea = convertView.findViewById(R.id.imge);
        mfa = convertView.findViewById(R.id.imgf);

        tma = convertView.findViewById(R.id.txta);
        tmb = convertView.findViewById(R.id.txtb);
        tmc = convertView.findViewById(R.id.txtc);
        tmd = convertView.findViewById(R.id.txtd);
        tme = convertView.findViewById(R.id.txte);
        tmf = convertView.findViewById(R.id.txtf);

        lnya=convertView.findViewById(R.id.la1);
        lnyb=convertView.findViewById(R.id.la2);
        lnyc=convertView.findViewById(R.id.la3);
        lnyd=convertView.findViewById(R.id.la4);
        lnye=convertView.findViewById(R.id.la5);
        lnyf=convertView.findViewById(R.id.la6);




        if(ma.mida!="null"){ lnya.setVisibility(View.VISIBLE);maa.setImageURI(Uri.parse(ma.impga)); tma.setText(ma.mga);lnya.setOnClickListener(new View.OnClickListener() {@Override public void onClick(View v) { toe(ma.mida); }});}
        if(ma.midb!="null"){ lnyb.setVisibility(View.VISIBLE);mba.setImageURI(Uri.parse(ma.impgb)); tmb.setText(ma.mgb);lnyb.setOnClickListener(new View.OnClickListener() {@Override public void onClick(View v) { toe(ma.midb); }});}
        if(ma.midc!="null"){ lnyc.setVisibility(View.VISIBLE);mca.setImageURI(Uri.parse(ma.impgc)); tmc.setText(ma.mgc);lnyc.setOnClickListener(new View.OnClickListener() {@Override public void onClick(View v) { toe(ma.midc); }});}
        if(ma.midd!="null"){ lnyd.setVisibility(View.VISIBLE);mda.setImageURI(Uri.parse(ma.impgd)); tmd.setText(ma.mgd);lnyd.setOnClickListener(new View.OnClickListener() {@Override public void onClick(View v) { toe(ma.midd); }});}
        if(ma.mide!="null"){ lnye.setVisibility(View.VISIBLE);mea.setImageURI(Uri.parse(ma.impge)); tme.setText(ma.mge);lnye.setOnClickListener(new View.OnClickListener() {@Override public void onClick(View v) { toe(ma.mide); }});}
        if(ma.midf!="null"){ lnyf.setVisibility(View.VISIBLE);mfa.setImageURI(Uri.parse(ma.impgf)); tmf.setText(ma.mgf);lnyf.setOnClickListener(new View.OnClickListener() {@Override public void onClick(View v) { toe(ma.midf); }});}

        matr.setText(ma.tit);


        if(ma.mida!="null"){ lnya.setVisibility(View.VISIBLE); }
        if(ma.midb!="null"){ lnyb.setVisibility(View.VISIBLE); }
        if(ma.midc!="null"){ lnyc.setVisibility(View.VISIBLE); }
        if(ma.midd!="null"){ lnyd.setVisibility(View.VISIBLE); }
        if(ma.mide!="null"){ lnye.setVisibility(View.VISIBLE); }
        if(ma.midf!="null"){ lnyf.setVisibility(View.VISIBLE); }




        return convertView;
    }

    private void toe(String mca)
    {
        Intent ml = new Intent(getContext(), qner.class);
        ml.putExtra("data", mca);
        getContext().startActivity(ml);
    }
}
