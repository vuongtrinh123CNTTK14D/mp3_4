package com.example.mp3_2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Main3Activity extends AppCompatActivity {


    Button btnaaa;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        anhxa();

        btnaaa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent mh3=new Intent(Main3Activity.this,MainActivity.class);
                startActivity(mh3);
            }
        });
    }

    private void anhxa()
    {
        btnaaa=(Button)findViewById(R.id.btnaaa);
    }
}
