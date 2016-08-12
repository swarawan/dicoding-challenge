package com.swarawan.app.hitungluas;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.util.Locale;

public class MainActivity extends AppCompatActivity {

    Button buttonHitung;
    EditText editPanjang;
    EditText editLebar;
    TextView textHasil;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        getSupportActionBar().setTitle("Hitung Luas Persegi Panjang");

        editPanjang = (EditText) findViewById(R.id.panjang);
        editLebar = (EditText) findViewById(R.id.lebar);
        textHasil = (TextView) findViewById(R.id.hasil);
        buttonHitung = (Button) findViewById(R.id.hitung);

        buttonHitung.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                final String panjang = editPanjang.getText().toString().equals("") ? "0" : editPanjang.getText().toString();
                final String lebar = editLebar.getText().toString().equals("") ? "0" : editLebar.getText().toString();

                hitung(panjang, lebar);
            }
        });
    }

    private void hitung(String p, String l) {
        final double panjang = Double.parseDouble(p);
        final double lebar = Double.parseDouble(l);

        double hasil = panjang * lebar;
        textHasil.setText(String.format(Locale.getDefault(), "Luas : %s", hasil));
    }

}
