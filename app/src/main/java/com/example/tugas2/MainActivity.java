package com.example.tugas2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView output;
    Button button1,button2,button3;
    EditText input1,input2,input3;
    double hasil;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        output = findViewById(R.id.output);
        button1 = findViewById(R.id.button1);
        button2 = findViewById(R.id.button2);
        button3 = findViewById(R.id.button3);
        input1 = findViewById(R.id.input1);
        input2 = findViewById(R.id.input2);
        input3 = findViewById(R.id.input3);

        button1.setOnClickListener(view -> {

            String Spanjang = input1.getText().toString();
            String Slebar = input2.getText().toString();
            String Stinggi = input3.getText().toString();

            double panjang = Double.parseDouble(Spanjang);
            double lebar = Double.parseDouble(Slebar);
            double tinggi = Double.parseDouble(Stinggi);

            hasil = panjang*lebar*tinggi;
            String Shasil = String.valueOf(hasil);
            output.setText(Shasil);
        });
        button2.setOnClickListener(view -> {

            String Spanjang = input1.getText().toString();
            String Slebar = input2.getText().toString();
            String Stinggi = input3.getText().toString();

            double panjang = Double.parseDouble(Spanjang);
            double lebar = Double.parseDouble(Slebar);
            double tinggi = Double.parseDouble(Stinggi);

            hasil = panjang*lebar*tinggi/2;
            String Shasil = String.valueOf(hasil);
            output.setText(Shasil);
        });
        button3.setOnClickListener(view -> {

            String Spanjang = input1.getText().toString();
            String Slebar = input2.getText().toString();
            String Stinggi = input3.getText().toString();

            double panjang = Double.parseDouble(Spanjang);
            double lebar = Double.parseDouble(Slebar);
            double tinggi = Double.parseDouble(Stinggi);

            hasil = panjang*lebar*tinggi/3;
            String Shasil = String.valueOf(hasil);
            output.setText(Shasil);
        });
    }
}