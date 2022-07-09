package com.concoeducation.magiccards.ui.home;

import android.app.Activity;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Handler;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AnimationUtils;
import android.widget.ArrayAdapter;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.ScrollView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;

import com.concoeducation.magiccards.R;
import com.concoeducation.magiccards.arrayada;
import com.concoeducation.magiccards.carsfrag;
import com.concoeducation.magiccards.databinding.ActivityCarsfragBinding;
import com.concoeducation.magiccards.databinding.FragmentHomeBinding;
import com.concoeducation.magiccards.listada;
import com.concoeducation.magiccards.lmj;
import com.concoeducation.magiccards.mcards;
import com.concoeducation.magiccards.mlist;
import com.lorentzos.flingswipe.SwipeFlingAdapterView;

import java.util.ArrayList;
import java.util.List;

import eightbitlab.com.blurview.BlurView;
import eightbitlab.com.blurview.RenderScriptBlur;

public class HomeFragment extends Fragment {

    private HomeViewModel homeViewModel;
    private FragmentHomeBinding binding;


    private ListView mvf;

    private ScrollView lddd;


    private LinearLayout mvvva;
    BlurView blurView;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        homeViewModel =
                new ViewModelProvider(this).get(HomeViewModel.class);

        binding = FragmentHomeBinding.inflate(getLayoutInflater());
        View root = binding.getRoot();


        mvvva=root.findViewById(R.id.mainscc);


        blurView = root.findViewById(R.id.lllna);

        float radius = 5f;

        View decorView = getActivity().getWindow().getDecorView();
        // ViewGroup you want to start blur from. Choose root as close to BlurView in hierarchy as possible.
        ViewGroup rootView = (ViewGroup) decorView.findViewById(android.R.id.content);

        // Optional:
        // Set drawable to draw in the beginning of each blurred frame.
        // Can be used in case your layout has a lot of transparent space and your content
        // gets a too low alpha value after blur is applied.
        Drawable windowBackground = decorView.getBackground();

        blurView.setupWith(rootView)
                .setFrameClearDrawable(windowBackground) // Optional
                .setBlurAlgorithm(new RenderScriptBlur(getContext()))
                .setBlurRadius(radius)
                .setBlurAutoUpdate(true);



        //lddd.fullScroll(ScrollView.FOCUS_UP);

        new Handler().postDelayed(new Runnable() {
            public void run() {


                root.findViewById(R.id.mcl).setAnimation(AnimationUtils.loadAnimation(getContext(),R.anim.fade));
                root.findViewById(R.id.mcl).setVisibility(View.GONE);
            };
        },  2000);

        ListView mccc = root.findViewById(R.id.moool);


        ArrayList<arrayada> arrayadasa = new ArrayList<>();




        int a = 0 ;



        mvf=root.findViewById(R.id.moool);


        LinearLayout.LayoutParams mds = new LinearLayout.LayoutParams(mvf.getLayoutParams());
        LinearLayout.LayoutParams mdd =new LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT, LinearLayout.LayoutParams.MATCH_PARENT);



        mdd.height=mds.height;


        lddd= root.findViewById(R.id.lllldr);

        ArrayList<String> mi = new ArrayList<>();
        mi.add("yes");
        mi.add("no");
        mi.add("no");
        mi.add("no");
        mi.add("no");



        for (String fr:mi) {
                    arrayada mli = new arrayada(fr, "tit" + fr,
                            "text1", "text2", "text3", "text4", "text5", "text6",
                            "path1", "path1", "path1", "path1", "path1", "path1",
                            "id", "id", "id", "id", "id","id");
                    arrayadasa.add(mli);
                    mds.height = mds.height + mdd.height;
        }

        mvf.setLayoutParams(mds);


/*       lddd.fullScroll(ScrollView.FOCUS_UP);

        new Handler().postDelayed(new Runnable() {
            public void run() {
                //lddd.fullScroll(ScrollView.FOCUS_UP);
            };
        },  2000);


 */

        listada mlio = new listada(getContext(), arrayadasa);

        binding.moool.setAdapter(mlio);

        return root;

    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}