package com.example.priceanddiscountapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText num1;
    EditText num2;
    EditText num3;
    TextView res2;
    TextView res;
    Button add;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        num1 =findViewById(R.id.num1);
        num2= findViewById(R.id.num2);
        num3= findViewById(R.id.num3);
        add= findViewById(R.id.btn);
        res2=findViewById(R.id.total);
        res =findViewById(R.id.dis);

       add.setOnClickListener(view -> {
//           int a= Integer.parseInt(num1.getText().toString());
//           int i=1,fact=1;
//           while (i<=a)
//                   {
//                       fact=fact*i;
//                       i++;
//                   }
//           res2.setText(" Facrorial :" + fact);
           int m= Integer.parseInt(num2.getText().toString());
           int g= Integer.parseInt(num3.getText().toString());
           int a= Integer.parseInt(num1.getText().toString());
           int apple=150,mango=200,graps=300;
           int  pa=apple*a;
           int  pm=mango*m;
           int pg=graps*g;
           int total=pa+pm+pg;

           if(total>1000 && total<2000) {
               res2.setText(" Total :" + total);
               int dis=total*10/100;
               res.setText("Discount:" + dis);
           }
           else if(total >2000 && total<5000)
           {
               res2.setText(" Total :" + total);
               int dis=total*20/100;
               res.setText("Discount:" + dis);

           }
           else
           {
               res2.setText(" Total :" + total);

               res.setText("No Discount");

           }



       });
    }
}