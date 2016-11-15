package id.sch.smktelkom_mlg.project.xirpl103122130.mainyuk_mengenalhewan;

import android.app.Dialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class gambarEmpat extends AppCompatActivity {

      @Override
      protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_gambar_empat);

            findViewById(R.id.iButtonPilihanA).setOnClickListener(new View.OnClickListener() {
                  @Override
                  public void onClick(View v) {
                        AlertDialog.Builder AlertBox = new AlertDialog.Builder(gambarEmpat.this, android.R.style.Theme_Holo_Light_Dialog_NoActionBar_MinWidth);
                        AlertBox.setTitle("Opss!");
                        AlertBox.setMessage("Gambar yang anda pilih salah");
                        AlertBox.setNeutralButton("OK", null);
                        AlertBox.show();
                  }
            });

            findViewById(R.id.iButtonPilihanB).setOnClickListener(new View.OnClickListener() {
                  @Override
                  public void onClick(View v) {
                        AlertDialog.Builder AlertBox = new AlertDialog.Builder(gambarEmpat.this, android.R.style.Theme_Holo_Light_Dialog_NoActionBar_MinWidth);
                        AlertBox.setTitle("Yeeii Benar!");
                        AlertBox.setMessage("Buka gambar yang lain");
                        AlertBox.setNeutralButton("OK", new DialogInterface.OnClickListener() {
                              public void onClick(DialogInterface dialog, int id) {

                                    startActivity(new Intent(((Dialog) dialog).getContext(), TebakgambarActivity.class));
                              }
                        });
                        AlertBox.show();
                  }
            });

            findViewById(R.id.iButtonPilihanC).setOnClickListener(new View.OnClickListener() {
                  @Override
                  public void onClick(View v) {
                        AlertDialog.Builder AlertBox = new AlertDialog.Builder(gambarEmpat.this, android.R.style.Theme_Holo_Light_Dialog_NoActionBar_MinWidth);
                        AlertBox.setTitle("Opss!");
                        AlertBox.setMessage("Gambar yang anda pilih salah");
                        AlertBox.setNeutralButton("OK", null);
                        AlertBox.show();
                  }
            });
      }
}
