package com.example.gopal;

import android.media.Image;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import org.w3c.dom.Text;


public class ProfileActivity extends AppCompatActivity {
    ImageView imagee;
    TextView username, power;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.profile_activity);
        imagee=(ImageView)findViewById(R.id.gambar);
        username=(TextView)findViewById(R.id.textt);
        power=(TextView)findViewById(R.id.kekuatan);


        imagee.setImageResource(getIntent().getIntExtra("image", 0));
        username.setText(getIntent().getStringExtra("username"));
        power.setText(getIntent().getStringExtra("power"));
    }
}