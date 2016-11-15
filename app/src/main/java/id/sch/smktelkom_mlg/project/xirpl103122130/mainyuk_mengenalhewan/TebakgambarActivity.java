package id.sch.smktelkom_mlg.project.xirpl103122130.mainyuk_mengenalhewan;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class TebakgambarActivity extends AppCompatActivity {

      @Override
      protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_tebakgambar);

            findViewById(R.id.satu).setOnClickListener(new View.OnClickListener() {
                  @Override
                  public void onClick(View v) {
                        startActivity(new Intent(TebakgambarActivity.this, gambarSatu.class));
                  }
            });

            findViewById(R.id.dua).setOnClickListener(new View.OnClickListener() {
                  @Override
                  public void onClick(View v) {
                        startActivity(new Intent(TebakgambarActivity.this, gambarDua.class));
                  }
            });

            findViewById(R.id.tiga).setOnClickListener(new View.OnClickListener() {
                  @Override
                  public void onClick(View v) {
                        startActivity(new Intent(TebakgambarActivity.this, gambarTiga.class));
                  }
            });

            findViewById(R.id.empat).setOnClickListener(new View.OnClickListener() {
                  @Override
                  public void onClick(View v) {
                        startActivity(new Intent(TebakgambarActivity.this, gambarEmpat.class));
                  }
            });

            findViewById(R.id.lima).setOnClickListener(new View.OnClickListener() {
                  @Override
                  public void onClick(View v) {
                        startActivity(new Intent(TebakgambarActivity.this, gambarLima.class));
                  }
            });

            findViewById(R.id.enam).setOnClickListener(new View.OnClickListener() {
                  @Override
                  public void onClick(View v) {
                        startActivity(new Intent(TebakgambarActivity.this, gambarEnam.class));
                  }
            });
      }
}
