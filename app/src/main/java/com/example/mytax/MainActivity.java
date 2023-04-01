package com.example.mytax;

import static com.example.mytax.R.id.taxCalcu;
import static com.example.mytax.R.id.taxInfor;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {


    TextView taxCalcu, taxInfor, whatIsTax;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        taxCalcu = findViewById(R.id.taxCalcu);
        taxInfor = findViewById(R.id.taxInfor);
        whatIsTax = findViewById(R.id.whatIsTax);


        //>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>

        Toast.makeText(MainActivity.this, "Welcome Sir/Madam", Toast.LENGTH_SHORT).show();


        taxCalcu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(MainActivity.this, TaxCalcu.class);
                startActivity(intent);

            }
        });
        taxInfor.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(MainActivity.this, WebActivity.class);
                startActivity(intent);
                WebActivity.LoadUrl ="https://nbr.gov.bd/faq/income-tax-faq/ban";

            }
        });
        whatIsTax.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(MainActivity.this, WebActivity.class);
                startActivity(intent);
                WebActivity.LoadUrl ="https://www.homebdinfo.com/2021/12/e-tin-income-tax-tin-certificate.html";

            }
        });






    } // OnCreate Method Close Here ========================


    boolean doubleBackToExitPressedOnce = false;

    @Override
    public void onBackPressed() {
        if (doubleBackToExitPressedOnce) {
            super.onBackPressed();
            return;
        }

        this.doubleBackToExitPressedOnce = true;
        Toast.makeText(this, "Please click BACK again to exit", Toast.LENGTH_SHORT).show();

        new Handler(Looper.getMainLooper()).postDelayed(new Runnable() {

            @Override
            public void run() {
                doubleBackToExitPressedOnce=false;
            }
        }, 2000);
    }




}