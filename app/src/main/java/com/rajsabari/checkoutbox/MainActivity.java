package com.rajsabari.checkoutbox;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        CheckBox chapathi=findViewById(R.id.chapathi);
        CheckBox dosai=findViewById(R.id.dosai);
        CheckBox vadai=findViewById(R.id.vadai);
        Button order=findViewById(R.id.order);
        order.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                    int amt=0;
                    StringBuilder result = new StringBuilder();
                    result.append("Selected items: ");
                    if (dosai.isChecked()) {
                        result.append("\n Dosai is: 20 Rs ");
                        amt+=20;
                    }
                    if (chapathi.isChecked()) {
                        result.append("\n chapathi is: 30 Rs ");
                        amt+=30;
                    }
                    if (vadai.isChecked()) {
                        result.append("\n vadai is: 5 Rs ");
                        amt+=5;
                    }

                    if (amt==0) {
                        Toast.makeText(MainActivity.this, "PLESE SELECT THE ITEMS", Toast.LENGTH_LONG).show();
                    } else {
                        result.append("\n Amt: "+amt+"Rs ");
                        Toast.makeText(MainActivity.this, result.toString(), Toast.LENGTH_LONG).show();

                    }
                }
            } );
}}