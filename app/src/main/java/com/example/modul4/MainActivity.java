package com.example.modul4;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void pindah3(View view) {
        Intent inten = new Intent(MainActivity.this, Regist.class);
        startActivity(inten);
    }

    public void pindah1(View view) {
        Intent inten = new Intent(MainActivity.this, Login_sukses.class);
        startActivity(inten);
    }
}