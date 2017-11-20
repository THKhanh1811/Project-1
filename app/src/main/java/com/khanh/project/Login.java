package com.khanh.project;

import android.graphics.Typeface;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Window;
import android.view.WindowManager;
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

        Window window = this.getWindow();

// clear FLAG_TRANSLUCENT_STATUS flag:
        window.clearFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS);

// add FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS flag to the window
        window.addFlags(WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS);

// finally change the color
        window.setStatusBarColor(ContextCompat.getColor(this,R.color.statusbar_color_change));

        anhxa();
        Typeface typeface = Typeface.createFromAsset(getAssets(), "fonts/Bambino Light.ttf");
        user.setTypeface(typeface);
        pass.setTypeface(typeface);
        forgot.setTypeface(typeface);
        create.setTypeface(typeface);
        sign.setTypeface(typeface);
        check.setTypeface(typeface);
    }
    public void anhxa(){
        user = (TextView)findViewById(R.id.txtuser);
        pass = (TextView)findViewById(R.id.txtpass);
        forgot = (TextView)findViewById(R.id.forgot);
        create = (TextView)findViewById(R.id.create);
        sign = (Button)findViewById(R.id.sign);
        check = (CheckBox)findViewById(R.id.checkBox);

    }
}
