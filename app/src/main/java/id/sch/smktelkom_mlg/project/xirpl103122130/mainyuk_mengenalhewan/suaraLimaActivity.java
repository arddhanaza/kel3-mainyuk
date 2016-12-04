package id.sch.smktelkom_mlg.project.xirpl103122130.mainyuk_mengenalhewan;

import android.content.DialogInterface;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.WindowManager;
import android.widget.ImageView;

import java.util.Timer;

public class suaraLimaActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_suara_lima);
        ImageView play = (ImageView) findViewById(R.id.play);
        setTitle("Suara Hewan Apakah Ini?");
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);
        final MediaPlayer mp = MediaPlayer.create(suaraLimaActivity.this, R.raw.kuda);

        play.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mp.start();
            }
        });

        findViewById(R.id.iButtonPilihanA).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                AlertDialog.Builder adb = new AlertDialog.Builder(view.getContext())
                        .setTitle("Opss!")
                        .setMessage("Hewan ini suaranya bukan seperti itu")
                        .setCancelable(false);

                AlertDialog ad = adb.create();
                ad.show();

                Timer t = new Timer();
                t.schedule(new CloseDialogTimerTask(ad), 3000);
            }
        });

        findViewById(R.id.iButtonPilihanC).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                AlertDialog.Builder adb = new AlertDialog.Builder(view.getContext())
                        .setTitle("Opss!")
                        .setMessage("Hewan ini suaranya bukan seperti itu")
                        .setCancelable(false);

                AlertDialog ad = adb.create();
                ad.show();

                Timer t = new Timer();
                t.schedule(new CloseDialogTimerTask(ad), 3000);
            }
        });

        findViewById(R.id.iButtonPilihanB).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder AlertBox = new AlertDialog.Builder(suaraLimaActivity.this, android.R.style.Theme_Holo_Light_Dialog_NoActionBar_MinWidth);
                AlertBox.setTitle("Tepat Sekali!");
                AlertBox.setMessage("Coba dengarkan suara yang lain");
                AlertBox.setNeutralButton("OK", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int id) {

                        onBackPressed();
                    }
                });
                AlertBox.show();
            }
        });
    }
}
