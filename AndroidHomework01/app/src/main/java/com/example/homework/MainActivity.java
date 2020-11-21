package com.example.homework;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        EditText editText1=findViewById(R.id.load1);
        EditText editText2=findViewById(R.id.password);
        Button button1=findViewById(R.id.button1);

        button1.setOnClickListener(new View.OnClickListener() {//监控登陆按钮的点击情况
            @Override
            public void onClick(View v) {
                if (Date.judge(editText1.getText().toString(), editText2.getText().toString())) {
                Intent intent=new Intent(MainActivity.this,AppActivity.class);
                startActivity(intent);
                } else {
                    Toast.makeText(MainActivity.this,"您输入的用户名，密码不存在或错误",Toast.LENGTH_SHORT).show();;
                }
            }
        });

        Button button2=findViewById(R.id.buttona2);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this,"正在进入注册界面",Toast.LENGTH_SHORT).show();
                Intent intent1=new Intent(MainActivity.this,register.class);
                startActivity(intent1);
            }
        });



    }
}