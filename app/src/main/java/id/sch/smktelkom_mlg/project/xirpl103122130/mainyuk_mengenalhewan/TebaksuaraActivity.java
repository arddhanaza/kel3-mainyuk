package id.sch.smktelkom_mlg.project.xirpl103122130.mainyuk_mengenalhewan;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.view.WindowManager;

public class TebaksuaraActivity extends AppCompatActivity {

      private static final String TAG = "LivecycleTag";
      MediaPlayer mediaPlayer;

      @Override
      protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_tebaksuara);
            setTitle("Tebak Suara");

            getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                    WindowManager.LayoutParams.FLAG_FULLSCREEN);
            Log.d(TAG, "onStart: ");
            mediaPlayer = MediaPlayer.create(this, R.raw.naik);

            findViewById(R.id.imageButtonHome).setOnClickListener(new View.OnClickListener() {
                  @Override
                  public void onClick(View v) {
                        onBackPressed();
                  }
            });
            findViewById(R.id.satu).setOnClickListener(new View.OnClickListener() {
                  @Override
                  public void onClick(View v) {
                        startActivity(new Intent(TebaksuaraActivity.this, suaraSatu.class));
                  }
            });

            findViewById(R.id.dua).setOnClickListener(new View.OnClickListener() {
                  @Override
                  public void onClick(View v) {
                        startActivity(new Intent(TebaksuaraActivity.this, suaraDuaActivity.class));
                  }
            });

            findViewById(R.id.tiga).setOnClickListener(new View.OnClickListener() {
                  @Override
                  public void onClick(View v) {
                        startActivity(new Intent(TebaksuaraActivity.this, suaraTigaActivity.class));
                  }
            });

            findViewById(R.id.empat).setOnClickListener(new View.OnClickListener() {
                  @Override
                  public void onClick(View v) {
                        startActivity(new Intent(TebaksuaraActivity.this, suaraEmpatActivity.class));
                  }
            });

            findViewById(R.id.lima).setOnClickListener(new View.OnClickListener() {
                  @Override
                  public void onClick(View v) {
                        startActivity(new Intent(TebaksuaraActivity.this, suaraLimaActivity.class));
                  }
            });

            findViewById(R.id.enam).setOnClickListener(new View.OnClickListener() {
                  @Override
                  public void onClick(View v) {
                        startActivity(new Intent(TebaksuaraActivity.this, suaraEnamActivity.class));
                  }
            });
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
