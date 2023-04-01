package com.example.mytax;

import static com.example.mytax.R.id.jobIncam;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class TaxCalcu extends AppCompatActivity {

    EditText jobIncam, HomeIncam, agryIncam, BussenessIncam, etcIncame;
    TextView Submit, tvDesply1, tvDesply2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tax_calcu);


        jobIncam = findViewById(R.id.jobIncam);
        HomeIncam = findViewById(R.id.HomeIncam);
        agryIncam = findViewById(R.id.agryIncam);
        BussenessIncam = findViewById(R.id.BussenessIncam);
        etcIncame = findViewById(R.id.etcIncame);

        Submit = findViewById(R.id.Submit);
        tvDesply1 = findViewById(R.id.tvDesply1);
        tvDesply2 = findViewById(R.id.tvDesply2);


        Submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                if (jobIncam.length()>0 || HomeIncam.length()>0 || BussenessIncam.length()>0 || agryIncam.length()>0 || etcIncame.length()>0) {

                    //....................
                    float FjobIncam = 0;
                    float FHomeIncam = 0;
                    float FagryIncam = 0;
                    float FBussenessIncam = 0;
                    float FetcIncame = 0;

                    float Sum =0;

                    //....................
                    if (jobIncam.length()>0){
                        FjobIncam = Float.parseFloat(jobIncam.getText().toString());
                    }
                    if (HomeIncam.length()>0){
                        FHomeIncam = Float.parseFloat(HomeIncam.getText().toString());
                    }
                    if (agryIncam.length()>0){
                        FagryIncam = Float.parseFloat(agryIncam.getText().toString());
                    }
                    if (BussenessIncam.length()>0){
                        FBussenessIncam = Float.parseFloat(BussenessIncam.getText().toString());
                    }
                    if (etcIncame.length()>0){
                        FetcIncame = Float.parseFloat(etcIncame.getText().toString());
                    }


                    //.................
                    Float Total = FjobIncam+FHomeIncam+FagryIncam+FBussenessIncam+FetcIncame;

                    if (Total<=300000){
                        tvDesply1.setText("আপনার টোটাল টাকা হলোঃ "+Total+"ট");
                        tvDesply2.setText("আপনার ট্যাক্স হলোঃ 0.00ট");
                    } else if (Total>300000 && Total<=400000) {
                        Sum = (Total-300000)*5/100;
                        tvDesply1.setText("আপনার টোটাল টাকা হলোঃ "+Total+"ট");
                        tvDesply2.setText("আপনার ট্যাক্স হলোঃ "+Sum+"ট");
                    } else if (Total>400000 && Total<=700000) {
                        Sum = (Total-400000)*10/100+5000;
                        tvDesply1.setText("আপনার টোটাল টাকা হলোঃ "+Total+"ট");
                        tvDesply2.setText("আপনার ট্যাক্স হলোঃ "+Sum+"ট");
                    } else if (Total>700000 && Total<=1100000) {
                        Sum = (Total-700000)*15/100+35000;
                        tvDesply1.setText("আপনার টোটাল টাকা হলোঃ "+Total+"ট");
                        tvDesply2.setText("আপনার ট্যাক্স হলোঃ "+Sum+"ট");
                    } else if (Total>1100000 && Total<=1600000) {
                        Sum = (Total-1100000)*20/100+95000;
                        tvDesply1.setText("আপনার টোটাল টাকা হলোঃ "+Total+"ট");
                        tvDesply2.setText("আপনার ট্যাক্স হলোঃ "+Sum+"ট");
                    } else if (Total>1600000) {
                        Sum = (Total-1600000)*25/100+195000;
                        tvDesply1.setText("আপনার টোটাল টাকা হলোঃ "+Total+"ট");
                        tvDesply2.setText("আপনার ট্যাক্স হলোঃ "+Sum+"ট");
                    }


                }else {
                    tvDesply1.setText("আপনার টোটাল টাকা হলোঃ 0.00ট");
                    tvDesply2.setText("আপনার ট্যাক্স হলোঃ 0.00ট");
                }




            }
        });






    }
}