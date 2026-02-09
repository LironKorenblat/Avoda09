package com.example.avoda09;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    Button btn;
    EditText etn;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn = findViewById(R.id.btn);
        etn = findViewById(R.id.etn);
    }

    public void clicked(View view) {
        String st = etn.getText().toString();
        int num = Integer.parseInt(st);
        if(num % 7 != 0){
            btn.setText("the number " + num + " is not a multiple of 7 number: ");
        }
        else{
            btn.setText("BOOM!");
        }
    }
}
