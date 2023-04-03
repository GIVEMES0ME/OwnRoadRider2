package com.example.ownroadrider;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import android.widget.Button;
import android.widget.Toast;

import com.google.android.material.bottomnavigation.BottomNavigationItemView;
import com.google.android.material.bottomnavigation.BottomNavigationView;


public class MainActivity extends AppCompatActivity {

    private final int Fragment_mypage = 1;
    private ImageButton map;
    private Button theme1;
    private ImageButton myPageBtn;
    private ImageButton homeBtn;
    private FrameLayout fragmentContainer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        map = findViewById(R.id.mapButton);
        theme1 = findViewById(R.id.themeButton1);
        myPageBtn = findViewById(R.id.mypageButton);
        homeBtn = findViewById(R.id.homeButton);
        fragmentContainer = findViewById(R.id.fragment_container);

        MyPageFragment mypageFragment = new MyPageFragment();
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

        homeBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(),"메인화면입니다.",Toast.LENGTH_LONG).show();
                fragmentContainer.setVisibility(View.INVISIBLE);
            }
        });

        myPageBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(),"마이페이지입니다.",Toast.LENGTH_LONG).show();
                getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container, mypageFragment).commitAllowingStateLoss();
                fragmentContainer.setVisibility(View.VISIBLE);
            }
        });
    }
}