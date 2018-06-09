package com.example.kamal.senddata;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        TextView textView = (TextView) findViewById(R.id.textViewData);
        textView.setText(getIntent().getStringExtra(Intent.EXTRA_TEXT));
    }

    public void onClickClose(View view) {
        finish();
    }
}
