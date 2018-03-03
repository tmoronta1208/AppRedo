package com.example.android.appredo.controller;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.android.appredo.R;
import com.example.android.appredo.model.Response;

import java.util.ArrayList;


public class UserAdapter extends RecyclerView.Adapter<UserAdapter.UserViewHolder> {
    ArrayList<Response> myResponse = new ArrayList<>();

    public UserAdapter(ArrayList<Response> myResponse) {
        this.myResponse = myResponse;
    }

    @Override
    public UserViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_view, parent, false);
        return new UserViewHolder(view);

//HEY!!!!
    }

    @Override
    public void onBindViewHolder(UserViewHolder holder, int position) {

        Response response = myResponse.get(position);



    }

    @Override
    public int getItemCount() {
        return myResponse.size();
    }

    public class UserViewHolder extends RecyclerView.ViewHolder {

        TextView textView;
        ImageView imageView;

        public UserViewHolder(View itemView) {
            super(itemView);

            textView = itemView.findViewById(R.id.text_item_view);
            imageView = itemView.findViewById(R.id.image_item_view);


        }


    }

}
