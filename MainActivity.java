package com.example.ddddd.cal;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    private TextView txthasil;
    private Button btntambah,btnkurang, btnkali, btnbagi;
    private EditText edtbil1, edtbil2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        txthasil= (TextView) findViewById(R.id.txt_hasil);
        btntambah = (Button) findViewById(R.id.btn_tambah);
        btnkurang = (Button) findViewById(R.id.btn_kurang);
        btnbagi = (Button) findViewById(R.id.btn_bagi);
        btnkali = (Button) findViewById(R.id.btn_kali);
        edtbil1 = (EditText) findViewById(R.id.edt_bil1);
        edtbil2 = (EditText) findViewById(R.id.edt_bil2);

        btntambah.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String bil1 = edtbil1.getText().toString().trim();
                String bil2 = edtbil2.getText().toString().trim();

                double bilangan1 = Double.parseDouble(bil1);
                double bilangan2 = Double.parseDouble(bil2);
                double hasil = bilangan1 + bilangan2;

                txthasil.setText("Hasil = " + hasil);
            }
        });

        btnkurang.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String bil1 = edtbil1.getText().toString().trim();
                String bil2 = edtbil2.getText().toString().trim();

                double bilangan1 = Double.parseDouble(bil1);
                double bilangan2 = Double.parseDouble(bil2);
                double hasil = bilangan1 - bilangan2;

                txthasil.setText("Hasil = "+hasil);
            }
        });

        btnkali.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String bil1 = edtbil1.getText().toString().trim();
                String bil2 = edtbil2.getText().toString().trim();

                double bilangan1 = Double.parseDouble(bil1);
                double bilangan2 = Double.parseDouble(bil2);
                double hasil = bilangan1 * bilangan2;

                txthasil.setText("Hasil = "+hasil);
            }
        });

        btnbagi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String bil1 = edtbil1.getText().toString().trim();
                String bil2 = edtbil2.getText().toString().trim();

                double bilangan1 = Double.parseDouble(bil1);
                double bilangan2 = Double.parseDouble(bil2);
                double hasil = bilangan1 / bilangan2;

                txthasil.setText("Hasil = "+hasil);
            }
        });
    }
}
