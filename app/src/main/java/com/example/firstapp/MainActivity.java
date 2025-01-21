package com.example.firstapp;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    EditText etNum1;
    EditText etNum2;

    Button btnAdd;

    TextView tvResult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        etNum1=findViewById(R.id.etNum1);
        etNum2=findViewById(R.id.etNum2);
        btnAdd=findViewById(R.id.btnAdd);
        tvResult=findViewById(R.id.tvResult);

        btnAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {



               if(validateFields())
               {
                   int num1=Integer.parseInt(etNum1.getText().toString());
                   int num2=Integer.parseInt(etNum2.getText().toString());

                   int result=num1+num2;

                   tvResult.setText(""+result);

               }else{
                   Toast.makeText(MainActivity.this, "Please enter both numbers", Toast.LENGTH_SHORT).show();
               }

            }
        });
    }


    public boolean validateFields()
    {

        ArrayList<Boolean> list=new ArrayList<>();

        if(etNum1.getText().toString()!=null && !etNum1.getText().toString().isEmpty() && !etNum1.getText().toString().isBlank())
        {
            list.add(true);
        }else{
            list.add(false);
        }
        if(etNum2.getText().toString()!=null && !etNum2.getText().toString().isEmpty() && !etNum2.getText().toString().isBlank())
        {
            list.add(true);
        }else{
            list.add(false);
        }
        return !list.contains(false);

    }

    /*@Override
    public void onClick(View v) {

    }*/
}