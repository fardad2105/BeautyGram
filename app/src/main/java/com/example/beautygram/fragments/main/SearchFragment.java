package com.example.beautygram.fragments.main;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.beautygram.R;
import com.example.beautygram.adapters.SearchPageAdapter;
import com.example.beautygram.adapters.StoryBoardAdapter;
import com.example.beautygram.common.RecyclerSearchGenerator;
import com.example.beautygram.common.RecyclerStoryBoardGenerator;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;


public class SearchFragment extends Fragment {

   RecyclerView recyclerView;
   RecyclerView rc;

   private SearchFragment context;

    public SearchFragment() {
        // Required empty public constructor
    }




    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        context = SearchFragment.this;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_search,container,false);


        FloatingActionButton fab = view.findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });

        initViews(view);

        return view;
    }

    public void initViews(View view)
    {
        rc = view.findViewById(R.id.s_main_profileFragment_recycler_storyboard);
        StoryBoardAdapter storyBoardAdapter = new StoryBoardAdapter(new RecyclerStoryBoardGenerator().getSample(6),getContext());
        rc.setLayoutManager(new LinearLayoutManager(getContext(),RecyclerView.HORIZONTAL,false));
        rc.setAdapter(storyBoardAdapter);


//        recyclerView = view.findViewById(R.id.search_page_recycler_items);
//        SearchPageAdapter searchPageAdapter = new SearchPageAdapter(SearchFragment.this,new RecyclerSearchGenerator().getItemSearchPages());
//        recyclerView.setLayoutManager(new LinearLayoutManager(getContext(),RecyclerView.VERTICAL,false));
//        recyclerView.setAdapter(searchPageAdapter);

    }

}
