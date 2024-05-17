package com.example.samplesharedpreference;

import android.content.Context;
import android.content.SharedPreferences;

public class UserSetting {
    private SharedPreferences sharedPrefer;

    public UserSetting(Context context) {
        sharedPrefer = context.getSharedPreferences("app_settings", Context.MODE_PRIVATE);
    }

    public void setSharedPrefUser(String user) {
        SharedPreferences.Editor editor = sharedPrefer.edit();
        editor.putString("key_user", user);
        editor.apply();
    }

    public void setSharedPrefEmail(String email) {
        SharedPreferences.Editor editor = sharedPrefer.edit();
        editor.putString("key_email", email);
        editor.apply();
    }

    public String getSharedPrefUser() {
        return sharedPrefer.getString("key_user", "");
    }

    public String getSharePrefEmail() {
        return sharedPrefer.getString("key_email", "");
    }


}
