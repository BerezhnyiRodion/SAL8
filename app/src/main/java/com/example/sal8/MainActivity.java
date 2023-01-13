package com.example.sal8;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView TvHello = (TextView) findViewById(R.id.tvHello);
        TvHello.setText("It's new text");

        Button BtnHello = (Button) findViewById(R.id.btnHello);
        BtnHello.setText("New Text");
        BtnHello.setEnabled(false);

        CheckBox cbHello = (CheckBox) findViewById(R.id.cb_hello);
        cbHello.setChecked(true);
    }
}