package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

public class Cylinder extends AppCompatActivity {

    private EditText jariJariEditText, tinggiTabungEditText;
    private TextView hasilTabungTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cylinder);

        // Inisialisasi EditText untuk input jari-jari dan tinggi tabung
        jariJariEditText = findViewById(R.id.jariJari);
        tinggiTabungEditText = findViewById(R.id.tinggiTabung);

        // Inisialisasi TextView untuk menampilkan hasil volume tabung
        hasilTabungTextView = findViewById(R.id.hasilTabung);

        // Inisialisasi ImageView untuk gambar hitung tabung
        ImageView hitungTabungImageView = findViewById(R.id.hitungTabung);

        // Menambahkan OnClickListener pada ImageView
        hitungTabungImageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                hitungVolumeTabung();
            }
        });
    }

    // Method untuk menghitung volume tabung
    private void hitungVolumeTabung() {
        // Mendapatkan nilai jari-jari dan tinggi tabung dari EditText
        String jariJariStr = jariJariEditText.getText().toString().trim();
        String tinggiTabungStr = tinggiTabungEditText.getText().toString().trim();

        // Memastikan input tidak kosong
        if (!jariJariStr.isEmpty() && !tinggiTabungStr.isEmpty()) {
            // Konversi nilai jari-jari dan tinggi tabung menjadi double
            double jariJari = Double.parseDouble(jariJariStr);
            double tinggiTabung = Double.parseDouble(tinggiTabungStr);

            // Menghitung volume tabung
            double volume = Math.PI * Math.pow(jariJari, 2) * tinggiTabung;

            // Menampilkan hasil dalam TextView
            hasilTabungTextView.setText("Volume Tabung: " + volume);
        } else {
            // Jika input kosong, tampilkan pesan kesalahan
            hasilTabungTextView.setText("Masukkan jari-jari dan tinggi tabung terlebih dahulu");
        }
    }
}
