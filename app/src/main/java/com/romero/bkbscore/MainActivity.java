package com.romero.bkbscore;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {


    private TextView equiA;
    private TextView equiB;
    private int puntosA;
    private int puntosB;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        puntosA=0;
        puntosB=0;
        equiA=findViewById(R.id.puntaA);
        equiB=findViewById(R.id.puntaB);

    }

    public void sumarA(View view){
        if (R.id.unoA == view.getId()){
            puntosA++;
            equiA.setText(puntosA+"");
        }else {if (R.id.dosA==view.getId()){
            puntosA=puntosA+2;
            equiA.setText(puntosA+"");
        }else {if (R.id.tresA==view.getId()){
            puntosA=puntosA+3;
            equiA.setText(puntosA+"");
        }
    }}}

    public void sumarB(View view){
        if (R.id.unoB == view.getId()){
            puntosB++;
            equiB.setText(puntosB+"");
        }else {if (R.id.dosB==view.getId()){
            puntosB=puntosB+2;
            equiB.setText(puntosB+"");
        }else {if (R.id.tresB==view.getId()){
            puntosB=puntosB+3;
            equiB.setText(puntosB+"");
        }
        }}}

    public void reset(View view){
        equiA.setText(0+"");
        equiB.setText(0+"");
        puntosA=0;
        puntosB=0;
    }
}
 // R.id.<>id==v.getId()