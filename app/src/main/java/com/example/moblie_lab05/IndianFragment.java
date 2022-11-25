package com.example.moblie_lab05;

import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;

public class IndianFragment extends Fragment {


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_indian,container,false);

        Intent intent = new Intent(getActivity(), SecondActivity.class);

        ImageButton Indian1 = (ImageButton) view.findViewById(R.id.Indian1);
        ImageButton Indian2= (ImageButton) view.findViewById(R.id.Indian2);
        ImageButton Indian3= (ImageButton) view.findViewById(R.id.Indian3);

        Indian1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {
                MainActivity MA = (MainActivity) getActivity();
                MA.RName("Chimney");
            }
        });

        Indian2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                MainActivity MA = (MainActivity) getActivity();
                MA.RName("Raj Mahal");
            }
        });

        Indian3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                MainActivity MA = (MainActivity) getActivity();
                MA.RName("PUKKAPUKKA");
            }
        });
        return view;
    }
}