package com.myfirst.eventbooking;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class ConfirmSeat extends AppCompatActivity {

    private TextView mTvOne,mTvTwo,mTvThree,mTvFour,mTvFive,mTvSix;
    private Button mBtOne;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_confirm_seat);
        findId();
        mTvOne.setText(PreferenceHelper.getStringFromPreference(ConfirmSeat.this, "key1"));
        mTvTwo.setText(PreferenceHelper.getStringFromPreference(ConfirmSeat.this, "key2"));
        mTvThree.setText(PreferenceHelper.getStringFromPreference(ConfirmSeat.this, "key3"));
        mTvFour.setText(PreferenceHelper.getStringFromPreference(ConfirmSeat.this, "key4"));
        mTvFive.setText(PreferenceHelper.getStringFromPreference(ConfirmSeat.this, "key5"));
        mTvSix.setText(PreferenceHelper.getStringFromPreference(ConfirmSeat.this, "key6"));
        mBtOne.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                new AlertDialog.Builder(ConfirmSeat.this)
                        .setTitle("Event is confirmed on this date")
                        .setMessage(mTvSix.getText().toString())
                        .show();
            }
        });
    }
    private void findId(){
        mTvOne = findViewById(R.id.etOne);
        mTvTwo = findViewById(R.id.etTwo);
        mTvThree = findViewById(R.id.etThree);
        mTvFour = findViewById(R.id.etFour);
        mTvFive = findViewById(R.id.etFive);
        mTvSix = findViewById(R.id.etSix);
        mBtOne = findViewById(R.id.btOne);
    }
}
