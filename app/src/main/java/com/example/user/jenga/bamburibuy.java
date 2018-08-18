package com.example.user.jenga;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import static com.example.user.jenga.R.id.editText5;

public class bamburibuy extends AppCompatActivity implements View .OnClickListener{
    EditText editText;
    TextView mCalculate;
    Button mCheck,mPurchase;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bamburibuy);
//        find by id
        editText = findViewById(editText5);
        mCalculate = findViewById(R.id.textView21);
        mCheck = findViewById(R.id.button3);
        mPurchase  = findViewById(R.id.button2);
//       set onclick
        mCheck.setOnClickListener(this);
        editText.addTextChangedListener(check);

        mPurchase.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent simToolKitLaunchIntent = getPackageManager().getLaunchIntentForPackage("com.android.stk");
                if(simToolKitLaunchIntent != null) {
                    startActivity(simToolKitLaunchIntent);
                }
            }
        });
    }
    private TextWatcher check = new TextWatcher() {
        @Override
        public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

        }
        @Override
        public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
            String numberInput = String.valueOf(editText.getText());
            mCheck.setEnabled(!numberInput.isEmpty());
            mPurchase.setEnabled(!numberInput.isEmpty());

        }

        @Override
        public void afterTextChanged(Editable editable) {

        }
    };

    @Override
    public void onClick(View view) {
        int num1 = (int) Double.parseDouble(editText.getText().toString());
//      calculations
        switch (view.getId()){
            case R.id.button3:
                int result = num1*750;
                mCalculate.setText(String.valueOf(result));
                break;
            default:
                Toast.makeText(this, "Enter valid values", Toast.LENGTH_SHORT).show();
                break;
        }
    }
    public void onPointerCaptureChanged
            (boolean hasCapture) {

    }
}
