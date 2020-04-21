package com.example.beautygram.adapters;

import android.annotation.SuppressLint;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.appcompat.widget.AppCompatButton;
import androidx.recyclerview.widget.RecyclerView;

import com.example.beautygram.R;
import com.example.beautygram.fragments.profile.ServiceProfileFragment;
import com.example.beautygram.models.ProfileServices;

import java.util.List;

public class ServiceProfileFragmentAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {

    private List<ProfileServices> list;
    private Context context;

    private final int TYPE_SEARCH = 0;
    private final int TYPE_SERVICE = 1;

    public ServiceProfileFragmentAdapter(List<ProfileServices> list, Context context) {
        this.list = list;
        this.context = context;
    }

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        if (viewType == TYPE_SEARCH)
            return new ServiceProfileFragmentAdapter.SearchViewHolder(
                    LayoutInflater.from(context).inflate(R.layout.recycler_frament_profile_serivce_search, parent, false));
        else
            return new ServiceProfileFragmentAdapter.ViewHolder(
                    LayoutInflater.from(context).inflate(R.layout.recycler_fragment_profile_service, parent, false));
    }

    @Override
    public int getItemViewType(int position) {
        return position == 0 ? TYPE_SEARCH : TYPE_SERVICE;
    }

    @SuppressLint("SetTextI18n")
    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {

        if (holder instanceof ServiceProfileFragmentAdapter.SearchViewHolder) {

            ServiceProfileFragmentAdapter.SearchViewHolder searchViewHolder = (ServiceProfileFragmentAdapter.SearchViewHolder) holder;
            
        } else if (holder instanceof ServiceProfileFragmentAdapter.ViewHolder) {
            
            ServiceProfileFragmentAdapter.ViewHolder viewHolder = (ServiceProfileFragmentAdapter.ViewHolder) holder;
            ProfileServices profileService = list.get(position - 1);

            viewHolder.title.setText(profileService.getTitle());
            viewHolder.price.setText(profileService.getPrice() + " تومان");
            viewHolder.time.setText(((int) Math.ceil(profileService.getTimeInSeconds() / 60)) + " دقیقه");

            viewHolder.view.setVisibility(position == list.size() - 1 ? View.VISIBLE : View.GONE);
            
        }
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    private class SearchViewHolder extends RecyclerView.ViewHolder {

        private EditText search;

        private SearchViewHolder(@NonNull View itemView) {
            super(itemView);

            search = itemView.findViewById(R.id.fragment_service_profile_search);
        }
    }

    private class ViewHolder extends RecyclerView.ViewHolder {

        private TextView title, price, time;
        private AppCompatButton button;
        private View view;

        private ViewHolder(@NonNull View itemView) {
            super(itemView);

            title = itemView.findViewById(R.id.recycler_fragment_profile_service_title);
            price = itemView.findViewById(R.id.recycler_fragment_profile_service_price);
            time = itemView.findViewById(R.id.recycler_fragment_profile_service_time);
            button = itemView.findViewById(R.id.recycler_fragment_profile_service_add);
            view = itemView.findViewById(R.id.recycler_fragment_profile_service_view);
        }
    }
}
