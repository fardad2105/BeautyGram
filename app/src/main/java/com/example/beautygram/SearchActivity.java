package com.example.beautygram;

        import android.content.Context;
        import android.content.Intent;
        import android.os.Bundle;

        import com.example.beautygram.adapters.SearchPageAdapter;
        import com.example.beautygram.adapters.StoryBoardAdapter;
        import com.example.beautygram.common.RecyclerSearchGenerator;
        import com.example.beautygram.common.RecyclerStoryBoardGenerator;
        import com.google.android.material.floatingactionbutton.FloatingActionButton;
        import com.google.android.material.snackbar.Snackbar;

        import androidx.appcompat.app.AppCompatActivity;
        import androidx.appcompat.widget.Toolbar;
        import androidx.recyclerview.widget.LinearLayoutManager;
        import androidx.recyclerview.widget.RecyclerView;

        import android.view.View;

public class SearchActivity extends AppCompatActivity {

    RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_search);


        FloatingActionButton fab = findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(SearchActivity.this,SearchLocation.class));
            }
        });

        //
        RecyclerView rc = findViewById(R.id.s_main_profileFragment_recycler_storyboard);
        StoryBoardAdapter storyBoardAdapter = new StoryBoardAdapter(new RecyclerStoryBoardGenerator().getSample(6), getContext());
        rc.setLayoutManager(new LinearLayoutManager(getContext(), RecyclerView.HORIZONTAL, false));
        rc.setAdapter(storyBoardAdapter);


        recyclerView = findViewById(R.id.search_page_recycler_items);
        SearchPageAdapter searchPageAdapter = new SearchPageAdapter(SearchActivity.this,new RecyclerSearchGenerator().getItemSearchPages());
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext(),RecyclerView.VERTICAL,false));
        recyclerView.setAdapter(searchPageAdapter);
    }

    public Context getContext() {
        return SearchActivity.this;
    }

}
