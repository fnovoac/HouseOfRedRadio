package com.r3dm4n.houseofredradio.adapters;

import android.support.v7.widget.RecyclerView;
import android.view.ViewGroup;

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

    }

    @Override
    public int getItemCount() {
        return 0;
    }

    @Override
    public StationViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        return null;

    }
}
