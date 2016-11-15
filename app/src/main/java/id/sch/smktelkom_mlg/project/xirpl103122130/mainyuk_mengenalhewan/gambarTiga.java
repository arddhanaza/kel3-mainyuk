package id.sch.smktelkom_mlg.project.xirpl103122130.mainyuk_mengenalhewan;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class gambarTiga extends AppCompatActivity {

      @Override
      protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_gambar_tiga);

            findViewById(R.id.iButtonPilihanA).setOnClickListener(new View.OnClickListener() {
                  @Override
                  public void onClick(View v) {

                  }
            });

            findViewById(R.id.iButtonPilihanB).setOnClickListener(new View.OnClickListener() {
                  @Override
                  public void onClick(View v) {

                  }
            });

            findViewById(R.id.iButtonPilihanC).setOnClickListener(new View.OnClickListener() {
                  @Override
                  public void onClick(View v) {

                  }
            });
      }
}
