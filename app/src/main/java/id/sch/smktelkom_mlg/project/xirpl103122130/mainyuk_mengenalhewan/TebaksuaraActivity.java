package id.sch.smktelkom_mlg.project.xirpl103122130.mainyuk_mengenalhewan;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class TebaksuaraActivity extends AppCompatActivity {

      @Override
      protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_tebaksuara);

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
}
