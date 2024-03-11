package com.example.reg;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void onBtnClick(View view){
        TextView first = findViewById(R.id.txt1);
        TextView last = findViewById(R.id.txt2);
        TextView email = findViewById(R.id.txt3);

        EditText eFirst = findViewById(R.id.edittxt1);
        EditText eLast = findViewById(R.id.edittxt2);
        EditText eEmail = findViewById(R.id.edittxt3);

        first.setText("First name: " + eFirst.getText().toString());
        last.setText("Last name: " + eLast.getText().toString());
        email.setText("Email: " + eEmail.getText().toString());
    }
}