package com.arieansyah.kasirrestoran;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    EditText jml_item1,jml_item2,jml_item3,jml_item4,jml_item5,jml_item6,jml_item7,jml_item8;
    String j1,j2,j3,j4,j5,j6,j7,j8;

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
            Intent it = new Intent(this, Setting.class);
            startActivity(it);
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    public void hitung_hrg(View view) {
        Intent it = new Intent(this, Struk.class);
        jml_item1 = (EditText)findViewById(R.id.jml1);
        jml_item2 = (EditText)findViewById(R.id.jml2);
        jml_item3 = (EditText)findViewById(R.id.jml3);
        jml_item4 = (EditText)findViewById(R.id.jml4);
        jml_item5 = (EditText)findViewById(R.id.jml5);
        jml_item6 = (EditText)findViewById(R.id.jml6);
        jml_item7 = (EditText)findViewById(R.id.jml7);
        jml_item8 = (EditText)findViewById(R.id.jml8);

        j1 = jml_item1.getText().toString();
        j2 = jml_item2.getText().toString();
        j3 = jml_item3.getText().toString();
        j4 = jml_item4.getText().toString();
        j5 = jml_item5.getText().toString();
        j6 = jml_item6.getText().toString();
        j7 = jml_item7.getText().toString();
        j8 = jml_item8.getText().toString();

        it.putExtra("jml_item1", j1);
        it.putExtra("jml_item2", j2);
        it.putExtra("jml_item3", j3);
        it.putExtra("jml_item4", j4);
        it.putExtra("jml_item5", j5);
        it.putExtra("jml_item6", j6);
        it.putExtra("jml_item7", j7);
        it.putExtra("jml_item8", j8);

        startActivity(it);
    }
}
