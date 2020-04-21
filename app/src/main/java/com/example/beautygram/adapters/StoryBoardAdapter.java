package com.example.beautygram.adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.example.beautygram.R;
import com.example.beautygram.models.StoryBoard;

import java.util.List;

import de.hdodenhof.circleimageview.CircleImageView;

public class StoryBoardAdapter extends RecyclerView.Adapter<StoryBoardAdapter.ViewHolder> {

    private List<StoryBoard> list;
    private Context context;

    public StoryBoardAdapter(List<StoryBoard> list, Context context) {
        this.context = context;
        this.list = list;
    }

    @NonNull
    @Override
    public StoryBoardAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.recycler_storyboard, parent, false);
        return new StoryBoardAdapter.ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull StoryBoardAdapter.ViewHolder holder, int position) {
        StoryBoard storyBoard = list.get(position);
        Glide.with(context)
                .load(storyBoard.getImage())
                .optionalCenterCrop()
                .into(holder.circleImageView);
        //holder.circleImageView.setImageResource(storyBoard.getImage());
        holder.textView.setText(storyBoard.getText());
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    class ViewHolder extends RecyclerView.ViewHolder {

        CircleImageView circleImageView;
        TextView textView;

        ViewHolder(@NonNull View itemView) {
            super(itemView);

            circleImageView = itemView.findViewById(R.id.recycler_storyboard_circleImageView);
            textView = itemView.findViewById(R.id.recycler_storyboard_text);
        }
    }
}
