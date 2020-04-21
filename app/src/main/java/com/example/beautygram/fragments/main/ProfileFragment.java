package com.example.beautygram.fragments.main;


import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;
import androidx.viewpager.widget.ViewPager;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.beautygram.R;
import com.example.beautygram.adapters.ProfileFragmentViewPagerAdapter;
import com.example.beautygram.adapters.SamplesProfileFragmentAdapter;
import com.example.beautygram.adapters.ServiceProfileFragmentAdapter;
import com.example.beautygram.adapters.StoryBoardAdapter;
import com.example.beautygram.common.RecyclerProfileSamplesGenerator;
import com.example.beautygram.common.RecyclerServicesGenerator;
import com.example.beautygram.common.RecyclerStoryBoardGenerator;
import com.example.beautygram.fragments.profile.SamplesProfileFragment;
import com.example.beautygram.fragments.profile.ServiceProfileFragment;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.appbar.CollapsingToolbarLayout;
import com.google.android.material.tabs.TabLayout;

import java.util.Objects;

public class ProfileFragment extends Fragment {

    private TabLayout tableLayout;
    private RecyclerView storyBoard, recyclerView;
    private ProfileFragmentViewPagerAdapter profileFragmentViewPagerAdapter;
    private AppBarLayout appBarLayout;

    public ProfileFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_profile, container, false);

        initViews(view);

        return view;
    }

    private void initViews(View view) {
        tableLayout = view.findViewById(R.id.fragmentProfile_tab);
        recyclerView = view.findViewById(R.id.fragmentProfile_recyclerView);
        appBarLayout = view.findViewById(R.id.fragmentProfile_appBar);

        storyBoard = view.findViewById(R.id.fragmentProfile_storyboardRecycler);

//        appBarLayout.addOnOffsetChangedListener(new AppBarLayout.OnOffsetChangedListener() {
//            @Override
//            public void onOffsetChanged(AppBarLayout appBarLayout, int verticalOffset) {
//
//                double d = (double) Math.abs(verticalOffset) / appBarLayout.getTotalScrollRange();
//
//                if (d >= 0.66 && d <= 0.9) {
//                    appBarLayout.setExpanded(true, true);
//                }
//                if (d >= 0.9 && d < 1.0) {
//                    appBarLayout.setExpanded(false, true);
//                }
//            }
//        });

        //StoryBoard
        StoryBoardAdapter storyBoardAdapter = new StoryBoardAdapter(new RecyclerStoryBoardGenerator().getSample(8), getContext());
        storyBoard.setLayoutManager(new LinearLayoutManager(getContext(), RecyclerView.HORIZONTAL, false));
        storyBoard.setAdapter(storyBoardAdapter);

        //Recycler
        final SamplesProfileFragmentAdapter samplesProfileFragmentAdapter = new SamplesProfileFragmentAdapter(new RecyclerProfileSamplesGenerator().getSample(7), getActivity());
        final ServiceProfileFragmentAdapter serviceProfileFragmentAdapter = new ServiceProfileFragmentAdapter(new RecyclerServicesGenerator().getSample(8), getContext());

        tableLayout.addOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                switch (tab.getPosition()) {
                    case 0:
                    case 1:
                        recyclerView.setLayoutManager(new StaggeredGridLayoutManager(3, StaggeredGridLayoutManager.VERTICAL));
                        recyclerView.setAdapter(samplesProfileFragmentAdapter);
                        break;
                    case 2:
                        recyclerView.setLayoutManager(new LinearLayoutManager(getContext(), RecyclerView.VERTICAL, false));
                        recyclerView.setAdapter(serviceProfileFragmentAdapter);
                        break;
                }
            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {
            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {
            }
        });

        Objects.requireNonNull(tableLayout.getTabAt(2)).select();

    }

}
