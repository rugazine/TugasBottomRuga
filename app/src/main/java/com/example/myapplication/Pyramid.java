package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

public class Pyramid extends AppCompatActivity {

    private EditText panjangAlasEditText, tinggiPiramidaEditText;
    private TextView hasilPiramidaTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pyramid);

        // Inisialisasi EditText untuk input panjang alas dan tinggi piramida
        panjangAlasEditText = findViewById(R.id.panjangAlas);
        tinggiPiramidaEditText = findViewById(R.id.tinggiPiramida);

        // Inisialisasi TextView untuk menampilkan hasil volume piramida
        hasilPiramidaTextView = findViewById(R.id.hasilPiramida);

        // Inisialisasi ImageView untuk gambar hitung piramida
        ImageView hitungPiramidaImageView = findViewById(R.id.hitungPiramida);

        // Menambahkan OnClickListener pada ImageView
        hitungPiramidaImageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                hitungVolumePiramida();
            }
        });
    }

    // Method untuk menghitung volume piramida
    private void hitungVolumePiramida() {
        // Mendapatkan nilai panjang alas dan tinggi piramida dari EditText
        String panjangAlasStr = panjangAlasEditText.getText().toString().trim();
        String tinggiPiramidaStr = tinggiPiramidaEditText.getText().toString().trim();

        // Memastikan input tidak kosong
        if (!panjangAlasStr.isEmpty() && !tinggiPiramidaStr.isEmpty()) {
            // Konversi nilai panjang alas dan tinggi piramida menjadi double
            double panjangAlas = Double.parseDouble(panjangAlasStr);
            double tinggiPiramida = Double.parseDouble(tinggiPiramidaStr);

            // Menghitung volume piramida
            double volume = (1.0/3.0) * panjangAlas * panjangAlas * tinggiPiramida;

            // Menampilkan hasil dalam TextView
            hasilPiramidaTextView.setText("Volume Piramida: " + volume);
        } else {
            // Jika input kosong, tampilkan pesan kesalahan
            hasilPiramidaTextView.setText("Masukkan panjang alas dan tinggi piramida terlebih dahulu");
        }
    }
}
