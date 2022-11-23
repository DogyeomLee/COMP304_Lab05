package com.example.moblie_lab05;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        Intent intent = getIntent();
        String RNAME = intent.getStringExtra("RestName");

        ImageView image = findViewById(R.id.imageView);
        TextView name = (TextView) findViewById(R.id.name);
        TextView restaurant = (TextView) findViewById(R.id.restaurant);
        TextView address = (TextView) findViewById(R.id.address);

        name.setText(RNAME);

        if(name.getText().toString().equals("Krystos"))
        {
            image.setImageResource(R.drawable.greek);
            restaurant.setText("Krystos Modern Greek Cuisine");
            address.setText("3200 Dufferin St #22");
        }
        if(name.getText().toString().equals("Volos"))
        {
            image.setImageResource(R.drawable.greeki);
            restaurant.setText("Volos Greek Cuisine");
            address.setText("133 Richmond St W");
        }
        if(name.getText().toString().equals("Pantheon"))
        {
            image.setImageResource(R.drawable.greekii);
            restaurant.setText("Pantheon Restaurant");
            address.setText("407 Danforth Ave");
        }
        if(name.getText().toString().equals("Portici"))
        {
            image.setImageResource(R.drawable.italian);
            restaurant.setText("Portici");
            address.setText("6 Scollard St");

        }
        if(name.getText().toString().equals("Padella"))
        {
            image.setImageResource(R.drawable.italiani);
            restaurant.setText("Padella Italian Eatery");
            address.setText("1967 Avenue Rd");
        }
        if(name.getText().toString().equals("La Vecchia"))
        {
            image.setImageResource(R.drawable.italianii);
            restaurant.setText("La Vecchia Restaurant Uptown");
            address.setText("2405 Yonge St A");
        }
        if(name.getText().toString().equals("Chimney"))
        {
            image.setImageResource(R.drawable.indian);
            restaurant.setText("The Copper Chimney");
            address.setText("2050 Avenue Rd, North York");
        }
        if(name.getText().toString().equals("Raj Mahal"))
        {
            image.setImageResource(R.drawable.indiani);
            restaurant.setText("Raj Mahal Indian Cuisine");
            address.setText("Dufferin Corners, 1881 Steeles Ave W");
        }
        if(name.getText().toString().equals("PUKKAPUKKA"))
        {
            image.setImageResource(R.drawable.indianii);
            restaurant.setText("PUKKAPUKKA");
            address.setText("2633 Yonge St");
        }
        if(name.getText().toString().equals("Lucky Wok"))
        {
            image.setImageResource(R.drawable.chinese);
            restaurant.setText("Lucky Wok Restaurants");
            address.setText("728 Wilson Ave, North York");
        }
        if(name.getText().toString().equals("Hong Shing"))
        {
            image.setImageResource(R.drawable.chinesei);
            restaurant.setText("Hong Shing Restaurant");
            address.setText("195 Dundas St W");
        }
        if(name.getText().toString().equals("Lai Wah Heen"))
        {
            image.setImageResource(R.drawable.chineseii);
            restaurant.setText("Lai Wah Heen");
            address.setText("108 Chestnut St");
        }








    }
}