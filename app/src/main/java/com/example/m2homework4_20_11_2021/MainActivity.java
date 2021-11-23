package com.example.m2homework4_20_11_2021;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.content.Intent;
import android.view.View;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity{

    private Button b1;
    private EditText ed1,ed2;
    private TextView tx1, tx2, tx3, tx4, tx5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        b1 = (Button)findViewById(R.id.button);
        ed1 = (EditText)findViewById(R.id.editTextTextEmailAddress);
        ed2 = (EditText)findViewById(R.id.editTextTextPassword);
        tx1 = (TextView)findViewById(R.id.textView);
        tx2 = (TextView)findViewById(R.id.textView2);
        tx3 = (TextView)findViewById(R.id.textView3);
        tx4 = (TextView)findViewById(R.id.textView4);
        tx5 = (TextView)findViewById(R.id.textView5);
        //tx1.setVisibility(View.GONE);

        setEditText(ed1);
        setEditText(ed2);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(ed1.getText().toString().equals("admin@gmail.com") && ed2.getText().toString().equals("admin")) {
                    Toast.makeText(getApplicationContext(), "Подключение...",Toast.LENGTH_SHORT).show();
                   // tx1.setVisibility(View.GONE);
                    tx1.setVisibility(View.GONE);
                    tx3.setVisibility(View.GONE);
                    tx4.setVisibility(View.GONE);
                    tx5.setVisibility(View.GONE);
                    b1.setVisibility(View.GONE);
                    ed1.setVisibility(View.GONE);
                    ed2.setVisibility(View.GONE);
                }else{
                    Toast.makeText(getApplicationContext(), "Ошибка, неправильный логин или пароль",Toast.LENGTH_SHORT).show();
                   // tx1.setVisibility(View.VISIBLE);
                    }
                }
        });
    }
    private void setEditText(EditText editText) {
        editText.addTextChangedListener(new TextWatcher(){

            @Override
            public void afterTextChanged(Editable s) {
                // Прописываем то, что надо выполнить после изменения текста
                if (ed1.getText().toString().equals("")||ed2.getText().toString().equals("")) b1.setBackgroundColor(Color.parseColor("#828282"));
                else b1.setBackgroundColor(Color.parseColor("#905602"));
            }

            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {
            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
            }
        });
    }
}