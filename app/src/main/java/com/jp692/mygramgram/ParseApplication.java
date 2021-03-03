package com.jp692.mygramgram;

import android.app.Application;

import androidx.appcompat.app.AppCompatActivity;

import com.parse.Parse;
import com.parse.ParseObject;

public class ParseApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();

        // Register your parse models
        ParseObject.registerSubclass(Post.class);

        Parse.initialize(new Parse.Configuration.Builder(this)
                .applicationId("XHDPDkmAKMYKYqNqEOh2ydcjZa4TiRhM0zHrKAFf")
                .clientKey("qYNOsL3PuwVwP299RSDesWlKdt7b7kEvRWHf3Pl3")
                .server("https://parseapi.back4app.com")
                .build()
        );
    }
}
