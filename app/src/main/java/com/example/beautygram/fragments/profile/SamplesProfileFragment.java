package com.example.beautygram.fragments.profile;


import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.beautygram.R;
import com.example.beautygram.adapters.SamplesProfileFragmentAdapter;
import com.example.beautygram.common.RecyclerProfileSamplesGenerator;

public class SamplesProfileFragment extends Fragment {

    private RecyclerView recyclerView;

    public SamplesProfileFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_samples_profile, container, false);

        initViews(view);

        return view;
    }

    private void initViews(View view) {
        recyclerView = view.findViewById(R.id.fragment_profile_samples_recycler);

        SamplesProfileFragmentAdapter adapter = new SamplesProfileFragmentAdapter(new RecyclerProfileSamplesGenerator().getSample(7), getActivity());
        recyclerView.setLayoutManager(new StaggeredGridLayoutManager(3, StaggeredGridLayoutManager.VERTICAL));
        recyclerView.setAdapter(adapter);
    }
}
