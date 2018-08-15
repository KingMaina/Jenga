package com.example.user.jenga;

import android.app.ProgressDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class chimba extends AppCompatActivity implements View.OnClickListener{
    Button button;
    EditText editText;
    TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chimba);
        editText = (EditText) findViewById(R.id.editText);
        textView = (TextView) findViewById(R.id.textView35);
        button = (Button) findViewById(R.id.button7);
        button.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        int num2 = (int) Double.parseDouble(editText.getText().toString());
/*//      calculations
        if (num2.isEmpty()) {
            Toast.makeText(this, "Fill in all slots", Toast.LENGTH_SHORT).show();
            }
        } else {
        switch (view.getId()) {
            case R.id.button7:
                int result2 = num2 * 1250;
                textView.setText(String.valueOf(result2));
                break;
            default:
                Toast.makeText(this, "Enter valid values", Toast.LENGTH_SHORT).show();
                break;
        }*/
    }
    public void onPointerCaptureChanged
            (boolean hasCapture) {
    }
}
