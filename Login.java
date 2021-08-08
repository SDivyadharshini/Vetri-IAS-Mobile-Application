package com.example.vetri;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class Login extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login);
        Button loginbtn;
        loginbtn = (Button) findViewById(R.id.Login);
        final EditText username, password;
        username = (EditText) findViewById(R.id.username);
        password = (EditText) findViewById(R.id.password);
        final String name = "Divya";
        final String pass = "2509";
        loginbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (username.getText().toString().equals(name)) {
                    if (password.getText().toString().equals(pass)) {
                        Intent intent = new Intent(Login.this, Menu.class);
                        startActivity(intent);
                    } else {
                        Toast.makeText(Login.this, "Invalid Password",
                                Toast.LENGTH_LONG).show();
                    }
                } else {
                    Toast.makeText(Login.this, "Invalid Username",
                            Toast.LENGTH_LONG).show();
                }
            }
        });
        // ATTENTION: This was auto-generated to handle app links.
        Intent appLinkIntent = getIntent();
        String appLinkAction = appLinkIntent.getAction();
        Uri appLinkData = appLinkIntent.getData();
    }}