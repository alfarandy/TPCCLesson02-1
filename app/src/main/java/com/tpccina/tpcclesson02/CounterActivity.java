package com.tpccina.tpcclesson02;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class CounterActivity extends AppCompatActivity {

    private static final String LOG_TAG = CounterActivity.class.getSimpleName();
    private int number;
    private TextView counterNumber;
    private Button plus;
    private Button minus;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_counter);
        counterNumber = (TextView) findViewById(R.id.counter_number);
        plus = (Button) findViewById(R.id.plus);
        minus = (Button) findViewById(R.id.minus);

//        String numberString = (String) counterNumber.getText();
        number = Integer.parseInt(String.valueOf(counterNumber.getText()));

        Log.v(LOG_TAG, "Angka sekarang nilainya : " + number);
        Toast.makeText(this,"Angka sekarang nilainya : " + number, Toast.LENGTH_LONG).show();

        plus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                number++;
                counterNumber.setText(""+ number);
            }
        });

        minus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                number--;
                counterNumber.setText(""+number);
            }
        });
    }


    /*public void increment(View view) {<!--android:onClick="increment"-->
        try {
            number++;
            counterNumber.setText(""+ number);
        } catch (Exception e) {
            Log.e(LOG_TAG, "Error ", e);
        }
    }

    public void decrement(View view) { android:onClick="decrement"
        try {
            number--;
            counterNumber.setText(""+number);
        } catch (Exception e) {
            Log.e(LOG_TAG, "Error ", e);
        }
    }*/
}
