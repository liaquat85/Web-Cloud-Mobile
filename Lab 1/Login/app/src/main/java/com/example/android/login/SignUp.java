package com.example.android.login;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class SignUp extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);
    }

    public void backHome(View v) {
        Intent redirect = new Intent(SignUp.this, MainActivity.class);
        startActivity(redirect);
    }

    public void indexPage(View v) {
        Intent redirect = new Intent(SignUp.this, IndexPage.class);
        startActivity(redirect);
    }

}
