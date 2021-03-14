package com.example.einzelbeispiel_fui;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    public void main (String[]args) {

        String Matrikelnummer;

        int m1 = 11833964;
        String m2=Integer.toString(m1);
        String charValue= m2.substring(1,2);


        }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}