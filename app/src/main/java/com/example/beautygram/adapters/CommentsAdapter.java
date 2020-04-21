package com.example.beautygram.adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.beautygram.R;
import com.example.beautygram.models.Comment;

import java.util.List;

import de.hdodenhof.circleimageview.CircleImageView;

public class CommentsAdapter extends RecyclerView.Adapter<CommentsAdapter.ViewHolder> {

    private Context context;
    private List<Comment> list;

    public CommentsAdapter(Context context, List<Comment> list) {
        this.context = context;
        this.list = list;
    }

    @NonNull
    @Override
    public CommentsAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.recycler_main2, parent, false);
        return new CommentsAdapter.ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull CommentsAdapter.ViewHolder holder, int position) {
        Comment comment = list.get(position);

        holder.circleImageView.setImageResource(comment.getImage());
        holder.sender.setText(comment.getSender());
        holder.comment.setText(comment.getComment());
        holder.like.setText(comment.getLikes() + " نفر پسندیدند");

        holder.like.setVisibility(comment.getLikes() == 0 ? View.GONE : View.VISIBLE);
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    class ViewHolder extends RecyclerView.ViewHolder {

        CircleImageView circleImageView;
        TextView sender, comment, like;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            circleImageView = itemView.findViewById(R.id.recycler_main2_imageView);
            sender = itemView.findViewById(R.id.recycler_main2_sender);
            comment = itemView.findViewById(R.id.recycler_main2_comment);
            like = itemView.findViewById(R.id.recycler_main2_like);
        }
    }
}
