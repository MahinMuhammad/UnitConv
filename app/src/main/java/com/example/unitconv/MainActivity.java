package com.example.unitconv;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.app.AppCompatDelegate;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private Button button;
    private EditText outPut;
    private EditText inPut;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_NO); //to avoid having night mode

        button = findViewById(R.id.button);
        outPut = findViewById(R.id.editTextTextPersonName);
        inPut = findViewById(R.id.editTextNumberDecimal);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                if(inPut.getText().toString().isEmpty())
                {
                    Toast.makeText(MainActivity.this, "Input KG Value", Toast.LENGTH_SHORT).show();
                }
                else
                {
                    outPut.setText(String.format("%.2f",Double.parseDouble(inPut.getText().toString())*2.2046226218));
                }
            }
        });
    }
}