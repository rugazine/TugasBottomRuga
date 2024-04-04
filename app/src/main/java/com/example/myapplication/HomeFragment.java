package com.example.myapplication;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;


public class HomeFragment extends Fragment {

    ImageView kubus;
    ImageView balok;
    ImageView piramida;
    ImageView silinder;
    ImageView trapesium;
    ImageView bola;

    @SuppressLint("MissingInflatedId")
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_home, container, false);

        kubus = view.findViewById(R.id.cube);
        balok = view.findViewById(R.id.cuboid);
        piramida = view.findViewById(R.id.pyramid);
        silinder = view.findViewById(R.id.parallelepiped);
        trapesium = view.findViewById(R.id.trapzoidal);
        bola = view.findViewById(R.id.ball);

        kubus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), Cube.class);
                startActivity(intent);
            }
        });

        balok.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), Cuboid.class);
                startActivity(intent);
            }
        });

        piramida.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), Pyramid.class);
                startActivity(intent);
            }
        });

        silinder.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), Cylinder.class);
                startActivity(intent);
            }
        });

        trapesium.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), Trapezoidal.class);
                startActivity(intent);
            }
        });

        bola.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), Ball.class);
                startActivity(intent);
            }
        });

        return view;
    }
}
