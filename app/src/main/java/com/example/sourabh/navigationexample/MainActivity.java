package com.example.sourabh.navigationexample;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    private String name = "MyTag";
    private EditText edit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edit = (EditText)findViewById(R.id.edit);
    }


    public void Clicked(View view)
    {
        Intent intent = new Intent(this,MainActivity2.class);  //Connecting with another activity via Intents
        intent.putExtra(name,edit.getText().toString());  //Sending data to other Activity
        startActivity(intent);  ////Starting the other activity
    }
}
