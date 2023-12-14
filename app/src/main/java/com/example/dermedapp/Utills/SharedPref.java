package com.example.dermedapp.Utills;

import android.content.Context;
import android.content.SharedPreferences;

public class SharedPref {
    Context context;
    private final SharedPreferences sharedPreferences;
    public SharedPref(Context context) {
        sharedPreferences = context.getSharedPreferences(Constants.SHARED_PREF_NAME, Context.MODE_PRIVATE);
        this.context = context;

    }
    public void save(String key, String value) {
        SharedPreferences sh = context.getSharedPreferences("data", Context.MODE_PRIVATE);
        SharedPreferences.Editor editor = sh.edit();
        editor.putString(key, value);
        editor.apply();
    }

    public String get(String key) {
        SharedPreferences sh = context.getSharedPreferences("data", Context.MODE_PRIVATE);
        return sh.getString(key, "");
    }

    public void putBoolean(String key, Boolean value) {
        SharedPreferences.Editor editor = sharedPreferences.edit();
        editor.putBoolean(key, value);
        editor.apply();
    }

    public void saveBoolen(String key, boolean value) {
        SharedPreferences prefs = context.getSharedPreferences("data", Context.MODE_PRIVATE);
        SharedPreferences.Editor editor = prefs.edit();
        editor.putBoolean(key, value);
        editor.apply();
    }
//    public User getProfile() {
//        String data = get("profile");
//        return new Gson().fromJson(data, User.class);
//    }
//
//    public void saveProfile(User user) {
//        save("profile", new Gson().toJson(user));
//    }


    public void saveBoolean(String key, boolean value) {
        SharedPreferences prefs = context.getSharedPreferences("data", Context.MODE_PRIVATE);
        SharedPreferences.Editor editor = prefs.edit();
        editor.putBoolean(key, value);
        editor.apply();
    }
    public boolean getBoolean(String key) {
        SharedPreferences sh = context.getSharedPreferences("data", Context.MODE_PRIVATE);
        return sh.getBoolean(key, false);
    }

    public String putString(String key, String value) {
        SharedPreferences.Editor editor = sharedPreferences.edit();
        editor.putString(key, value);
        editor.apply();
        return key;
    }

    public String getString(String key) {
        return sharedPreferences.getString(key, "");
    }

    public void clearPreference() {
        SharedPreferences.Editor editor = sharedPreferences.edit();
        editor.clear();
        editor.apply();
    }
}
