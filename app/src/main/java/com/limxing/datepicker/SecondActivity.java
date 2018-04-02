package com.limxing.datepicker;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

import com.limxing.datepicker.DatePicker.DatePickerView;
import com.limxing.datepicker.DatePicker.DatePickerView2;

/**
 * Created by xiong on 2018/4/2.
 */

public class SecondActivity extends AppCompatActivity {

    private TextView text;


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        text = (TextView) findViewById(R.id.text);
    }

    public void click(View view){
        DatePickerView2 pickerView=new DatePickerView2(SecondActivity.this, new DatePickerView2.DatePickerListener() {
            @Override
            public void dateChange(String string) {
                text.setText(string);
            }

            @Override
            public void finish(String string) {
                text.setText(string);

            }
        });
        pickerView.setFromYearAndToYear(1900,2016);
        pickerView.initDate(2016,3,9);
        pickerView.show();
    }
}
