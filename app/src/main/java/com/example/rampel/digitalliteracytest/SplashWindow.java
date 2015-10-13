package com.example.rampel.digitalliteracytest;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;


public class SplashWindow extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_window);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_splash_window, menu);
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

    @Override

    protected void onResume() {

        super.onResume();

        new Thread(new Runnable() {

            @Override

            public void run() {

                try {

                    Thread.sleep(3000);

                    Intent intent = new Intent(getBaseContext(),LoginAcitivity.class);

                    intent.addFlags(Intent.FLAG_ACTIVITY_NO_HISTORY);

                    startActivity(intent);

                    finish();

                } catch (InterruptedException e) {

                    e.printStackTrace();

                }

            }

        }).start();

    }


}
