package com.example.user.jenga;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class simbabuy extends AppCompatActivity implements View.OnClickListener{
    Button button;
    EditText editText;
    TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_simbabuy);
        editText = (EditText) findViewById(R.id.editText4);
        textView = (TextView) findViewById(R.id.textView27);
        button = (Button) findViewById(R.id.button4);

        button.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {

        int num2 = (int) Double.parseDouble(editText.getText().toString());
//      calculations
        switch (view.getId()){
            case R.id.button4:
                int result2 = num2*750;
                textView.setText(String.valueOf(result2));
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
