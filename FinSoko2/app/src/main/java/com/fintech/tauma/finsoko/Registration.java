package com.fintech.tauma.finsoko;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AutoCompleteTextView;
import android.widget.Button;
import android.widget.EditText;



public class Registration extends AppCompatActivity {
Button btn;
EditText fname;

    AutoCompleteTextView natid,phone,email,pass,confpass;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registration);

        natid=(AutoCompleteTextView)findViewById(R.id.natid);
        fname=(EditText)findViewById(R.id.fname);
        phone=(AutoCompleteTextView)findViewById(R.id.phone);
        email=(AutoCompleteTextView)findViewById(R.id.email);
        pass=(AutoCompleteTextView)findViewById(R.id.password);
        confpass=(AutoCompleteTextView)findViewById(R.id.confpass);

        natid.setHint(" Enter National Id   ");
        fname.setHint("  Enter Full Name ");
        phone.setHint(" Enter Your Telephone   ");
        email.setHint("  Enter Email Address ");
        pass.setHint(" Enter your Password  ");
        confpass.setHint("  Confirm Password ");

        natid.setOnFocusChangeListener(new View.OnFocusChangeListener() {
            public void onFocusChange(View v, boolean hasFocus) {
                if (hasFocus)
                    natid.setHint("");
                else
                    natid.setHint("Enter National Id");
            }
        });

        fname.setOnFocusChangeListener(new View.OnFocusChangeListener() {
            public void onFocusChange(View v, boolean hasFocus) {
                if (hasFocus)
                    fname.setHint("");
                else
                    fname.setHint("Enter Full Name");
            }
        });

        phone.setOnFocusChangeListener(new View.OnFocusChangeListener() {
            public void onFocusChange(View v, boolean hasFocus) {
                if (hasFocus)
                    phone.setHint("");
                else
                    phone.setHint("Enter Your Telephone");
            }
        });
        email.setOnFocusChangeListener(new View.OnFocusChangeListener() {
            public void onFocusChange(View v, boolean hasFocus) {
                if (hasFocus)
                    email.setHint("");
                else
                    email.setHint(" Enter Email Address ");
            }
        });
        pass.setOnFocusChangeListener(new View.OnFocusChangeListener() {
            public void onFocusChange(View v, boolean hasFocus) {
                if (hasFocus)
                    pass.setHint("");
                else
                    pass.setHint("Enter Your Password ");
            }
        });

        confpass.setOnFocusChangeListener(new View.OnFocusChangeListener() {
            public void onFocusChange(View v, boolean hasFocus) {
                if (hasFocus)
                    confpass.setHint("");
                else
                    confpass.setHint(" Confirm Password ");
            }
        });
    }
}
