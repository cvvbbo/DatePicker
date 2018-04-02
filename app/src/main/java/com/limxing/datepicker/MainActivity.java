package com.limxing.datepicker;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;

import com.limxing.datepicker.DatePicker.DatePickerView;
import com.limxing.datepicker.DatePicker.DatePickerView1;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    private TextView text;
    private FrameLayout frameLayout;
    private TextView start_time;
    private TextView end_time;

    private  Boolean ischange=null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        text = (TextView) findViewById(R.id.text);
        frameLayout = (FrameLayout) findViewById(R.id.fl);
        start_time = (TextView) findViewById(R.id.start_time);
        end_time = (TextView) findViewById(R.id.end_time);


        //  一进来就是开始时间
        timeselect(start_time);


        start_time.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                timeselect(start_time);
            }
        });

        end_time.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                timeselect(end_time);
            }
        });

    }

    private void timeselect(final TextView textView) {

        DatePickerView pickerView=new DatePickerView(MainActivity.this, new DatePickerView.DatePickerListener() {
            @Override
            public void dateChange(String string) {
                textView.setText(string);
            }

            @Override
            public void finish(String string) {

            }
        });
        pickerView.setFromYearAndToYear(2008,2016);
        pickerView.initDate(2016,3,9);
        pickerView.show1(frameLayout);
    }

    public void click(View view){

    }

    @Override
    public void onClick(View view) {


    }
}
