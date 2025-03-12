package com.example.quiztester;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class LoginActivity extends AppCompatActivity {
    private Button btn_enter, btn_register;
    EditText et_email, et_password;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_login);
        btn_enter=findViewById(R.id.btn_enter);
        btn_register=findViewById(R.id.btn_register);
        et_email=findViewById(R.id.et_email);
        et_password=findViewById(R.id.et_password);

        btn_register.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent registretionIntent = new Intent(LoginActivity.this, RegistrationActivity.class);
                startActivity(registretionIntent);
            }
        });
        btn_enter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(TextUtils.isEmpty(et_email.getText())){
                    et_email.setError("Please do not leave it empty");
                    return;
                }
                if(TextUtils.isEmpty(et_password.getText())){
                    et_password.setError("Please do not leave it empty");
                    return;
                }
                if(et_email.toString().equals("user@gmail.com")&&et_password.toString().equals("123")) {

                    Intent registretionIntent = new Intent(LoginActivity.this, MainActivity.class);
                    startActivity(registretionIntent);
                }
                else {
                    Toast.makeText(LoginActivity.this, "Wrong password or login", Toast.LENGTH_LONG);
                }
            }

        });
    }
}