package com.example.p66na.currencyconverter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.text.DecimalFormat;
import java.util.Formatter;

public class MainActivity extends AppCompatActivity {

    Button usd,eur,gbp,aud,cad,cny,jpy,sgd,myr;
    TextView textView;
    EditText editText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        usd=findViewById(R.id.usdollar);
        eur=findViewById(R.id.euro);
        gbp=findViewById(R.id.pound);
        aud=findViewById(R.id.audollar);
        cad=findViewById(R.id.candollar);
        cny=findViewById(R.id.yen);
        jpy=findViewById(R.id.yemen);
        myr=findViewById(R.id.ringgit);
        sgd=findViewById(R.id.sgdollar);
        textView=findViewById(R.id.textView);
        editText=findViewById(R.id.editText);

        usd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String z=editText.getText().toString();
                if(TextUtils.isEmpty(z)){
                    editText.setError("Empty user input");
                } else {
                    double n,k;
                    n=Double.parseDouble(z);
                    textView.setText(null);
                    Formatter formatter=new Formatter();

                    k=n*0.12;
                    DecimalFormat decimalFormat= new DecimalFormat("#.00");
                    textView.setText("" + decimalFormat.format(k));
                }
            }
        });
    }
}
