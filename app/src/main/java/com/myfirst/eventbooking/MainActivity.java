package com.myfirst.eventbooking;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    private EditText mEtOne,mEtTwo,mEtThree,mEtFour;
    private Button mBtOne;
    private static final String KEY_1 = "key1";
    private static final String KEY_2 = "key2";
    private static final String KEY_3 = "key3";
    private static final String KEY_4 = "key4";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        findId();
        mBtOne.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,EnterSeatAndDate.class);
                PreferenceHelper.writeStringToPreference(MainActivity.this,KEY_1,mEtOne.getText().toString());
                PreferenceHelper.writeStringToPreference(MainActivity.this,KEY_2,mEtTwo.getText().toString());
                PreferenceHelper.writeStringToPreference(MainActivity.this,KEY_3,mEtThree.getText().toString());
                PreferenceHelper.writeStringToPreference(MainActivity.this,KEY_4,mEtFour.getText().toString());
                startActivity(intent);
            }
        });
    }
    private void findId(){
        mEtOne = findViewById(R.id.etOne);
        mEtTwo = findViewById(R.id.etTwo);
        mEtThree = findViewById(R.id.etThree);
        mEtFour = findViewById(R.id.etFour);
        mBtOne = findViewById(R.id.btOne);
    }
}