package com.example.beautygram.adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.beautygram.R;
import com.example.beautygram.fragments.main.SearchFragment;
import com.example.beautygram.models.SearchPage;

import java.util.List;

import de.hdodenhof.circleimageview.CircleImageView;

public class SearchPageAdapter extends RecyclerView.Adapter<SearchPageAdapter.ViewHolder> {


    private Context context;
    private List<SearchPage> searchPages;

    public SearchPageAdapter(Context context, List<SearchPage> searchPages) {
        this.context = context;
        this.searchPages = searchPages;
    }


    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.search_company_recycler_item,parent,false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        SearchPage searchPage = searchPages.get(position);

        holder.circleImageView.setImageResource(searchPage.getPf_image());
        holder.name.setText(searchPage.getName());
        holder.bg_theme.setBackgroundResource(searchPage.getSlide_theme());
        holder.h1.setImageResource(searchPage.getSample_hairs()[0]);
        holder.h2.setImageResource(searchPage.getSample_hairs()[1]);
        holder.h3.setImageResource(searchPage.getSample_hairs()[2]);
        holder.h4.setImageResource(searchPage.getSample_hairs()[3]);
        holder.Advertise.setText(searchPage.getAdvertise());
        holder.Address.setText(searchPage.getAddress());
        holder.comments.setText(String.valueOf(searchPage.getComments_count()));

    }

    @Override
    public int getItemCount() {
        return searchPages.size();
    }

    class ViewHolder extends RecyclerView.ViewHolder
    {

        CircleImageView circleImageView;
        TextView name;
        RelativeLayout bg_theme;
        ImageView h1;
        ImageView h2;
        ImageView h3;
        ImageView h4;
        TextView Advertise;
        TextView Address;
        TextView comments;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            circleImageView = itemView.findViewById(R.id.s_avatar);
            name = itemView.findViewById(R.id.s_name);
            bg_theme = itemView.findViewById(R.id.s_bgTheme);
            h1 = itemView.findViewById(R.id.s_h1);
            h2 = itemView.findViewById(R.id.s_h2);
            h3 = itemView.findViewById(R.id.s_h3);
            h4 = itemView.findViewById(R.id.s_h4);
            Advertise = itemView.findViewById(R.id.s_advertise);
            Address = itemView.findViewById(R.id.s_address);
            comments = itemView.findViewById(R.id.s_comment);

        }
    }
}
