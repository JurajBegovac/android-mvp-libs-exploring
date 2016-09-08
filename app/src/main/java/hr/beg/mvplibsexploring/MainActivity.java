package hr.beg.mvplibsexploring;

import android.content.Context;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import flow.Flow;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void attachBaseContext(Context baseContext) {
        baseContext = Flow.configure(baseContext, this).install();
        super.attachBaseContext(baseContext);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public void onBackPressed() {
        if (!Flow.get(this).goBack()) {
            super.onBackPressed();
        }
    }
}
