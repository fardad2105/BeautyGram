package com.example.beautygram.adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.beautygram.R;
import com.example.beautygram.models.Reserve;

import java.util.List;

public class ReservesAdapter extends RecyclerView.Adapter<ReservesAdapter.ViewHolder> {

    private Context context;
    private List<Reserve> list;

    public ReservesAdapter(Context context, List<Reserve> list) {
        this.context = context;
        this.list = list;
    }

    @NonNull
    @Override
    public ReservesAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.recycler_fragment_reserves, parent, false);
        return new ReservesAdapter.ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ReservesAdapter.ViewHolder holder, int position) {
        //Reserve reserve = list.get(position);
    }

    @Override
    public int getItemCount() {
        //return list.size();
        return 3;
    }

    class ViewHolder extends RecyclerView.ViewHolder {

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
        }
    }
}
