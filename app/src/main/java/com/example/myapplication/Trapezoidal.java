package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

public class Trapezoidal extends AppCompatActivity {

    private EditText panjangAlasAtasEditText, panjangAlasBawahEditText, tinggiPrismaEditText;
    private TextView hasilPrismaTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_trapezoidal);

        // Inisialisasi EditText untuk input panjang alas atas, panjang alas bawah, dan tinggi prisma
        panjangAlasAtasEditText = findViewById(R.id.panjangAlasAtas);
        panjangAlasBawahEditText = findViewById(R.id.panjangAlasBawah);
        tinggiPrismaEditText = findViewById(R.id.tinggiPrisma);

        // Inisialisasi TextView untuk menampilkan hasil volume prisma
        hasilPrismaTextView = findViewById(R.id.hasilPrisma);

        // Inisialisasi ImageView untuk gambar hitung prisma
        ImageView hitungPrismaImageView = findViewById(R.id.hitungPrisma);

        // Menambahkan OnClickListener pada ImageView
        hitungPrismaImageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                hitungVolumePrisma();
            }
        });
    }

    // Method untuk menghitung volume prisma trapesium
    private void hitungVolumePrisma() {
        // Mendapatkan nilai panjang alas atas, panjang alas bawah, dan tinggi prisma dari EditText
        String panjangAlasAtasStr = panjangAlasAtasEditText.getText().toString().trim();
        String panjangAlasBawahStr = panjangAlasBawahEditText.getText().toString().trim();
        String tinggiPrismaStr = tinggiPrismaEditText.getText().toString().trim();

        // Memastikan input tidak kosong
        if (!panjangAlasAtasStr.isEmpty() && !panjangAlasBawahStr.isEmpty() && !tinggiPrismaStr.isEmpty()) {
            // Konversi nilai panjang alas atas, panjang alas bawah, dan tinggi prisma menjadi double
            double panjangAlasAtas = Double.parseDouble(panjangAlasAtasStr);
            double panjangAlasBawah = Double.parseDouble(panjangAlasBawahStr);
            double tinggiPrisma = Double.parseDouble(tinggiPrismaStr);

            // Menghitung volume prisma
            double volume = ((panjangAlasAtas + panjangAlasBawah) / 2) * tinggiPrisma;

            // Menampilkan hasil dalam TextView
            hasilPrismaTextView.setText("Volume Prisma: " + volume);
        } else {
            // Jika input kosong, tampilkan pesan kesalahan
            hasilPrismaTextView.setText("Masukkan panjang alas atas, panjang alas bawah, dan tinggi prisma terlebih dahulu");
        }
    }
}
