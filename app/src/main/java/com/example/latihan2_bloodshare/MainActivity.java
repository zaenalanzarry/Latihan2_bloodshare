package com.example.latihan2_bloodshare;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

/**
 * Tanggal Pengerjaan : 27 April 2021
 * NIM : 10118023
 * Nama : Zaenal Anzarry
 * Kelas : IF-1 / S1 / VI
 */

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
    }

    public void PindahToRegister(View view) {
        Intent intent1 = new Intent(MainActivity.this, Register.class);
        startActivity(intent1);
    }
}