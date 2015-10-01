package me.ccrama.redditslide.Activities;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;

import me.ccrama.redditslide.OpenRedditLink;

/**
 * Created by carlo_000 on 9/28/2015.
 */
public class OpenContent extends Activity {
    @Override
    public void onCreate(Bundle savedInstance){
        super.onCreate(savedInstance);
        Intent intent = getIntent();
        Uri data = intent.getData();
        String url = data.toString();
        new OpenRedditLink(this, url);
        finish();
    }
}
