package com.design.lecture7;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.app.TimePickerDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    protected void showDialog(View view){

        AlertDialog.Builder alertBuilder=new AlertDialog.Builder(this);
        alertBuilder.setTitle("Greshka");
        alertBuilder.setMessage("Message");
        alertBuilder.setPositiveButton("OK", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {

            }
        });
        alertBuilder.show();
    }
    protected void onShowDatePicker(View view){
        DatePickerFragment datePickerFragment=new DatePickerFragment();
        datePickerFragment.show(getSupportFragmentManager(),"DateDialog");
    }
    protected  void onShowTimePicker(View view){
        TimePickerFragment timePickerDialog=new TimePickerFragment();
        timePickerDialog.show(getSupportFragmentManager(),"TimeDialog");

    }
    protected void onClickTabLayout(View view){
        Intent i=new Intent(this,TabLayoutActivity.class);
        startActivity(i);
    }
}
