package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentTransaction;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private FragmentUno fra1;
    private FragmentDos fra2;
    private Button btnMain1;
    private Button btnMain2;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnMain1 = findViewById(R.id.button2);
        btnMain2 = findViewById(R.id.button3);

        btnMain1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                FragmentUno fragmentUno = new FragmentUno();
                FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();
                fragmentTransaction.replace(R.id.fracmentContainer , fragmentUno);
                fragmentTransaction.commit();
            }
        });

        btnMain2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                FragmentDos fragmentDos = new FragmentDos();
                FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();
                fragmentTransaction.replace(R.id.fracmentContainer , fragmentDos);
                fragmentTransaction.commit();
            }
        });




    }
}

