package com.example.moblie_lab05;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.widget.PopupMenu;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.PopupMenu;
import android.widget.TextView;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity implements PopupMenu.OnMenuItemClickListener{

    TextView RName;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RName = findViewById(R.id.RName);

        Button next = (Button) findViewById(R.id.next);
        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String data = (String) RName.getText();
                Intent intent = new Intent(MainActivity.this, SecondActivity.class);
                intent.putExtra("RestName", data);
                startActivity(intent);
            }
        });

        ImageButton btn = (ImageButton) findViewById(R.id.popbutton);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                PopupMenu popup = new PopupMenu(MainActivity.this, v);
                popup.setOnMenuItemClickListener(MainActivity.this);
                popup.inflate(R.menu.options_menu);
                popup.show();
            }
        });

    }
    private void loadFragment(Fragment fragment)
    {
        FragmentManager fm = getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fm.beginTransaction();

        fragmentTransaction.replace(R.id.frameLayout, fragment);
        fragmentTransaction.commitNow();
    }
    @Override
    public boolean onMenuItemClick(MenuItem menuItem)
    {
        Toast.makeText(this, "Selected Item: " +menuItem.getTitle(), Toast.LENGTH_SHORT).show();
        switch (menuItem.getItemId()) {
            case R.id.Italian:
                loadFragment(new ItalianFragment());
                return true;
            case R.id.Greek:
                loadFragment(new GreekFragment());
                return true;
            case R.id.Chinese:
                loadFragment(new ChineseFragment());
                return true;
            case R.id.Indian:
                loadFragment(new IndianFragment());
                return true;
            default:
                return false;
        }
    }

    public void RName(String name)
    {
        RName.setText(name);
    }
}