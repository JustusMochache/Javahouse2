package com.example.newrestaurant;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.Layout;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import butterknife.BindView;
import butterknife.ButterKnife;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
    @BindView (R.id.findRestaurantsButton) Button mFindRestaurantsButton;
    @BindView(R.id.locationEditText) EditText mLocationEditText;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // butterknife binding
        ButterKnife.bind(this);

        // button click listener
        mFindRestaurantsButton.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        String location = mLocationEditText.getText().toString();

        // intent
        Intent intent = new Intent(MainActivity.this, RestaurantsActivity.class);
        intent.putExtra("location", location);

        //Toast
        Toast.makeText(MainActivity.this, "Clicked!", Toast.LENGTH_LONG).show();

        startActivity(intent);
    }
}
