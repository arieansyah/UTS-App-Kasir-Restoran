package com.arieansyah.kasirrestoran;

import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Struk extends AppCompatActivity {

    TextView tot_item1,tot_item2,tot_item3,tot_item4,tot_item5,tot_item6,tot_item7,tot_item8,
            tot_harga;
    String jml1,jml2,jml3,jml4,jml5,jml6,jml7,jml8,hrg1,hrg2,hrg3,hrg4,hrg5,hrg6,hrg7,hrg8,
            total_harga;
    int tot1,tot2,tot3,tot4,tot5,tot6,tot7,tot8;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_struk);

        Bundle it = getIntent().getExtras();
        SharedPreferences sp = getSharedPreferences("harga", MODE_PRIVATE);

        //get jumlah pesanan
        jml1 = (String)it.get("jml_item1");
        jml2 = (String)it.get("jml_item2");
        jml3 = (String)it.get("jml_item3");
        jml4 = (String)it.get("jml_item4");
        jml5 = (String)it.get("jml_item5");
        jml6 = (String)it.get("jml_item6");
        jml7 = (String)it.get("jml_item7");
        jml8 = (String)it.get("jml_item8");

        //get Harga dari shared preferences
        hrg1 = sp.getString("harga1", "1");
        hrg2 = sp.getString("harga2", "1");
        hrg3 = sp.getString("harga3", "1");
        hrg4 = sp.getString("harga4", "1");
        hrg5 = sp.getString("harga5", "1");
        hrg6 = sp.getString("harga6", "1");
        hrg7 = sp.getString("harga7", "1");
        hrg8 = sp.getString("harga8", "1");

        //jumlah harga dan jumlah pesanan
        tot1 = Integer.parseInt(jml1)*Integer.parseInt(hrg1);
        tot2 = Integer.parseInt(jml2)*Integer.parseInt(hrg2);
        tot3 = Integer.parseInt(jml3)*Integer.parseInt(hrg3);
        tot4 = Integer.parseInt(jml4)*Integer.parseInt(hrg4);
        tot5 = Integer.parseInt(jml5)*Integer.parseInt(hrg5);
        tot6 = Integer.parseInt(jml6)*Integer.parseInt(hrg6);
        tot7 = Integer.parseInt(jml7)*Integer.parseInt(hrg7);
        tot8 = Integer.parseInt(jml8)*Integer.parseInt(hrg8);

        tot_item1 = (TextView) findViewById(R.id.tot1);
        tot_item2 = (TextView) findViewById(R.id.tot2);
        tot_item3 = (TextView) findViewById(R.id.tot3);
        tot_item4 = (TextView) findViewById(R.id.tot4);
        tot_item5 = (TextView) findViewById(R.id.tot5);
        tot_item6 = (TextView) findViewById(R.id.tot6);
        tot_item7 = (TextView) findViewById(R.id.tot7);
        tot_item8 = (TextView) findViewById(R.id.tot8);

        //set to activity
        tot_item1.setText(Integer.toString(tot1));
        tot_item2.setText(Integer.toString(tot2));
        tot_item3.setText(Integer.toString(tot3));
        tot_item4.setText(Integer.toString(tot4));
        tot_item5.setText(Integer.toString(tot5));
        tot_item6.setText(Integer.toString(tot6));
        tot_item7.setText(Integer.toString(tot7));
        tot_item8.setText(Integer.toString(tot8));

        tot_harga = (TextView)findViewById(R.id.tot_hrg);
        total_harga = Integer.toString(tot1+tot2+tot3+tot4+tot5+tot6+tot7+tot8);
        tot_harga.setText(total_harga);

    }
}
