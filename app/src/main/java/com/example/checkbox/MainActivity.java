package com.example.checkbox;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        System.out.println("onCreate in()...");
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final CheckBox checkBox = (CheckBox) findViewById(R.id.check1);
        Button button = (Button) findViewById(R.id.button1);
        button.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(View v) {
                //!< 체크박스 상태
                if (checkBox.isChecked()) {
                    System.out.println("체크 됨");
                } else {
                    System.out.println("체크 안됨");
                }
            }
        });


        //!< 체크박스 클릭
        checkBox.setOnClickListener(new CheckBox.OnClickListener() {
            @Override
            public void onClick(View v) {
                System.out.println("Check ");
            }

        });




    }


}
