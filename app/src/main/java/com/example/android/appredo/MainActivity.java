package com.example.android.appredo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.android.appredo.fragments.ListFragment;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ListFragment listFragment = new ListFragment();

        getSupportFragmentManager().beginTransaction()
                .replace(R.id.fragment_container, listFragment)
                .commit();
    }
}
