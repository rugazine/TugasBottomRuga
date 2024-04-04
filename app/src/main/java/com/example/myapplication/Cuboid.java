package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

public class Cuboid extends AppCompatActivity {

    private EditText panjangEditText, lebarEditText, tinggiEditText;
    private TextView hasilTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cuboid);

        // Inisialisasi EditText untuk input panjang, lebar, dan tinggi
        panjangEditText = findViewById(R.id.panjang);
        lebarEditText = findViewById(R.id.lebar);
        tinggiEditText = findViewById(R.id.tinggi);

        // Inisialisasi TextView untuk menampilkan hasil
        hasilTextView = findViewById(R.id.hasil_kuboid);

        // Inisialisasi ImageView untuk gambar hitung kuboid
        ImageView hitungImageView = findViewById(R.id.hitungkuboid);

        // Menambahkan OnClickListener pada ImageView
        hitungImageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                hitungLuasPermukaanKuboid();
            }
        });
    }

    // Method untuk menghitung luas permukaan kuboid
    private void hitungLuasPermukaanKuboid() {
        // Mendapatkan nilai panjang, lebar, dan tinggi dari EditText
        String panjangStr = panjangEditText.getText().toString().trim();
        String lebarStr = lebarEditText.getText().toString().trim();
        String tinggiStr = tinggiEditText.getText().toString().trim();

        // Memastikan input tidak kosong
        if (!panjangStr.isEmpty() && !lebarStr.isEmpty() && !tinggiStr.isEmpty()) {
            // Konversi nilai panjang, lebar, dan tinggi menjadi double
            double panjang = Double.parseDouble(panjangStr);
            double lebar = Double.parseDouble(lebarStr);
            double tinggi = Double.parseDouble(tinggiStr);

            // Menghitung luas permukaan kuboid
            double luasPermukaan = 2 * ((panjang * lebar) + (panjang * tinggi) + (lebar * tinggi));

            // Menampilkan hasil dalam TextView
            hasilTextView.setText("Luas Permukaan Kuboid: " + luasPermukaan);
        } else {
            // Jika ada input yang kosong, tampilkan pesan kesalahan
            hasilTextView.setText("Masukkan nilai panjang, lebar, dan tinggi terlebih dahulu");
        }
    }
}
