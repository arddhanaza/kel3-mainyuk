package id.sch.smktelkom_mlg.project.xirpl103122130.mainyuk_mengenalhewan;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "LivecycleTag";
    MediaPlayer mediaPlayer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setTitle("Main Yuk - Home");


        findViewById(R.id.imageButtonTGambar).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, TebakgambarActivity.class));
            }
        });

        findViewById(R.id.imageButtonTSuara).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, TebaksuaraActivity.class));
            }
        });

        ImageButton exit = (ImageButton) findViewById(R.id.imageButtonExit);
        exit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
                System.exit(0);
            }
        });
        Log.d(TAG, "onStart: ");
        mediaPlayer = MediaPlayer.create(this, R.raw.naik);
    }

    @Override
    protected void onStart() {
        super.onStart();
        mediaPlayer.start();
        Log.d(TAG, "onStart: ");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d(TAG, "onResume: ");
        mediaPlayer.start();
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d(TAG, "onPause: ");
        mediaPlayer.pause();
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d(TAG, "onStop: ");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d(TAG, "onRestart: ");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d(TAG, "onDestroy");
        if (mediaPlayer != null) mediaPlayer.release();
    }
}
