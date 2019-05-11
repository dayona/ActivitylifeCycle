package com.example.activitylifecycleex;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MessageActivity extends AppCompatActivity {
    EditText EvText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
    }

    public void send_message(View view) {
        EvText=findViewById(R.id.edittext2);
        String Message=EvText.getText().toString();
        Intent intent = new Intent();
        intent.putExtra("Message",Message);
        setResult(RESULT_OK,intent);
        finish();

    }
}
