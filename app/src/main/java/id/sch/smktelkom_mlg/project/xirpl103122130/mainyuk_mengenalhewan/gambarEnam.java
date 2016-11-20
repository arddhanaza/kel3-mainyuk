package id.sch.smktelkom_mlg.project.xirpl103122130.mainyuk_mengenalhewan;

import android.content.DialogInterface;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;

public class gambarEnam extends AppCompatActivity {

      private static final String TAG = "LivecycleTag";
      MediaPlayer mediaPlayer;

      @Override
      protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_gambar_enam);

            Log.d(TAG, "onStart: ");
            mediaPlayer = MediaPlayer.create(this, R.raw.naik);

            findViewById(R.id.iButtonPilihanA).setOnClickListener(new View.OnClickListener() {
                  @Override
                  public void onClick(View v) {
                        AlertDialog.Builder AlertBox = new AlertDialog.Builder(gambarEnam.this, android.R.style.Theme_Holo_Light_Dialog_NoActionBar_MinWidth);
                        AlertBox.setTitle("Opss!");
                        AlertBox.setMessage("Gambar yang anda pilih salah");
                        AlertBox.setNeutralButton("OK", null);
                        AlertBox.show();
                  }
            });

            findViewById(R.id.iButtonPilihanB).setOnClickListener(new View.OnClickListener() {
                  @Override
                  public void onClick(View v) {
                        AlertDialog.Builder AlertBox = new AlertDialog.Builder(gambarEnam.this, android.R.style.Theme_Holo_Light_Dialog_NoActionBar_MinWidth);
                        AlertBox.setTitle("Opss!");
                        AlertBox.setMessage("Gambar yang anda pilih salah");
                        AlertBox.setNeutralButton("OK", null);
                        AlertBox.show();
                  }
            });

            findViewById(R.id.iButtonPilihanC).setOnClickListener(new View.OnClickListener() {
                  @Override
                  public void onClick(View v) {
                        AlertDialog.Builder AlertBox = new AlertDialog.Builder(gambarEnam.this, android.R.style.Theme_Holo_Light_Dialog_NoActionBar_MinWidth);
                        AlertBox.setTitle("Yeeii Benar!");
                        AlertBox.setMessage("Buka gambar yang lain");
                        AlertBox.setNeutralButton("OK", new DialogInterface.OnClickListener() {
                              public void onClick(DialogInterface dialog, int id) {

                                    onBackPressed();
                              }
                        });
                        AlertBox.show();
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
