package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;


public class Square extends AppCompatActivity {

    private EditText sisiEditText;
    private TextView hasilTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_square);

        // Inisialisasi EditText untuk input sisi
        sisiEditText = findViewById(R.id.angkakedua);

        // Inisialisasi TextView untuk menampilkan hasil
        hasilTextView = findViewById(R.id.hasil);

        // Inisialisasi ImageView untuk gambar hitung persegi
        ImageView hitungImageView = findViewById(R.id.hitungpersegi);

        // Menambahkan OnClickListener pada ImageView
        hitungImageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                hitungLuasPersegi();
            }
        });
    }

    // Method untuk menghitung luas persegi
    private void hitungLuasPersegi() {
        // Mendapatkan nilai sisi dari EditText
        String sisiStr = sisiEditText.getText().toString().trim();

        // Memastikan input tidak kosong
        if (!sisiStr.isEmpty()) {
            // Konversi nilai sisi menjadi integer
            int sisi = Integer.parseInt(sisiStr);

            // Menghitung luas persegi
            int luas = sisi * sisi;

            // Menampilkan hasil dalam TextView
            hasilTextView.setText("Luas Persegi: " + luas);
        } else {
            // Jika input kosong, tampilkan pesan kesalahan
            hasilTextView.setText("Masukkan panjang sisi terlebih dahulu");
        }
    }
}