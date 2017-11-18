package com.khanh.project;

import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.TextView;

public class Login extends AppCompatActivity {

    TextView user, pass, forgot , create;
    Button sign;
    CheckBox check;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        getSupportActionBar().hide();

        Typeface typeface = Typeface.createFromAsset(getAssets(), "fonts/AVANTN.ttf");
        user.setTypeface(typeface);
        Typeface typeface2 = Typeface.createFromAsset(getAssets(), "fonts/AVANTN.ttf");
        pass.setTypeface(typeface2);
        Typeface typeface3 = Typeface.createFromAsset(getAssets(), "fonts/AVANTN.ttf");
        forgot.setTypeface(typeface3);
        Typeface typeface4 = Typeface.createFromAsset(getAssets(), "fonts/AVANTN.ttf");
        create.setTypeface(typeface4);
        Typeface typeface5 = Typeface.createFromAsset(getAssets(), "fonts/AVANTN.ttf");
        sign.setTypeface(typeface5);
        Typeface typeface6 = Typeface.createFromAsset(getAssets(), "fonts/AVANTN.ttf");
        check.setTypeface(typeface6);
    }
    public void anhxa(){
        user = (TextView)findViewById(R.id.user);
        pass = (TextView)findViewById(R.id.pass);
        forgot = (TextView)findViewById(R.id.forgot);
        create = (TextView)findViewById(R.id.create);
        sign = (Button)findViewById(R.id.sign);
        check = (CheckBox)findViewById(R.id.checkBox);

    }
}
