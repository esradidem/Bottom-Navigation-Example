package com.example.bottomnavigationexample;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import android.os.Bundle;
import android.view.MenuItem;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class MainActivity extends AppCompatActivity
{
    BottomNavigationView bottomNavigationView;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        bottomNavigationView = findViewById(R.id.bottomNavigation);

        getSupportFragmentManager().beginTransaction().add(R.id.frame_layout, new Fragment(R.layout.pass_fragment)).commit();

        bottomNavigationView.setOnNavigationItemSelectedListener(bottomNavigationListener);

    }


    public final BottomNavigationView.OnNavigationItemSelectedListener bottomNavigationListener = new BottomNavigationView.OnNavigationItemSelectedListener()
    {
        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem item)
        {
            if (item.getItemId() == R.id.pass)
            {
                getSupportFragmentManager().beginTransaction().replace(R.id.frame_layout, new Fragment(R.layout.pass_fragment)).commit();
            }

            if (item.getItemId() == R.id.right)
            {
                getSupportFragmentManager().beginTransaction().replace(R.id.frame_layout, new Fragment(R.layout.right_fragment)).commit();
            }

            if (item.getItemId() == R.id.taboo)
            {
                getSupportFragmentManager().beginTransaction().replace(R.id.frame_layout, new Fragment(R.layout.taboo_fragment)).commit();
            }

            return false;
        }
    };

}