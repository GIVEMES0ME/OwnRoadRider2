package com.example.ownroadrider;

import android.media.Image;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.Toast;
public class MyPageFragment extends Fragment {

    ImageButton settingBtn;
    Button manageReviewBtn;
    Button checkedDestBtn;
    Button listDestBtn;
    Button recommendScheduleBtn;
    Button.OnClickListener clickListener;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_my_page,container,false);
        settingBtn = (ImageButton) view.findViewById(R.id.settingBtn);
        manageReviewBtn = (Button) view.findViewById(R.id.manageReviewBtn);
        checkedDestBtn = (Button) view.findViewById(R.id.checkedDestBtn);
        listDestBtn = (Button) view.findViewById(R.id.listDestBtn);
        recommendScheduleBtn = (Button) view.findViewById(R.id.recommendScheduleBtn);

        clickListener = new Button.OnClickListener() {
            @Override
            public void onClick(View view) {
                switch (view.getId()){
                    case R.id.settingBtn:
                        Toast.makeText(getContext(),"설정 버튼",Toast.LENGTH_SHORT).show();
                        Log.d(this.getClass().getName(), "설정 버튼");
                        break;
                    case R.id.manageReviewBtn:
                        Toast.makeText(getContext(),"나의 리뷰 관리",Toast.LENGTH_SHORT).show();
                        Log.d(this.getClass().getName(), "나의 리뷰 관리");                        break;
                    case R.id.checkedDestBtn:
                        Toast.makeText(getContext(),"내가 본 여행지",Toast.LENGTH_SHORT).show();
                        Log.d(this.getClass().getName(), "내가 본 여행지");                        break;
                    case R.id.listDestBtn:
                        Toast.makeText(getContext(),"관심 여행지 목록",Toast.LENGTH_SHORT).show();
                        Log.d(this.getClass().getName(), "관심 여행지 목록");                        break;
                    case R.id.recommendScheduleBtn:
                        Toast.makeText(getContext(),"여행 고수들의 추천 일정!",Toast.LENGTH_SHORT).show();
                        Log.d(this.getClass().getName(), "여행 고수들의 추천 일정!");                        break;
                }
            }
        };

        settingBtn.setOnClickListener(clickListener);
        manageReviewBtn.setOnClickListener(clickListener);
        checkedDestBtn.setOnClickListener(clickListener);
        listDestBtn.setOnClickListener(clickListener);
        recommendScheduleBtn.setOnClickListener(clickListener);

        return view;
    }
}