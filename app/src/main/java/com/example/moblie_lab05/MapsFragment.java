package com.example.moblie_lab05;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;


import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;


public class MapsFragment extends Fragment{

    SharedPreferences xyPref;
    SharedPreferences.Editor xyPredEditor;

    private OnMapReadyCallback callback = new OnMapReadyCallback() {

        @Override
        public void onMapReady(GoogleMap googleMap) {
            xyPref = getActivity().getSharedPreferences("coords", Context.MODE_PRIVATE);
            xyPredEditor = xyPref.edit();
            double x = Double.parseDouble(xyPref.getString("x","1.0"));
            double y = Double.parseDouble(xyPref.getString("y", "-1.0"));
            String restName = xyPref.getString("resName", "");

            LatLng sydney = new LatLng(x, y);
            googleMap.addMarker(new MarkerOptions().position(sydney).title(restName));
            googleMap.moveCamera(CameraUpdateFactory.newLatLngZoom(sydney, 10));

        }
    };

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater,
                             @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_maps, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        SupportMapFragment mapFragment =
                (SupportMapFragment) getChildFragmentManager().findFragmentById(R.id.map);
        if (mapFragment != null) {
            mapFragment.getMapAsync(callback);
        }
    }




}