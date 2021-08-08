package com.nishchay.currencyconverter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    public void convertCurrency(View view) {
        Log.i("info", "button pressed");

        EditText editText = (EditText) findViewById(R.id.editText);

        String amountInRupees = editText.getText().toString();

        double amountInRupeesDouble = Double.parseDouble(amountInRupees);

        double amountInDollarsDouble = amountInRupeesDouble * 0.013;

        //          String amountInDollars = Double.toString(amountInDollarsDouble);

        String amountInDollars = String.format("%.2f", amountInDollarsDouble);  //for two decimal places


        Toast.makeText(this, "Amount in $ is " + amountInDollars, Toast.LENGTH_LONG).show();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}