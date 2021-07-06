package com.myfirst.eventbooking;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class EnterSeatAndDate extends AppCompatActivity {

    private TextView mTvOne,mTvTwo,mTvThree,mTvFour;
    private EditText mEtOne,mEtTwo;
    private Button mBtOne;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_enter_seat_and_date);
        findId();
        mTvOne.setText(PreferenceHelper.getStringFromPreference(EnterSeatAndDate.this, "key1"));
        mTvTwo.setText(PreferenceHelper.getStringFromPreference(EnterSeatAndDate.this, "key2"));
        mTvThree.setText(PreferenceHelper.getStringFromPreference(EnterSeatAndDate.this, "key3"));
        mTvFour.setText(PreferenceHelper.getStringFromPreference(EnterSeatAndDate.this, "key4"));
        mBtOne.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(EnterSeatAndDate.this, ConfirmSeat.class);
                PreferenceHelper.writeStringToPreference(EnterSeatAndDate.this, "key5", mEtOne.getText().toString());
                PreferenceHelper.writeStringToPreference(EnterSeatAndDate.this, "key6", mEtTwo.getText().toString());
                startActivity(intent);
            }
        });
    }
    private void findId(){
        mTvOne = findViewById(R.id.etOne);
        mTvTwo = findViewById(R.id.etTwo);
        mTvThree = findViewById(R.id.etThree);
        mTvFour = findViewById(R.id.etFour);
        mEtOne = findViewById(R.id.etFive);
        mEtTwo = findViewById(R.id.etSix);
        mBtOne = findViewById(R.id.btOne);
    }
}