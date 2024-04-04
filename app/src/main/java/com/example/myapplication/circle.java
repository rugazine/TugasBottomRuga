package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

public class circle extends AppCompatActivity {
    private EditText jariJariEditText;
    private TextView hasilTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_circle);

        // Inisialisasi EditText untuk input jari-jari lingkaran
        jariJariEditText = findViewById(R.id.angkakedua);

        // Inisialisasi TextView untuk menampilkan hasil
        hasilTextView = findViewById(R.id.hasil);

        // Inisialisasi ImageView untuk tombol hitung
        ImageView hitungButton = findViewById(R.id.lingkaran);

        // Menambahkan OnClickListener pada ImageView (tombol hitung)
        hitungButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                hitungDanTampilkanLuasLingkaran();
            }
        });
    }

    // Method untuk menghitung luas lingkaran dan menampilkan hasilnya di TextView
    private void hitungDanTampilkanLuasLingkaran() {
        // Mendapatkan nilai jari-jari dari EditText
        String jariJariStr = jariJariEditText.getText().toString().trim();

        // Memeriksa apakah input jari-jari kosong
        if (!TextUtils.isEmpty(jariJariStr)) {
            // Konversi nilai jari-jari menjadi double
            double jariJari = Double.parseDouble(jariJariStr);

            // Menghitung luas lingkaran
            double luas = hitungLuasLingkaran(jariJari);

            // Menampilkan hasil dalam TextView
            hasilTextView.setText("Luas Lingkaran: " + luas);
        } else {
            // Jika input jari-jari kosong, tampilkan pesan kesalahan
            hasilTextView.setText("Masukkan jari-jari terlebih dahulu");
        }
    }

    // Method untuk menghitung luas lingkaran
    private double hitungLuasLingkaran(double jariJari) {
        return Math.PI * jariJari * jariJari;
    }
}