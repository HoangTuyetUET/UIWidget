package com.example.snowhoang.widgeteventhanding3;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void onClickHello (View v){
        Toast tempMessage = Toast.makeText(this, "Hello", Toast.LENGTH_SHORT);
        tempMessage.show();
    }
    public void onClickBye (View v){
        Toast tempMessage = Toast.makeText(this, "Good Bye", Toast.LENGTH_SHORT);
        tempMessage.show();
    }
}
