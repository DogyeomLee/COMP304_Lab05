package com.example.moblie_lab05;

import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;


public class ChineseFragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_chinese,container,false);

        Intent intent = new Intent(getActivity(), ThirdActivity.class);

        ImageButton Chinese1 = (ImageButton) view.findViewById(R.id.Chinese1);
        ImageButton Chinese2= (ImageButton) view.findViewById(R.id.Chinese2);
        ImageButton Chinese3= (ImageButton) view.findViewById(R.id.Chinese3);

        Chinese1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {
                MainActivity MA = (MainActivity) getActivity();
                MA.RName("Lucky Wok");
            }
        });

        Chinese2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                MainActivity MA = (MainActivity) getActivity();
                MA.RName("Hong Shing");
            }
        });

        Chinese3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                MainActivity MA = (MainActivity) getActivity();
                MA.RName("Lai Wah Heen");
            }
        });
        return view;
    }
}