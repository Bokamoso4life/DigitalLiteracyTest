package com.example.rampel.digitalliteracytest;

import android.app.ActionBar;
import android.app.Activity;
import android.content.Intent;
import android.graphics.Color;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;


public class LoginAcitivity extends ActionBarActivity {

    private EditText username;
    private EditText password;
    private Button login;
    int numberOfRemainingLoginAttempts = 3;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_acitivity);
        setupVariables();

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_login_acitivity, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    public void register_form(View view) {
        Intent intent = new Intent(getBaseContext(), RegisterFormAcitvity.class);
        startActivity(intent);

    }

    public void main_form(View view) {

        if (username.getText().toString().equals("admin") &&
                password.getText().toString().equals("admin")) {
            Intent intent = new Intent(getBaseContext(), MainActivity.class);
            startActivity(intent);

        } else {
            Toast.makeText(getApplicationContext(), "Username or Password is wrong!",
                    Toast.LENGTH_SHORT).show();
            numberOfRemainingLoginAttempts--;
        }
        if (numberOfRemainingLoginAttempts == 0) {
            Toast.makeText(getApplicationContext(), "LOGIN LOCKED!",
                    Toast.LENGTH_SHORT).show();
        }
    }
    private void setupVariables() {
        username = (EditText) findViewById(R.id.email_text);
        password = (EditText) findViewById(R.id.password_text);
        login = (Button) findViewById(R.id.log_in);
    }


}

