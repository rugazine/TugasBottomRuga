package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;


public class Rectangle extends AppCompatActivity {

    private EditText angkaPertamaEditText, angkaKeduaEditText;
    private TextView hasilTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rectangle);

        // Inisialisasi EditText untuk input angka pertama dan kedua
        angkaPertamaEditText = findViewById(R.id.angkapertama);
        angkaKeduaEditText = findViewById(R.id.angkakedua);

        // Inisialisasi TextView untuk menampilkan hasil
        hasilTextView = findViewById(R.id.hasil);

        // Inisialisasi ImageView untuk gambar hitung persegi panjang
        ImageView hitungImageView = findViewById(R.id.hitungpersegipanjang);

        // Menambahkan OnClickListener pada ImageView
        hitungImageView.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                hitungLuasPersegiPanjang();
            }
        });
    }

    // Method untuk menghitung luas persegi panjang
    private void hitungLuasPersegiPanjang() {
        // Mendapatkan nilai angka pertama dan kedua dari EditText
        String angkaPertamaStr = angkaPertamaEditText.getText().toString().trim();
        String angkaKeduaStr = angkaKeduaEditText.getText().toString().trim();

        // Memastikan input tidak kosong
        if (!angkaPertamaStr.isEmpty() && !angkaKeduaStr.isEmpty()) {
            // Konversi nilai angka pertama dan kedua menjadi integer
            int angkaPertama = Integer.parseInt(angkaPertamaStr);
            int angkaKedua = Integer.parseInt(angkaKeduaStr);

            // Menghitung luas persegi panjang
            int luas = angkaPertama * angkaKedua;

            // Menampilkan hasil dalam TextView
            hasilTextView.setText("Luas Persegi Panjang: " + luas);
        } else {
            // Jika input kosong, tampilkan pesan kesalahan
            hasilTextView.setText("Masukkan kedua angka terlebih dahulu");
        }
    }
}