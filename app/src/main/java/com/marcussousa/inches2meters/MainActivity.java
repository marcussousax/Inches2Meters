package com.marcussousa.inches2meters;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import java.math.RoundingMode;
import java.text.DecimalFormat;

public class MainActivity extends AppCompatActivity {

    // Class variables also are know as Fields
    private EditText inchesEditText;
    private Button calculateButton;
    private TextView resultTextView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        findViews();
        setupButtonClickListener();
    }

    private void setupButtonClickListener() {
        calculateButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double conversionResult = convertToMeters();
                displayResult(conversionResult);

            }
        });
    }

    private void findViews() {
        inchesEditText = findViewById(R.id.edit_view_inches);
        calculateButton = findViewById(R.id.button_calculate);
        resultTextView = findViewById(R.id.text_view_result);
    }

    protected void displayResult(Double value) {
        DecimalFormat myDecimalFormatter = new DecimalFormat("0.0000");
        myDecimalFormatter.setRoundingMode(RoundingMode.HALF_UP);
        String inchesTextResult = myDecimalFormatter.format(value);

        String fullResultString = "The result conversion is " + inchesTextResult;
        resultTextView.setText(fullResultString);
    }

    protected double convertToMeters() {

        String inchesText = inchesEditText.getText().toString();

        int inches = Integer.parseInt(inchesText);

        return inches * 0.0254;
    }
}