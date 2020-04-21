package com.example.beautygram.fragments.main;


import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.beautygram.R;
import com.example.beautygram.adapters.ReservesAdapter;

public class ReservesFragment extends Fragment {

    RecyclerView recyclerView;

    public ReservesFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_reservs, container, false);

        initViews(view);

        return view;
    }

    private void initViews(View view) {
        recyclerView = view.findViewById(R.id.main_fragment_reserves_recycler);

        ReservesAdapter adapter = new ReservesAdapter(getContext(), null);
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext(), RecyclerView.VERTICAL, false));
        recyclerView.setAdapter(adapter);
    }

}
