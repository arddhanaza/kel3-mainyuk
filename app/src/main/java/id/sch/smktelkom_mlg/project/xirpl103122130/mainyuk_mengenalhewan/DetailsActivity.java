package id.sch.smktelkom_mlg.project.xirpl103122130.mainyuk_mengenalhewan;

import android.graphics.Bitmap;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.widget.ImageView;

public class DetailsActivity extends ActionBarActivity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.details_activity);

		Bitmap bitmap = getIntent().getParcelableExtra("image");

		ImageView imageView = (ImageView) findViewById(R.id.image);
		imageView.setImageBitmap(bitmap);
	}
}
