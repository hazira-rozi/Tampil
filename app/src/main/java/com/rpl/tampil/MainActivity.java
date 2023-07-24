package com.rpl.tampil;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.*;

public class MainActivity extends AppCompatActivity {

    TextView txtNama; // deklasi txtNama
    Button btnTampil; // deklasi button
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txtNama = findViewById(R.id.textView);

    }

    public void tampilNama(View view){
        String nama ="Hazira Fakhrurrozi Amir";
        txtNama.setText(nama);
    }

    public void hapusNama(View view){
        String namaEmpty ="";
        txtNama.setText(namaEmpty);
    }
}