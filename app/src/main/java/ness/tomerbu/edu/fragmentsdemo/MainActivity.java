package ness.tomerbu.edu.fragmentsdemo;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

public class MainActivity extends AppCompatActivity {
    String[] arr = {
            "Tumultumques sunt demissios de dexter castor.",
            "The resurrection of your trusts will disturb purely when you meet that freedom is the moon.",
            "Try roasting curry brushed with salad cream, whisked with basil leafs.",
            "Damn yer seashell, feed the pegleg.",
            "Extraterrestrial starships, to the cosmos.",
            "All hands meet, gravimetric peace!",
            "processors malfunction with peace."

    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
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

    public void setTime(View view) {
        getSupportFragmentManager().
                beginTransaction().
                replace(R.id.container, new TimePickerFragment()).
                commit();
    }

    public void setDate(View view) {
        getSupportFragmentManager().
                beginTransaction().
                replace(R.id.container, new ColorFragment()).
                commit();
    }

    public void setMessage(View view) {
    }
}
