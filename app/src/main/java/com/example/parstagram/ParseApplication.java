package com.example.parstagram;

import android.app.Application;
import com.parse.Parse;
import com.parse.ParseObject;

public class ParseApplication extends Application {

    // Initializes Parse SDK as soon as the application is created
    @Override
    public void onCreate() {
        super.onCreate();

        // Register your parse models
        ParseObject.registerSubclass(Post.class);

        Parse.initialize(new Parse.Configuration.Builder(this)
                .applicationId("jbpak1fKAgorKcSN1Ykqq6uQLZCqU32oz1aElEwA")
                .clientKey("pXGUH0psbVDMviOZlfGPjCiJSaPWB6HsnMUIYZvf")
                .server("https://parseapi.back4app.com")
                .build()
        );
    }
}
