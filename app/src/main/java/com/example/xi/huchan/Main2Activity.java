package com.example.xi.huchan;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import static android.R.attr.name;


public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        Button button2=(Button)findViewById(R.id.gofirst);
        final EditText text2 = (EditText) findViewById(R.id.SecondText);
        Intent intent=getIntent();
        String name=intent.getStringExtra("zhangxi");
        Toast.makeText(this,name,Toast.LENGTH_LONG).show();





        button2.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent intent=getIntent();
                String name=intent.getStringExtra("zhangxi");
                            intent.putExtra("result",text2.getText().toString()+name);








                    setResult(0,intent);
                    finish();
                }


        });


    }

}
