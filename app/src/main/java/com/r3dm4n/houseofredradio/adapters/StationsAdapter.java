package com.r3dm4n.houseofredradio.adapters;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.r3dm4n.houseofredradio.R;
import com.r3dm4n.houseofredradio.holders.StationViewHolder;
import com.r3dm4n.houseofredradio.model.Station;

import java.util.ArrayList;

/**
 * Created by r3d on 16/10/2016.
 */

public class StationsAdapter extends RecyclerView.Adapter<StationViewHolder> {

    private ArrayList<Station> stations;

    public StationsAdapter(ArrayList<Station> stations) {
        this.stations = stations;
    }

    @Override
    public void onBindViewHolder(StationViewHolder holder, int position) {

        Station station = stations.get(position);
        holder.updateUI(station);


    }

    @Override
    public int getItemCount() {
        return stations.size();
    }

    @Override
    public StationViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        View stationCard = LayoutInflater.from(parent.getContext()).inflate(R.layout.card_station, parent, false);
        return new StationViewHolder(stationCard);
    }
}
