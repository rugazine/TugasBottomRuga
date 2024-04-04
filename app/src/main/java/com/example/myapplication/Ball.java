package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

public class Ball extends AppCompatActivity {

    private EditText jariJariEditText;
    private TextView hasilTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ball);

        // Inisialisasi EditText untuk input jari-jari bola
        jariJariEditText = findViewById(R.id.jariJariBola);

        // Inisialisasi TextView untuk menampilkan hasil volume bola
        hasilTextView = findViewById(R.id.hasilBola);

        // Inisialisasi ImageView untuk gambar hitung bola
        ImageView hitungBolaImageView = findViewById(R.id.hitungBola);

        // Menambahkan OnClickListener pada ImageView
        hitungBolaImageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                hitungVolumeBola();
            }
        });
    }

    // Method untuk menghitung volume bola
    private void hitungVolumeBola() {
        // Mendapatkan nilai jari-jari bola dari EditText
        String jariJariStr = jariJariEditText.getText().toString().trim();

        // Memastikan input tidak kosong
        if (!jariJariStr.isEmpty()) {
            // Konversi nilai jari-jari bola menjadi double
            double jariJari = Double.parseDouble(jariJariStr);

            // Menghitung volume bola
            double volume = (4.0 / 3.0) * Math.PI * Math.pow(jariJari, 3);

            // Menampilkan hasil dalam TextView
            hasilTextView.setText("Volume Bola: " + volume);
        } else {
            // Jika input kosong, tampilkan pesan kesalahan
            hasilTextView.setText("Masukkan nilai jari-jari terlebih dahulu");
        }
    }
}
