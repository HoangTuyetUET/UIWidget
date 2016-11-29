package com.example.snowhoang.widgeteventhandling;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnBye = (Button)findViewById(R.id.btn_bye);
        btnHello = (Button) findViewById(R.id.btn_hello);
        btnBye.setOnClickListener(new MyClick());
        btnHello.setOnClickListener(new MyClick());
    }
    private class MyClick implements View.OnClickListener{
       @Override
       public void onClick(View v){
            switch (v.getId()){
                case R.id.btn_hello:
                    Toast.makeText(MainActivity.this,"Hello",Toast.LENGTH_SHORT).show();
                    break;
                case R.id.btn_bye:
                    Toast.makeText(MainActivity.this,"Good Bye",Toast.LENGTH_SHORT).show();
                    break;
            }
       }
   }
    private Button btnHello;
    private Button btnBye;
}
