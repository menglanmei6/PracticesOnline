package net.lzzy.practicesonline.activities.models;

import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.Color;
import android.view.View;

import net.lzzy.practicesonline.activities.utils.AppUtils;
import net.lzzy.practicesonline.activities.utils.DateTimeUtils;

import java.util.Date;

/**
 * Created by lzzy_gxy on 2019/4/24.
 * Description:
 */
public class UserCookies {
    public static final String KEY_TIME = "keyTime";
    private SharedPreferences spTime;
    private static final UserCookies INSTANCE=new UserCookies();

    private UserCookies(){
        spTime= AppUtils.getContext()
                .getSharedPreferences("refresh_time", Context.MODE_PRIVATE);

    }
    public static UserCookies getInstance(){
        return INSTANCE;

    }
    public String getLastRefreshTime(){
        return spTime.getString(KEY_TIME,"");
    }
    public boolean isPracticeCommitted(){
        return true;
    }
    public void CommitPractice(){

    }

    public void updateLastReferencesTime() {
        String time= DateTimeUtils.DATE_TIME_FORMAT.format(new Date());
        spTime.edit().putString(KEY_TIME,time).apply();
    }
}
