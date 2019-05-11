package com.example.activitylifecycleex;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    public static final int messageCode= 1;
    TextView TxtView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        showMessage("Activity Started..");
        TxtView=findViewById(R.id.textView3);
    }
    @Override
    protected void onStart()
    {
        super.onStart();
        showMessage("onStart called...");
    }
    @Override
    protected void onResume(){
        super.onResume();
        showMessage("onResume called...");
    }
    @Override
    protected void onPause(){
        super.onPause();
        showMessage("onPause called...");
    }
    @Override
    protected void onStop(){
        super.onStop();
    }
    @Override
    protected void onDestroy(){
        super.onDestroy();
        showMessage("onDestroy called...");
    }


    public void showMessage(String Message){
        Log.d("message ",Message);

    }

    public void StartAnotherActivity(View view){
        Intent intent= new Intent(this, MessageActivity.class);
        startActivityForResult(intent,messageCode);
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data)
    {
        if(messageCode==requestCode){
            if(resultCode==RESULT_OK){
                String Message = data.getStringExtra("Message");
                TxtView.setText(Message);

            }
        }
    }


}
