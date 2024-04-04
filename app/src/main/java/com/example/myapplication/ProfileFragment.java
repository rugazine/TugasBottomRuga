package com.example.myapplication;

import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;


public class ProfileFragment extends Fragment {

    ImageView persegi;
    ImageView persegipanjang;
    ImageView segitiga;
    ImageView trapesium;
    ImageView jajargenjang;
    ImageView lingkaran;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_profile,container,false);

        persegi = view.findViewById(R.id.persegi);
        persegipanjang = view.findViewById(R.id.persegipanjang);
        segitiga = view.findViewById(R.id.segitiga);
        trapesium = view.findViewById(R.id.trapesium);
        jajargenjang = view.findViewById(R.id.jajargenjang);
        lingkaran = view.findViewById(R.id.lingkaran);

        persegi.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick (View v){
                Intent intent=new Intent(getActivity(),Square.class);
                startActivity(intent);
            }
        });

        persegipanjang.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick (View v){
                Intent intent=new Intent(getActivity(),Rectangle.class);
                startActivity(intent);
            }
        });

        segitiga.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick (View v){
                Intent intent=new Intent(getActivity(),Triangle.class);
                startActivity(intent);
            }
        });

        trapesium.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick (View v){
                Intent intent=new Intent(getActivity(),trapezium.class);
                startActivity(intent);
            }
        });

        jajargenjang.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick (View v){
                Intent intent=new Intent(getActivity(),jajar.class);
                startActivity(intent);
            }
        });

        lingkaran.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick (View v){
                Intent intent=new Intent(getActivity(),circle.class);
                startActivity(intent);
            }
        });

        return view;
    }
}