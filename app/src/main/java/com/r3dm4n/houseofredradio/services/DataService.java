package com.r3dm4n.houseofredradio.services;

import com.r3dm4n.houseofredradio.model.Station;

import java.util.ArrayList;

/**
 * Created by r3d on 17/10/2016.
 */
public class DataService {
    private static DataService ourInstance = new DataService();

    public static DataService getInstance() {
        return ourInstance;
    }

    private DataService() {
    }

    public ArrayList<Station> getFeaturedStation() {
        ArrayList<Station> list = new ArrayList<>();
        list.add(new Station("Flight plan(Tunes for Travel)", "flightplanmusic"));
        list.add(new Station("Two-Wheeling'(Biking Playlist)", "bicyclemusic"));
        list.add(new Station("Kids Jams(Music for children)", "kidsmusic"));

        return list;
    }

    public ArrayList<Station> getRecentStations() {
        ArrayList<Station> list = new ArrayList<>();
        return list;

    }

    public ArrayList<Station> getPartyStations() {
        ArrayList<Station> list = new ArrayList<>();
        return list;

    }


}
