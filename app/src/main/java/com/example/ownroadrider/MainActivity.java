package com.example.ownroadrider;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.Button;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {
    private ImageButton map;
    private Button theme1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        map = findViewById(R.id.mapButton);
        theme1 = findViewById(R.id.themeButton1);

        map.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast toast = Toast.makeText(getApplicationContext(), "맵으로 이동합니다", Toast.LENGTH_SHORT);
                toast.show();
            }
        });

        theme1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(),"테마선택입니다",Toast.LENGTH_LONG).show();
            }
        });
    }

}