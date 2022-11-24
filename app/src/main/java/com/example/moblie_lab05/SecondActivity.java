package com.example.moblie_lab05;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;


public class SecondActivity extends AppCompatActivity {

    FragmentManager fm = getSupportFragmentManager();
    FragmentTransaction fragmentTransaction = fm.beginTransaction();
    SharedPreferences xyPref;
    SharedPreferences.Editor xyPrefEditor;
    double x, y;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        xyPref = getSharedPreferences("coords", MODE_PRIVATE);
        xyPrefEditor = xyPref.edit();

        Intent intent = getIntent();
        String RNAME = intent.getStringExtra("RestName");

        ImageView image = findViewById(R.id.imageView);
        TextView name = (TextView) findViewById(R.id.name);
        TextView restaurant = (TextView) findViewById(R.id.restaurant);
        TextView address = (TextView) findViewById(R.id.address);

        name.setText(RNAME);

        if(name.getText().toString().equals("Krystos"))
        {
            xyPrefEditor.putString("x", "43.718333859572816");
            xyPrefEditor.putString("y", "-79.4584153359482");
            xyPrefEditor.putString("resName", name.getText().toString());
            xyPrefEditor.apply();
            MapsFragment mapFragment = new MapsFragment();
            fragmentTransaction.replace(R.id.mapLayout, mapFragment);
            fragmentTransaction.commit();

            image.setImageResource(R.drawable.greek);
            restaurant.setText("Krystos Modern Greek Cuisine");
            address.setText("3200 Dufferin St #22");
        }
        if(name.getText().toString().equals("Volos"))
        {
            xyPrefEditor.putString("x", "43.650113594265086");
            xyPrefEditor.putString("y", "-79.38485495931175");
            xyPrefEditor.putString("resName", name.getText().toString());
            xyPrefEditor.apply();
            MapsFragment mapFragment = new MapsFragment();
            fragmentTransaction.replace(R.id.mapLayout, mapFragment);
            fragmentTransaction.commit();

            image.setImageResource(R.drawable.greeki);
            restaurant.setText("Volos Greek Cuisine");
            address.setText("133 Richmond St W");
        }
        if(name.getText().toString().equals("Pantheon"))
        {
            xyPrefEditor.putString("x", "43.6775429145633");
            xyPrefEditor.putString("y", "-79.35135153047456");
            xyPrefEditor.putString("resName", name.getText().toString());
            xyPrefEditor.apply();
            MapsFragment mapFragment = new MapsFragment();
            fragmentTransaction.replace(R.id.mapLayout, mapFragment);
            fragmentTransaction.commit();

            image.setImageResource(R.drawable.greekii);
            restaurant.setText("Pantheon Restaurant");
            address.setText("407 Danforth Ave");
        }
        if(name.getText().toString().equals("Portici"))
        {
            xyPrefEditor.putString("x", "43.67267833981365");
            xyPrefEditor.putString("y", "-79.38861177465677");
            xyPrefEditor.putString("resName", name.getText().toString());
            xyPrefEditor.apply();
            MapsFragment mapFragment = new MapsFragment();
            fragmentTransaction.replace(R.id.mapLayout, mapFragment);
            fragmentTransaction.commit();

            image.setImageResource(R.drawable.italian);
            restaurant.setText("Portici");
            address.setText("6 Scollard St");

        }
        if(name.getText().toString().equals("Padella"))
        {
            xyPrefEditor.putString("x", "43.73467489591631");
            xyPrefEditor.putString("y", "-79.41958537280013");
            xyPrefEditor.putString("resName", name.getText().toString());
            xyPrefEditor.apply();
            MapsFragment mapFragment = new MapsFragment();
            fragmentTransaction.replace(R.id.mapLayout, mapFragment);
            fragmentTransaction.commit();

            image.setImageResource(R.drawable.italiani);
            restaurant.setText("Padella Italian Eatery");
            address.setText("1967 Avenue Rd");
        }
        if(name.getText().toString().equals("La Vecchia"))
        {
            xyPrefEditor.putString("x", "43.71020291884987");
            xyPrefEditor.putString("y", "-79.39879260163718");
            xyPrefEditor.putString("resName", name.getText().toString());
            xyPrefEditor.apply();
            MapsFragment mapFragment = new MapsFragment();
            fragmentTransaction.replace(R.id.mapLayout, mapFragment);
            fragmentTransaction.commit();

            image.setImageResource(R.drawable.italianii);
            restaurant.setText("La Vecchia Restaurant Uptown");
            address.setText("2405 Yonge St A");
        }
        if(name.getText().toString().equals("Chimney"))
        {
            xyPrefEditor.putString("x", "43.73628933852622");
            xyPrefEditor.putString("y", "-79.42050614396368");
            xyPrefEditor.putString("resName", name.getText().toString());
            xyPrefEditor.apply();
            MapsFragment mapFragment = new MapsFragment();
            fragmentTransaction.replace(R.id.mapLayout, mapFragment);
            fragmentTransaction.commit();

            image.setImageResource(R.drawable.indian);
            restaurant.setText("The Copper Chimney");
            address.setText("2050 Avenue Rd, North York");
        }
        if(name.getText().toString().equals("Raj Mahal"))
        {
            xyPrefEditor.putString("x", "43.786642310534575");
            xyPrefEditor.putString("y", "-79.4689922225454");
            xyPrefEditor.putString("resName", name.getText().toString());
            xyPrefEditor.apply();
            MapsFragment mapFragment = new MapsFragment();
            fragmentTransaction.replace(R.id.mapLayout, mapFragment);
            fragmentTransaction.commit();

            image.setImageResource(R.drawable.indiani);
            restaurant.setText("Raj Mahal Indian Cuisine");
            address.setText("Dufferin Corners, 1881 Steeles Ave W");
        }
        if(name.getText().toString().equals("PUKKAPUKKA"))
        {
            xyPrefEditor.putString("x", "43.715447343475006");
            xyPrefEditor.putString("y", "-79.39995420163707");
            xyPrefEditor.putString("resName", name.getText().toString());
            xyPrefEditor.apply();
            MapsFragment mapFragment = new MapsFragment();
            fragmentTransaction.replace(R.id.mapLayout, mapFragment);
            fragmentTransaction.commit();

            image.setImageResource(R.drawable.indianii);
            restaurant.setText("PUKKAPUKKA");
            address.setText("2633 Yonge St");
        }
        if(name.getText().toString().equals("Lucky Wok"))
        {
            xyPrefEditor.putString("x", "43.731654641526305");
            xyPrefEditor.putString("y", "-79.46373231698225");
            xyPrefEditor.putString("resName", name.getText().toString());
            xyPrefEditor.apply();
            MapsFragment mapFragment = new MapsFragment();
            fragmentTransaction.replace(R.id.mapLayout, mapFragment);
            fragmentTransaction.commit();

            image.setImageResource(R.drawable.chinese);
            restaurant.setText("Lucky Wok Restaurants");
            address.setText("728 Wilson Ave, North York");
        }
        if(name.getText().toString().equals("Hong Shing"))
        {
            xyPrefEditor.putString("x", "43.65494476629003");
            xyPrefEditor.putString("y", "-79.38691675931157");
            xyPrefEditor.putString("resName", name.getText().toString());
            xyPrefEditor.apply();
            MapsFragment mapFragment = new MapsFragment();
            fragmentTransaction.replace(R.id.mapLayout, mapFragment);
            fragmentTransaction.commit();

            image.setImageResource(R.drawable.chinesei);
            restaurant.setText("Hong Shing Restaurant");
            address.setText("195 Dundas St W");
        }
        if(name.getText().toString().equals("Lai Wah Heen"))
        {
            xyPrefEditor.putString("x", "43.65465575410172");
            xyPrefEditor.putString("y", "-79.38615054396598");
            xyPrefEditor.putString("resName", name.getText().toString());
            xyPrefEditor.apply();
            MapsFragment mapFragment = new MapsFragment();
            fragmentTransaction.replace(R.id.mapLayout, mapFragment);
            fragmentTransaction.commit();

            image.setImageResource(R.drawable.chineseii);
            restaurant.setText("Lai Wah Heen");
            address.setText("108 Chestnut St");
        }
    }
}