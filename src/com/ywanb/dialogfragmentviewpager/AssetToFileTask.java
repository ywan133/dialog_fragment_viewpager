package com.ywanb.dialogfragmentviewpager;

import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;

import android.content.Context;
import android.content.res.AssetManager;
import android.os.AsyncTask;
import android.os.Environment;
import android.util.Log;

public class AssetToFileTask extends AsyncTask<String, String, String> {

	private static final String DEBUG = "AssetToFileTask";
	private Context context;

	public AssetToFileTask(Context con) {
		super();
		this.context = con;

	}

	@Override
	protected String doInBackground(String... params) {

		String basepath = Environment.getExternalStorageDirectory().getPath() + "/"
				+ Constants.FOLDER_NAME + "/" + "geodb/";

		File mkDir = new File(basepath);
		mkDir.mkdirs();

		basepath = Environment.getExternalStorageDirectory().getPath() + "/"
				+ Constants.FOLDER_NAME + "/";

		Log.e(DEBUG, basepath);

		AssetManager assetManager = context.getResources().getAssets();

		String[] files = null;

		try {
			files = assetManager.list("geodb"); // database file is folder name
		} catch (Exception e) {
			Log.e(DEBUG, "ERROR: " + e.toString());
		}

		for (int i = 0; i < files.length; i++) {
			InputStream in = null;
			OutputStream out = null;
			try {
				in = assetManager.open("geodb/" + files[i]);
				out = new FileOutputStream(basepath + "/geodb/" + files[i]);

				byte[] buffer = new byte[65536 * 2];
				int read;
				while ((read = in.read(buffer)) != -1) {
					out.write(buffer, 0, read);
				}
				in.close();
				in = null;
				out.flush();
				out.close();
				out = null;
				Log.e(DEBUG, "database File Copied in SD Card");
			} catch (Exception e) {
				Log.e(DEBUG, "ERROR: " + e.toString());
			}
		}

		return null;
	}

}
