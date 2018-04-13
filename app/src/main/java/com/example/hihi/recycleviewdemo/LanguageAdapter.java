package com.example.hihi.recycleviewdemo;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class LanguageAdapter extends RecyclerView.Adapter<LanguageAdapter.ViewHolder> {

    private static final String TAG = LanguageAdapter.class.getSimpleName();
    private Context context;
    private LayoutInflater inflater;
    private ArrayList<String> languages;
    private int currentPosition = -1;

    public LanguageAdapter(Context context, ArrayList<String> languages) {
        this.context = context;
        inflater = LayoutInflater.from(context);
        this.languages = languages;

    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new ViewHolder(inflater.inflate(R.layout.item_language, parent, false));
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, final int position) {
        holder.bindData(position);
        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(currentPosition==position){
                    setCurrentPosition(-1);
                }else{
                    setCurrentPosition(position);
                }

            }
        });
    }

    public void setCurrentPosition(int currentPosition) {
        this.currentPosition = currentPosition;
        notifyDataSetChanged();
    }

    @Override
    public int getItemCount() {
        return languages.size();
    }

    class ViewHolder extends RecyclerView.ViewHolder {

        TextView txtLanguage;
        ImageView imgSelect;

        public ViewHolder(View itemView) {
            super(itemView);
            txtLanguage = itemView.findViewById(R.id.txt_language);
            imgSelect = itemView.findViewById(R.id.img_check);
        }

        void bindData(int position) {
            txtLanguage.setText(languages.get(position));
            if (currentPosition == position) {
                Log.d(TAG, "onBindViewHolder: " + position);
                imgSelect.setVisibility(View.VISIBLE);
            } else {
                imgSelect.setVisibility(View.INVISIBLE);
            }
        }

    }
}
