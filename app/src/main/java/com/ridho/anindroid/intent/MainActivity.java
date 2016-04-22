package com.ridho.anindroid.intent;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.ActionBarActivity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import java.net.URL;

public class MainActivity extends ActionBarActivity {

    private Button btnSub1, btnSub2, btnDial;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnSub1 = (Button)findViewById(R.id.button);
        btnSub2 = (Button)findViewById(R.id.button2);
        btnDial = (Button)findViewById(R.id.button3);

        btnSub1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, Sub1Activity.class);
                startActivity(intent);
            }
        });

        btnSub2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, Sub2Activity.class);
                intent.putExtra(Sub2Activity.KEY_DATA, "Training Aplikasi Android\nTulisan ini dikirim dari MainActivity");
                startActivityForResult(intent, 0);
            }
        });

        btnDial.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:085743431212"));
                startActivity(intent);
            }
        });
    }
}
