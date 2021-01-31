package com.missouristate.perry.hellogoodbye;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button b1;
    ImageView i1,i2;
    TextView t1,t2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        b1 = (Button) findViewById(R.id.btn_1);
        i1 = (ImageView) findViewById(R.id.iv_1);
        i2 = (ImageView) findViewById(R.id.iv_2);
        t1 = (TextView) findViewById(R.id.tv_1);
        t2 = (TextView) findViewById(R.id.tv_2);

    }
    public void b1Clicked(View v)
    {
        i1.setVisibility(View.INVISIBLE);
        i2.setVisibility(View.VISIBLE);
        t1.setVisibility(View.INVISIBLE);
        t2.setVisibility(View.VISIBLE);
    }
}
