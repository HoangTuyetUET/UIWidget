package com.example.snowhoang.widgetbutton;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.ImageButton;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.ToggleButton;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // Exercise 1: use image button
        ImageBtnBlue = (ImageButton) findViewById(R.id.imagebtn_blue);
        ImageBtnRed = (ImageButton) findViewById(R.id.imagebtn_red);
        tv1 = (TextView) findViewById(R.id.tv1);
        ImageBtnRed.setOnClickListener(new OnClickColor());
        ImageBtnBlue.setOnClickListener(new OnClickColor());
        // Exercise 2: use radio button
        rbBlue = (RadioButton) findViewById(R.id.rb_blue);
        rbRed = (RadioButton) findViewById(R.id.rb_red);
        rbYellow = (RadioButton) findViewById(R.id.rb_yellow);
        tv2 =(TextView) findViewById(R.id.tv2);
        rbYellow.setOnClickListener(new OnClickColor());
        rbRed.setOnClickListener(new OnClickColor());
        rbBlue.setOnClickListener(new OnClickColor());
        // Exercise 3: use toggle button
        tbBlue = (ToggleButton) findViewById(R.id.tb_blue);
        tbRed = (ToggleButton) findViewById(R.id.tb_red);
        tbYellow = (ToggleButton)  findViewById(R.id.tb_yellow);
        tv3 = (TextView) findViewById(R.id.tv3);
        tbRed.setOnCheckedChangeListener(new ClickToggleButton());
        tbBlue.setOnCheckedChangeListener(new ClickToggleButton());
        tbYellow.setOnCheckedChangeListener(new ClickToggleButton());
        // Exercise 4: use radio button
        rbBlue1 = (RadioButton) findViewById(R.id.rb_blue1);
        rbRed1 = (RadioButton) findViewById(R.id.rb_red1);
        rbYellow1 = (RadioButton) findViewById(R.id.rb_yellow1);
        btnColor = (Button) findViewById(R.id.btn_color);
        radioGroup1 = (RadioGroup) findViewById(R.id.radio_group1);
        tv4 =(TextView) findViewById(R.id.tv4);
        btnColor.setOnClickListener( new OnClickColor());


    }
    private class OnClickColor implements View.OnClickListener{
        @Override
        public void onClick(View v){
            switch (v.getId()){
                //Exercise 1
                case R.id.imagebtn_red:
                    tv1.setBackgroundColor(Color.RED);
                    break;
                case R.id.imagebtn_blue:
                    tv1.setBackgroundColor(Color.BLUE);
                    break;
                //Exercise 2
                case R.id.rb_blue:
                    tv2.setBackgroundColor(Color.BLUE);
                    break;
                case R.id.rb_red:
                    tv2.setBackgroundColor(Color.RED);
                    break;
                case R.id.rb_yellow:
                    tv2.setBackgroundColor(Color.YELLOW);
                    break;
                //Exercise 4
                case R.id.btn_color:
                    int selectedId=radioGroup1.getCheckedRadioButtonId();
                    RadioButton radioButton=(RadioButton) findViewById(selectedId);
                    if(radioButton == rbRed1){
                        tv4.setBackgroundColor(Color.RED);
                    }else
                    if(radioButton == rbYellow1){
                        tv4.setBackgroundColor(Color.YELLOW);
                    }else
                    if(radioButton == rbBlue1){
                        tv4.setBackgroundColor(Color.BLUE);
                    }
                    break;
            }
        }
    }

    /**
     * Exercise 3 : oncheckchanged
     */
    private class ClickToggleButton implements CompoundButton.OnCheckedChangeListener {
        @Override
        public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
            if (isChecked) {
                if(buttonView == tbRed){
                    tbBlue.setChecked(false);
                    tbYellow.setChecked(false);
                    tv3.setBackgroundColor(Color.RED);
                }
                if(buttonView == tbBlue){
                    tbRed.setChecked(false);
                    tbYellow.setChecked(false);
                    tv3.setBackgroundColor(Color.BLUE);
                }
                if(buttonView == tbYellow){
                    tbBlue.setChecked(false);
                    tbRed.setChecked(false);
                    tv3.setBackgroundColor(Color.YELLOW);
                }
            }
            else tv3.setBackgroundColor(Color.BLACK);

        }
    }
    private ImageButton ImageBtnRed, ImageBtnBlue;
    private RadioButton rbRed, rbBlue, rbYellow, rbRed1, rbBlue1, rbYellow1;;
    private ToggleButton tbRed, tbBlue, tbYellow;
    private Button btnColor;
    private RadioGroup radioGroup1;
    private TextView tv1,tv2,tv3,tv4;
}
