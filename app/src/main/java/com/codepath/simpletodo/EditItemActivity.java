package com.codepath.simpletodo;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;

public class EditItemActivity extends AppCompatActivity {
    int pos1 = 2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_edit_item);
        EditText editText1 = (EditText) findViewById(R.id.editText);
        String item1 = getIntent().getStringExtra("edit text");
        pos1 = getIntent().getIntExtra("pos", 1);
        editText1.setText("");
        editText1.append(item1);
    }


    public void onSubmit(View v) {

        EditText etName = (EditText) findViewById(R.id.editText);
        Intent data = new Intent();
        data.putExtra("new edit", etName.getText().toString());
        data.putExtra("pos", pos1);
        setResult(RESULT_OK, data);
        finish();
    }
}
