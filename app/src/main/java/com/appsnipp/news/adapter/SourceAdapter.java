package com.appsnipp.news.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.appsnipp.news.MainActivity;
import com.appsnipp.news.R;
import com.appsnipp.news.model.ArticleStructure;
import com.appsnipp.news.model.Source;

import java.util.ArrayList;

public class SourceAdapter extends RecyclerView.Adapter<SourceAdapter.ViewHolder> {
    private ArrayList<Source> sources;
    private Context mContext;

    public SourceAdapter(Context mContext, ArrayList<Source> sources) {
        this.mContext = mContext;
        this.sources = sources;
    }

    @NonNull
    @Override
    public SourceAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.layout_topics, parent, false);
        return new SourceAdapter.ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull SourceAdapter.ViewHolder holder, int position) {
        String title = sources.get(position).getName();
        holder.source_name.setText(title);
    }

    @Override
    public int getItemCount() {
        return sources.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        private TextView source_name;
        private ImageView icon;

        public ViewHolder(@NonNull View view) {
            super(view);
            source_name = view.findViewById(R.id.source_topic);
//            icon = view.findViewById(R.id.profile_image);
        }
    }
}
