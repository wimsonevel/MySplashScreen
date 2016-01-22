package com.wim.mysplashscreen;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

/**
 * Created by Wim on 22-Jan-16.
 */
public class SplashActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        Thread timerSplash = new Thread(){
            public void run(){
                try{
                    short timerSplash = 0;
                    while(timerSplash < 2000){
                        sleep(100);
                        timerSplash = (short) (timerSplash + 100);
                    }

                    MainActivity.start(SplashActivity.this);
                    finish();

                }catch(InterruptedException e){
                    e.printStackTrace();
                }finally{
                    finish();
                }
            }
        };

        timerSplash.start();
    }
}
