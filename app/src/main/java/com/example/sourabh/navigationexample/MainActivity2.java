package com.example.sourabh.navigationexample;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

public class MainActivity2 extends AppCompatActivity {
    private String name = "MyTag";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        String string = getIntent().getExtras().getString(name);  //Getting extra data
        Toast.makeText(MainActivity2.this,"You have typed: " + string,Toast.LENGTH_SHORT).show();
    }
}
