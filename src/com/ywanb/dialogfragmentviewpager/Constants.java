package com.ywanb.dialogfragmentviewpager;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.preference.PreferenceManager;
import android.util.Log;

public class Constants {
	public static String NEW_LINE = System.getProperty("line.separator");

	// public static final String PROPERTY_REG_ID = "registration_id";

	private static final String DEBUG = "Consants";

	// public static String TEMP_REG_ID = "";
	// cache
	public static String URL = "";
	public static String SID = "";
	public static String REG_ID_CACHE = "";

	// keywords only
	public static final String SERVER_URL = "serverUrl";
	public static final String HTTP_KEYWORDS = "http://";
	public static final String REG_ID = "regId";
	public static final String OOBA = "ooba";
	public final static int PLAY_SERVICES_RESOLUTION_REQUEST = 9000;
	// ACT = account
//	public static final String ACT_COMPANY_LOGO_URL = "companyLogoUrl";
//	public static final String ACT_COMPANY_NAME = "companyName";
//	public static final String ACT_COMPANY_ID = "companyId";
//	public static final String ACT_DESCRIPTION = "description";
//	public static final String ACT_USERNAME = "username";

	public static final String GCM_ACK_URL = "ackUrl";
	public static final String GCM_CLIENT_IP = "clientIp";
	public static final String GCM_SID = "sid";
	public static final String GCM_SALT = "salt";
	public static final String GCM_SERVER_TIME = "serverTime";
	public static final String GCM_APP_NAME = "appName";
	public static final String GCM_APP_LOGO = "appLogo";
	public static final String GCM_APP_MSG = "appMsg";
	public static final String GCM_AUTH = "auth";
	public static final String GCM_TIMEOUT = "timeout";
	public static final String GCM_COMPANY_ID = "companyId";

	// define constants
	public static final String SENDER_ID = "623447156487"; // project number
	public static final String INTERNAL_BROADCAST_ACTION = "com.deepnet.mobilepass.android.others";
	public static final String APPROVED = "y";
	public static final String DENIED = "n";
	public static final int MEDIA_TYPE_IMAGE = 1;
    public static final int MEDIA_TYPE_VIDEO = 2;
    public static final String FOLDER_NAME = "DeepnetSecurity";

	// storing temp data
	public static String DIRECT_URL = "";

	public static void savePref(Context context, String key, String value) {

		SharedPreferences sp = PreferenceManager.getDefaultSharedPreferences(context);
		Editor editor = sp.edit();
		editor.putString(key, value);
		editor.commit();
	}

	public static String readStringPref(Context context, String key) {
		SharedPreferences sp = PreferenceManager.getDefaultSharedPreferences(context);
		String r = sp.getString(key, "");
//		Log.e(DEBUG, "readStringPref:" + r);
		return r;
	}

	public static void saveServerUrlPref(Context context, String value) {
		Constants.savePref(context, Constants.SERVER_URL, value);
		Log.e(DEBUG, Constants.SERVER_URL + ":" + Constants.readStringPref(context, Constants.SERVER_URL));
	}

	public static void saveRegIdPref(Context context, String key, String value) {
		Constants.savePref(context, Constants.REG_ID, value);
		Log.e(DEBUG, Constants.REG_ID + ":" + Constants.readStringPref(context, key));
	}

//	public static void saveAccount(AccountModel model, Context context) {
//		Constants.savePref(context, ACT_COMPANY_LOGO_URL, model.getCompanyLogoUrl());
//		Constants.savePref(context, ACT_COMPANY_NAME, model.getCompanyName());
//		Constants.savePref(context, ACT_COMPANY_ID, model.getCompanyId());
//		Constants.savePref(context, ACT_DESCRIPTION, model.getDescription());
//		Constants.savePref(context, ACT_USERNAME, model.getUsername());
//		Log.e(DEBUG,
//				ACT_COMPANY_LOGO_URL + ":"
//						+ Constants.readStringPref(context, ACT_COMPANY_LOGO_URL));
//	}

//	public static boolean checkExistingAccount(Context context) {
//		
//		DAO d = new DAO(context);
//		
//		if(d.getAccountsCount() == 0)
//			return false;
//		else 
//			return true;
//		
//		
//		
//		
//		// deprecated way ... 
////		if (readStringPref(context, ACT_USERNAME).equals(""))
////			return false;
////		else
////			return true;
//	}

//	public static AccountModel retrieveExistingAccount(Context context) {
//
//		if (checkExistingAccount(context)) {
//			String c_logo_url = Constants.readStringPref(context, ACT_COMPANY_LOGO_URL);
//			String c_name = Constants.readStringPref(context, ACT_COMPANY_NAME);
//			String c_id = Constants.readStringPref(context, ACT_COMPANY_ID);
//			String desc = Constants.readStringPref(context, ACT_DESCRIPTION);
//			String un = Constants.readStringPref(context, ACT_USERNAME);
//			AccountModel c = new AccountModel(c_logo_url, c_name, c_id, desc, un);
//			return c;
//		} else
//			return null;
//
//	}
	

}
