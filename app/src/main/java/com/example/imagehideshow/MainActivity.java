package com.example.imagehideshow;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Switch;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Switch shwHide;
    RadioGroup radioGroup;
    CheckBox shwImgBtn;
    ImageButton imageBtn;
    ImageView imageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        shwHide = findViewById(R.id.showHideSwitch);
        radioGroup = findViewById(R.id.radioGroup);
        shwImgBtn = findViewById(R.id.showImgBtn);
        imageBtn = findViewById(R.id.imgBtn);
        imageView = findViewById(R.id.imgView);
    }

    protected void backToDefault(View view) {
        imageBtn.setVisibility(View.VISIBLE);
        imageView.setVisibility(View.VISIBLE);
        shwHide.setChecked(true);
        radioGroup.check(R.id.enable);
        shwImgBtn.setClickable(true);
        shwImgBtn.setChecked(true);
    }

    protected void disableEnable(View view) {
        int radioBtnID= radioGroup.getCheckedRadioButtonId();
        switch (radioBtnID){
            case R.id.disable:
                shwImgBtn.setClickable(false);
                break;
            case R.id.enable:
                shwImgBtn.setClickable(true);
                break;
        }
    }

    protected void showHideImgBtn(View view) {
        if(shwImgBtn.isChecked())
            imageBtn.setVisibility(View.VISIBLE);
        else
            imageBtn.setVisibility(View.INVISIBLE);
    }

    public void shwHideImgView(View view) {
        if(shwHide.isChecked())
            imageView.setVisibility(View.VISIBLE);
        else
            imageView.setVisibility(View.INVISIBLE);
    }
}
