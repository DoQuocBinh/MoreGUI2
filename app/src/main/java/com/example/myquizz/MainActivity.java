package com.example.myquizz;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button kiemTra = findViewById(R.id.btnKiemTra);
        Button goiY = findViewById(R.id.btnGoiy);

        CheckBox ckInt = findViewById(R.id.ckInt);
        CheckBox ckString = findViewById(R.id.ckString);
        CheckBox ckDouble = findViewById(R.id.ckDouble);

        kiemTra.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (ckString.isChecked()){
                    Toast.makeText(getApplicationContext(),"Ban da chon dung!",Toast.LENGTH_LONG).show();
                }
                else {
                    Toast.makeText(getApplicationContext(),"Ban da chon sai!",Toast.LENGTH_LONG).show();
                }
            }
        });

        goiY.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ckString.setChecked(true);
            }
        });

    }
}