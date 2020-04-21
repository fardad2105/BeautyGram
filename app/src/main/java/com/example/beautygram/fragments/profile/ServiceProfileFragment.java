package com.example.beautygram.fragments.profile;


import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;

import com.example.beautygram.R;
import com.example.beautygram.adapters.ServiceProfileFragmentAdapter;
import com.example.beautygram.common.RecyclerServicesGenerator;

public class ServiceProfileFragment extends Fragment {

    private RecyclerView recyclerView;
    private EditText searchEditText;

    public ServiceProfileFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_service_profile, container, false);

        recyclerView = view.findViewById(R.id.fragment_service_profile_recycler);
        searchEditText = view.findViewById(R.id.fragment_service_profile_search);

        ServiceProfileFragmentAdapter adapter = new ServiceProfileFragmentAdapter(new RecyclerServicesGenerator().getSample(8), getContext());
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext(), RecyclerView.VERTICAL, false));
        recyclerView.setAdapter(adapter);

        return view;
    }

}
