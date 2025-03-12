package com.example.quiztester;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class RegistrationActivity extends AppCompatActivity {
    EditText et_name, et_email, et_password;
    Button btn_register;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_registration);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        btn_register=findViewById(R.id.btn_register);
        et_name=findViewById(R.id.et_name);
        et_email=findViewById(R.id.et_email);
        et_password=findViewById(R.id.et_password);

        btn_register.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(TextUtils.isEmpty(et_name.getText())){
                    et_name.setError("Please do not leave it empty");
                    return;
                }
                if(TextUtils.isEmpty(et_email.getText())){
                    et_email.setError("Please do not leave it empty");
                    return;
                }
                if(TextUtils.isEmpty(et_password.getText())){
                    et_password.setError("Please do not leave it empty");
                    return;
                }
                Intent registretionIntent = new Intent(RegistrationActivity.this, LoginActivity.class);

            }
        });
    }
}