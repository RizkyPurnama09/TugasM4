package com.example.modul4;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Regist extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_regist);
    }

    public void pindahh1(View view) {
        Intent inten = new Intent(Regist.this, Regist_sukses.class);
        startActivity(inten);
    }
}