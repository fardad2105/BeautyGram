package com.example.beautygram.adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.example.beautygram.R;
import com.example.beautygram.models.ProfileSamples;

import java.util.List;

public class SamplesProfileFragmentAdapter extends RecyclerView.Adapter<SamplesProfileFragmentAdapter.ViewHolder> {

    private List<ProfileSamples> list;
    private Context context;

    public SamplesProfileFragmentAdapter(List<ProfileSamples> list, Context context) {
        this.list = list;
        this.context = context;
    }

    @NonNull
    @Override
    public SamplesProfileFragmentAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.recycler_fragment_samples, parent, false);
        return new SamplesProfileFragmentAdapter.ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull SamplesProfileFragmentAdapter.ViewHolder holder, int position) {
        ProfileSamples profileSample = list.get(position);

//        Glide.with(context)
//                .load(profileSample.getImage())
//                .optionalCenterCrop()
//                .into(holder.imageView);
        holder.imageView.setImageResource(profileSample.getImage());

        holder.view.setVisibility(position == list.size() - 1 ? View.VISIBLE : View.GONE);
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    class ViewHolder extends RecyclerView.ViewHolder {

        ImageView imageView;
        View view;

        ViewHolder(@NonNull View itemView) {
            super(itemView);

            imageView = itemView.findViewById(R.id.recycler_fragment_samples_image);
            view = itemView.findViewById(R.id.recycler_fragment_samples_view);
        }
    }
}
