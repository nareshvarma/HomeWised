package info.androidhive.HomeWised.activity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;

import info.androidhive.materialdesign.R;

/**
 * Created by nunc_dayal on 13-11-2015.
 */
public class SplashScreen extends Activity{

    private final int welcomeScreenDisplay = 2000;
    public static final String TAG = SplashScreen.class.getSimpleName();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hom_splash_screen);
        Thread backgount = new Thread() {
            public void run() {
                try {
                    sleep(5 * 1000);
                    Intent i = new Intent(getApplicationContext(),
                            LoginActivity.class);
                    startActivity(i);
                    fileList();

                } catch (Exception e) {
                    // TODO: handle exception
                }
            }

        };
        backgount.start();

    }
}
