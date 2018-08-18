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

import org.w3c.dom.Text;

public class trianglebuy extends AppCompatActivity implements View.OnClickListener{
    EditText editText;
    Button button,pay;
    TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_trianglebuy);

        editText = findViewById(R.id.editText3);
        textView = findViewById(R.id.textView28);
        button = findViewById(R.id.button6);
        pay = findViewById(R.id.button5);

        button.setOnClickListener(this);

        editText.addTextChangedListener(check);


    }
    private TextWatcher check = new TextWatcher() {
        @Override
        public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

        }

        @Override
        public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
            String numberInput = String.valueOf(editText.getText());
            button.setEnabled(!numberInput.isEmpty());
            pay.setEnabled(!numberInput.isEmpty());
        }

        @Override
        public void afterTextChanged(Editable editable) {

        }
    };
    @Override
    public void onClick(View view) {
        int num2 = (int) Double.parseDouble(editText.getText().toString());
//      calculations
        switch (view.getId()){
            case R.id.button6:
                int result2 = num2*750;
                textView.setText(String.valueOf(result2));
                break;
            default:
                Toast.makeText(this, "Enter valid values", Toast.LENGTH_SHORT).show();
                break;
        }
        pay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent simToolKitLaunchIntent = getPackageManager().getLaunchIntentForPackage("com.android.stk");
                if(simToolKitLaunchIntent != null) {
                    startActivity(simToolKitLaunchIntent);
                }
            }
        });
    }
    public void onPointerCaptureChanged
            (boolean hasCapture) {
    }
}
