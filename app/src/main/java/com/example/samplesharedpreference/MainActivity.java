package com.example.samplesharedpreference;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    UserSetting userSet;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        userSet = new UserSetting(this);

        Toast.makeText(this, "email : " + userSet.getSharePrefEmail() + " , User :" + userSet.getSharedPrefUser(), Toast.LENGTH_SHORT).show();

    }

}