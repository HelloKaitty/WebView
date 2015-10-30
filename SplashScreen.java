package tw.idv.gocar.kn1.webview;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;


public class SplashScreen extends Activity {

    // Splash screen timer
    private static int SPLASH_TIME_OUT = 3000; //開啟畫面時間(3秒)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        new Handler().postDelayed(new Runnable() {

            @Override

            public void run() {
                // This method will be executed once the timer is over
                // Start your app main activity
                Intent mainIntent = new Intent(SplashScreen.this,WebviewActivity.class);
                SplashScreen.this.startActivity(mainIntent);
                SplashScreen.this.finish();
                // close this activity
                finish();
            }
        }, SPLASH_TIME_OUT);
    }

}