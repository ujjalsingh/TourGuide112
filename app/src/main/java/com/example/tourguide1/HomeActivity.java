package com.example.tourguide1;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import android.os.Bundle;
import android.view.MenuItem;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class HomeActivity extends AppCompatActivity implements BottomNavigationView.OnNavigationItemSelectedListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        BottomNavigationView bottomNavigationView = findViewById(R.id.navigation_header_container);
        bottomNavigationView.setOnNavigationItemSelectedListener(this);
        loadFragmnet(new HomeFragment());
    }

    private boolean loadFragmnet(Fragment fragment) {

        if (fragment != null) {
            getSupportFragmentManager()
                    .beginTransaction()
                    .replace(R.id.Fragmnet_container, fragment)
                    .commit();
            return true;
        }

        return false;
    }

    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {


        Fragment fragment = null;

        switch (menuItem.getItemId()) {
            case R.id.homeid:
                fragment = new HomeFragment();
                break;
            case R.id.searchicon:
                fragment = new SearchFragment();
                break;
            case R.id.profile:
                fragment = new ProfileFragment();
                break;

        }

        return loadFragmnet(fragment);




    }
}
