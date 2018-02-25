package com.example.android.appredo.fragments;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.android.appredo.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class ListFragment extends Fragment {
    RecyclerView recyclerView;


    public ListFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View childView = inflater.inflate(R.layout.fragment_list, container, false);
        recyclerView = childView.findViewById(R.id.rv);


        return childView;
    }

}
