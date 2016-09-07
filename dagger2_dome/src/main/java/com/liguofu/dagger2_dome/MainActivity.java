package com.liguofu.dagger2_dome;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import javax.inject.Inject;

public class MainActivity extends AppCompatActivity {

    @Inject
   Person person;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        PersonComponent per = DaggerPersonComponent.create();
        per.bind(this);
        String str = person.getName();
        Log.i("tag", "onCreate: ....."+str);
    }
}
