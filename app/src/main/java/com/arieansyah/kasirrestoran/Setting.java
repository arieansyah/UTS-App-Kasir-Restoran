package com.arieansyah.kasirrestoran;

import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class Setting extends AppCompatActivity {
    EditText harga1, harga2, harga3, harga4, harga5, harga6, harga7, harga8;
    String hrgMenu1,hrgMenu2,hrgMenu3,hrgMenu4,hrgMenu5,hrgMenu6,hrgMenu7,hrgMenu8;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_setting);

        harga1 = (EditText)findViewById(R.id.numb1);
        harga2 = (EditText)findViewById(R.id.numb2);
        harga3 = (EditText)findViewById(R.id.numb3);
        harga4 = (EditText)findViewById(R.id.numb4);
        harga5 = (EditText)findViewById(R.id.numb5);
        harga6 = (EditText)findViewById(R.id.numb6);
        harga7 = (EditText)findViewById(R.id.numb7);
        harga8 = (EditText)findViewById(R.id.numb8);

        SharedPreferences sp = getSharedPreferences("harga", MODE_PRIVATE);
        harga1.setText(sp.getString("harga1","1"));
        harga2.setText(sp.getString("harga2","1"));
        harga3.setText(sp.getString("harga3","1"));
        harga4.setText(sp.getString("harga4","1"));
        harga5.setText(sp.getString("harga5","1"));
        harga6.setText(sp.getString("harga6","1"));
        harga7.setText(sp.getString("harga7","1"));
        harga8.setText(sp.getString("harga8","1"));


    }


    public void simpan_harga(View view) {
        SharedPreferences sharedPreferences = getSharedPreferences("harga", MODE_PRIVATE);
        SharedPreferences.Editor editor = sharedPreferences.edit();

        hrgMenu1 = harga1.getText().toString();
        hrgMenu2 = harga2.getText().toString();
        hrgMenu3 = harga3.getText().toString();
        hrgMenu4 = harga4.getText().toString();
        hrgMenu5 = harga5.getText().toString();
        hrgMenu6 = harga6.getText().toString();
        hrgMenu7 = harga7.getText().toString();
        hrgMenu8 = harga8.getText().toString();

        editor.putString("harga1", hrgMenu1);
        editor.putString("harga2", hrgMenu2);
        editor.putString("harga3", hrgMenu3);
        editor.putString("harga4", hrgMenu4);
        editor.putString("harga5", hrgMenu5);
        editor.putString("harga6", hrgMenu6);
        editor.putString("harga7", hrgMenu7);
        editor.putString("harga8", hrgMenu8);
        editor.commit();
        Toast.makeText(this, "Harga Tersimpan", Toast.LENGTH_LONG).show();
    }
}
