package com.example.user.jenga;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class bamburibuy extends AppCompatActivity implements View .OnClickListener{
    EditText editText;
    TextView mCalculate;
    Button mCheck;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bamburibuy);
//        find by id
        editText = (EditText) findViewById(R.id.editText5);
        mCalculate = (TextView) findViewById(R.id.textView21);
        mCheck = (Button) findViewById(R.id.button3);
//       set onclick
        mCheck.setOnClickListener(this);
    }

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
