package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

public class Cube extends AppCompatActivity {

    private EditText sisiEditText;
    private TextView hasilTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cube);

        // Inisialisasi EditText untuk input sisi kubus
        sisiEditText = findViewById(R.id.sisi);

        // Inisialisasi TextView untuk menampilkan hasil
        hasilTextView = findViewById(R.id.hasil);

        // Inisialisasi ImageView untuk gambar hitung kubus
        ImageView hitungImageView = findViewById(R.id.hitungkubus);

        // Menambahkan OnClickListener pada ImageView
        hitungImageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                hitungLuasPermukaanKubus();
            }
        });
    }

    // Method untuk menghitung luas permukaan kubus
    private void hitungLuasPermukaanKubus() {
        // Mendapatkan nilai sisi dari EditText
        String sisiStr = sisiEditText.getText().toString().trim();

        // Memastikan input tidak kosong
        if (!sisiStr.isEmpty()) {
            // Konversi nilai sisi menjadi double
            double sisi = Double.parseDouble(sisiStr);

            // Menghitung luas permukaan kubus
            double luasPermukaan = 6 * Math.pow(sisi, 2);

            // Menampilkan hasil dalam TextView
            hasilTextView.setText("Luas Permukaan Kubus: " + luasPermukaan);
        } else {
            // Jika input kosong, tampilkan pesan kesalahan
            hasilTextView.setText("Masukkan panjang sisi terlebih dahulu");
        }
    }
}
