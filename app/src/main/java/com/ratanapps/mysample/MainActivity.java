package com.ratanapps.mysample;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void mine()
    {
        String s = "Its mine procedure at all turns";
        Log.e("dfjdkfdj",s);
    }

    public void refresh()
    {
        Button button = new Button(this);
        button.performClick();
    }

}
