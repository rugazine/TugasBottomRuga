package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;


public class Triangle extends AppCompatActivity {

    private EditText angkaPertamaEditText, angkaKeduaEditText;
    private TextView hasilTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_triangle);

        // Inisialisasi EditText untuk input angka pertama dan kedua
        angkaPertamaEditText = findViewById(R.id.angkapertama);
        angkaKeduaEditText = findViewById(R.id.angkakedua);

        // Inisialisasi TextView untuk menampilkan hasil
        hasilTextView = findViewById(R.id.hasil);

        // Inisialisasi ImageView untuk gambar hitung segitiga
        ImageView hitungImageView = findViewById(R.id.hitungpersegipanjang);

        // Menambahkan OnClickListener pada ImageView
        hitungImageView.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                hitungLuasSegitiga();
            }
        });
    }

    // Method untuk menghitung luas segitiga
    private void hitungLuasSegitiga() {
        // Mendapatkan nilai angka pertama dan kedua dari EditText
        String angkaPertamaStr = angkaPertamaEditText.getText().toString().trim();
        String angkaKeduaStr = angkaKeduaEditText.getText().toString().trim();

        // Memastikan input tidak kosong
        if (!angkaPertamaStr.isEmpty() && !angkaKeduaStr.isEmpty()) {
            // Konversi nilai angka pertama dan kedua menjadi integer
            double angkaPertama = Double.parseDouble(angkaPertamaStr);
            double angkaKedua = Double.parseDouble(angkaKeduaStr);

            // Menghitung luas segitiga
            double luas = 0.5 * angkaPertama * angkaKedua;

            // Menampilkan hasil dalam TextView
            hasilTextView.setText("Luas Segitiga: " + luas);
        } else {
            // Jika input kosong, tampilkan pesan kesalahan
            hasilTextView.setText("Masukkan kedua angka terlebih dahulu");
        }
    }
}