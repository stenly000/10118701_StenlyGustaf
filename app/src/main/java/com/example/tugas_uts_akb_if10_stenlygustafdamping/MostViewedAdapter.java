package com.example.tugas_uts_akb_if10_stenlygustafdamping;

import android.media.Image;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class MostViewedAdapter extends RecyclerView.Adapter<MostViewedAdapter.MostViewedHoder> {

    ArrayList<MostViewedHelperClass> mostViewedLocations;

    public MostViewedAdapter(ArrayList<MostViewedHelperClass> mostViewedLocations) {
        this.mostViewedLocations = mostViewedLocations;
    }

    @NonNull
    @Override
    public MostViewedHoder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.most_viewed_card_design,parent,false);
        MostViewedHoder mostViewedHoder = new MostViewedHoder(view);

        return mostViewedHoder;
    }

    @Override
    public void onBindViewHolder(@NonNull MostViewedHoder holder, int position) {

        MostViewedHelperClass mostViewedHelperClass = mostViewedLocations.get(position);

        holder.image.setImageResource(mostViewedHelperClass.getImage());
        holder.title.setText(mostViewedHelperClass.getTitle());


    }

    @Override
    public int getItemCount() { return mostViewedLocations.size(); }


    public static class MostViewedHoder extends RecyclerView.ViewHolder{
        ImageView image;
        TextView title;

        public MostViewedHoder(@NonNull View itemView) {
            super(itemView);

            //Hooks
            image = itemView.findViewById(R.id.mv_image);
            title = itemView.findViewById(R.id.mv_title);
        }
    }
}
