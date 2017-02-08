package com.example.rahul.login;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.widget.ImageButton;

public class SocialMedia extends AppCompatActivity {
    ImageButton fbButton;
    ImageButton twitterButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_social_media);

        fbButton = (ImageButton) findViewById(R.id.BtnFB);
        twitterButton = (ImageButton) findViewById(R.id.BtnTwitter);


    }
    public void twitter(View view){
        Intent Browserintent =  new Intent(Intent.ACTION_VIEW, Uri.parse("https://twitter.com/covcampus/"));
        startActivity(Browserintent);
    }

    public void fb(View view){
        Intent facebook =  new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.facebook.com/groups/CoventryUniversityFreshers2014/"));
        startActivity(facebook);
    }
}
