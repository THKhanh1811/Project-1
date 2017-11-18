package com.khanh.project;

import android.graphics.Typeface;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView vercode, textlogo;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportActionBar().hide();
        anhxa();
        getversionapp();
        //hidden status bar
        View decorView = getWindow().getDecorView();
        int uiOptions = View.SYSTEM_UI_FLAG_FULLSCREEN;
        decorView.setSystemUiVisibility(uiOptions);

        //font
        Typeface typeface = Typeface.createFromAsset(getAssets(), "fonts/AVANTN.ttf");
        textlogo.setTypeface(typeface);
        Typeface typefacecode = Typeface.createFromAsset(getAssets(), "fonts/AVANTN.ttf");
        vercode.setTypeface(typefacecode);


    }
    public void getversionapp(){
        String verCode = BuildConfig.VERSION_NAME;
        vercode.setText("Version "+verCode);
    }
    public void anhxa(){
        textlogo = (TextView) findViewById(R.id.textView);
        vercode = (TextView) findViewById(R.id.versioncode);

    }

}
