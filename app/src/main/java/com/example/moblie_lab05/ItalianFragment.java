package com.example.moblie_lab05;

import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;

public class ItalianFragment extends Fragment {


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_italian,container,false);

        Intent intent = new Intent(getActivity(), ThirdActivity.class);

        ImageButton Italian1 = (ImageButton) view.findViewById(R.id.italian1);
        ImageButton Italian2= (ImageButton) view.findViewById(R.id.italian2);
        ImageButton Italian3= (ImageButton) view.findViewById(R.id.italian3);

        Italian1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {
                MainActivity MA = (MainActivity) getActivity();
                MA.RName("Portici");
            }
        });

        Italian2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                MainActivity MA = (MainActivity) getActivity();
                MA.RName("Padella");
            }
        });

        Italian3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                MainActivity MA = (MainActivity) getActivity();
                MA.RName("La Vecchia");
            }
        });
        return view;
    }
}