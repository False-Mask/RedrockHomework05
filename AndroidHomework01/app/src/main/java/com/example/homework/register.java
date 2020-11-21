package com.example.homework;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.Editable;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class register extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
        Button rbutton1=findViewById(R.id.button11);
        EditText reditText1=findViewById(R.id.user11);
        EditText reditText2=findViewById(R.id.password11);
        EditText reditText3=findViewById(R.id.password22);

        rbutton1.setOnClickListener(new View.OnClickListener() {//实现注册 数据录入
            @Override
            public void onClick(View v) {
                if (reditText3.getText().toString().equals(reditText2.getText().toString())){
                Date.username.add(reditText1.getText().toString());
                Date.password.add(reditText2.getText().toString());
                Toast.makeText(register.this,"恭喜您完成注册",Toast.LENGTH_SHORT).show();
                }else{
                    Toast.makeText(register.this,"两次密码不相同",Toast.LENGTH_SHORT).show();;
                }
            }
        });

        Button rbutton2=findViewById(R.id.button12);
        rbutton2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }
}