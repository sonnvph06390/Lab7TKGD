package com.example.son.lab7;

import android.support.design.widget.TextInputLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.text.InputType;
import android.text.TextWatcher;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Bai2 extends AppCompatActivity {
    Button  btnLogin;
    EditText edtName;
    EditText edtEmail;
    EditText edtPassword;
    TextInputLayout tilName;
    TextInputLayout tilEmail;
    TextInputLayout tilPassword;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bai2);
        btnLogin=findViewById(R.id.btnLogin);
        edtName=findViewById(R.id.edtName);
        edtEmail=findViewById(R.id.edtEmail);
        edtPassword=findViewById(R.id.edtPassword);
        tilName=findViewById(R.id.tilName);
        tilEmail=findViewById(R.id.tilEmail);
        tilPassword=findViewById(R.id.tilPassword);
        final String email = edtEmail.getText().toString().trim();
        final String emailPattern = "^[_A-Za-z0-9-]+(\\.[_A-Za-z0-9-]+)*@[A-Za-z0-9]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$";
        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (edtName.getText().toString().equals("")){
                    tilName.setError("Ten khong duoc de trong");
                }else if (edtName.getText().toString().length()>=0){
                    tilName.setError("");
                }
//                edtEmail.setInputType(InputType.TYPE_CLASS_TEXT|InputType.TYPE_TEXT_VARIATION_EMAIL_ADDRESS);
                if (edtPassword.getText().toString().length()<6){
                    tilPassword.setError("Password phai dai hon 6 ky tu");
                }else if (edtPassword.getText().toString().length()>=6){
                    tilPassword.setError("");
                }
                if (email!=emailPattern){
                    tilEmail.setError("email k hop le");
                }else if (email==emailPattern){
                    tilEmail.setError("");
                }

            }
        });
    }
}
