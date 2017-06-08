package com.example.mary.hedgehog;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.webkit.WebView;
import android.widget.ImageView;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

/**
 * Created by Mary on 26.05.2017.
 */

public class DetailActivity extends AppCompatActivity {


    @Override
    protected  void  onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_detail);
        ImageView image = (ImageView)findViewById(R.id.picture);

        WebView webView = (WebView) findViewById(R.id.webView);

        Intent intent = getIntent();

        String resName = "n" + intent.getIntExtra("head", 0);
        int lastPosition = intent.getExtras().getInt("head");
        Log.i("name", resName);
        Context context = getBaseContext();

        String text = readRawTextFile(context, getResources().getIdentifier(resName, "raw", "com.example.mary.hedgehog"));

        webView.loadDataWithBaseURL(null, text, "text/html", "en_US", null);
        switch (lastPosition){
            case 0:
            image.setImageDrawable(ContextCompat.getDrawable(getBaseContext(),R.drawable.img0));
                break;
            case 1:
            image.setImageDrawable(ContextCompat.getDrawable(getBaseContext(),R.drawable.img1));
                break;
            case 2:
            image.setImageDrawable(ContextCompat.getDrawable(getBaseContext(),R.drawable.img2));
                break;
            case 3:
            image.setImageDrawable(ContextCompat.getDrawable(getBaseContext(),R.drawable.img3));
                break;
            case 4:
            image.setImageDrawable(ContextCompat.getDrawable(getBaseContext(),R.drawable.img4));
                break;
            case 5:
            image.setImageDrawable(ContextCompat.getDrawable(getBaseContext(),R.drawable.img5));
                break;
            case 6:
            image.setImageDrawable(ContextCompat.getDrawable(getBaseContext(),R.drawable.img6));
                break;
            case 7:
            image.setImageDrawable(ContextCompat.getDrawable(getBaseContext(),R.drawable.img7));
                break;
            case 8:
            image.setImageDrawable(ContextCompat.getDrawable(getBaseContext(),R.drawable.img8));
                break;
            case 9:
            image.setImageDrawable(ContextCompat.getDrawable(getBaseContext(),R.drawable.img9));
                break;
            case 10:
            image.setImageDrawable(ContextCompat.getDrawable(getBaseContext(),R.drawable.img10));
                break;
            case 11:
            image.setImageDrawable(ContextCompat.getDrawable(getBaseContext(),R.drawable.img11));
                break;
            case 12:
            image.setImageDrawable(ContextCompat.getDrawable(getBaseContext(),R.drawable.img12));
                break;
            case 13:
            image.setImageDrawable(ContextCompat.getDrawable(getBaseContext(),R.drawable.img13));
                break;
            case 14:
            image.setImageDrawable(ContextCompat.getDrawable(getBaseContext(),R.drawable.img14));
                break;
            case 15:
            image.setImageDrawable(ContextCompat.getDrawable(getBaseContext(),R.drawable.img15));
                break;

        }
    }




    public static  String readRawTextFile(Context context, int resId){
        InputStream inputStream = context.getResources().openRawResource(resId);

        InputStreamReader inputReader = new InputStreamReader(inputStream);
        BufferedReader buffReader = new BufferedReader(inputReader);
        String line;
        StringBuilder builder = new StringBuilder();

        try {
            while ((line = buffReader.readLine()) !=null){
                builder.append(line);
                builder.append("\n");
            }
        }catch (IOException e){
            return null;
        }
        return builder.toString();
    }
}
