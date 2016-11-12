package id.sch.smktelkom_mlg.project.xirpl103122130.mainyuk_mengenalhewan;

import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.GridView;

import java.util.ArrayList;

public class TebakgambarActivity extends AppCompatActivity {

      private GridView gridView;
      private GridViewAdapter gridAdapter;

      @Override
      protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_tebakgambar);

            gridView = (GridView) findViewById(R.id.gridView);
            gridAdapter = new GridViewAdapter(this, R.layout.grid_item_layout, getData());
            gridView.setAdapter(gridAdapter);

            /*gridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                  public void onItemClick(AdapterView<?> parent, View v, int position, long id) {
                        ImageItem item = (ImageItem) parent.getItemAtPosition(position);

                      startActivity(new Intent());
                  }
            });*/

      }

      /**
       * Prepare some dummy data for gridview
       */
      private ArrayList<ImageItem> getData() {
            final ArrayList<ImageItem> imageItems = new ArrayList<>();
            TypedArray imgs = getResources().obtainTypedArray(R.array.image_ids);
            for (int i = 0; i < imgs.length(); i++) {
                  Bitmap bitmap = BitmapFactory.decodeResource(getResources(), imgs.getResourceId(i, -1));
                  imageItems.add(new ImageItem(bitmap, "Gambar Ke " + i));
            }
            return imageItems;
      }
}
