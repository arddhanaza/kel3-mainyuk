package id.sch.smktelkom_mlg.project.xirpl103122130.mainyuk_mengenalhewan;

import android.support.v7.app.AlertDialog;

import java.util.TimerTask;

/**
 * Created by asus on 04/12/2016.
 */
public class CloseDialogTimerTask extends TimerTask {
	private AlertDialog ad;

	public CloseDialogTimerTask(AlertDialog ad) {
		this.ad = ad;
	}

	@Override
	public void run() {
		if (ad.isShowing()) {
			ad.dismiss();
		}
	}

}
