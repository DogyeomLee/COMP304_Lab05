package com.example.moblie_lab05;

import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;


public class GreekFragment extends Fragment
{

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState)
    {
        View view = inflater.inflate(R.layout.fragment_greek,container,false);

        Intent intent = new Intent(getActivity(), ThirdActivity.class);

        ImageButton Greek1 = (ImageButton) view.findViewById(R.id.Greek1);
        ImageButton Greek2 = (ImageButton) view.findViewById(R.id.Greek2);
        ImageButton Greek3 = (ImageButton) view.findViewById(R.id.Greek3);

        Greek1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {
                MainActivity MA = (MainActivity) getActivity();
                MA.RName("Krystos");
            }
        });

        Greek2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                MainActivity MA = (MainActivity) getActivity();
                MA.RName("Volos");
            }
        });

        Greek3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                MainActivity MA = (MainActivity) getActivity();
                MA.RName("Pantheon");
            }
        });
        return view;
    }
}