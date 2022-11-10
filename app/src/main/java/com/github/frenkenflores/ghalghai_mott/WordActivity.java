package com.github.frenkenflores.ghalghai_mott;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.EditText;

public class WordActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_word);
        Intent intent = getIntent();
        String value = intent.getStringExtra("word");
        EditText editText = (EditText) findViewById(R.id.edit_text);
        editText.setText(value);
    }
}