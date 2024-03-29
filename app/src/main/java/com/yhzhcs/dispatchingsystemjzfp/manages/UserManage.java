package com.yhzhcs.dispatchingsystemjzfp.manages;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;

import com.yhzhcs.dispatchingsystemjzfp.bean.UserLoginBean;
import com.yhzhcs.dispatchingsystemjzfp.utils.LogUtil;

/**
 * 保存用户信息的管理类
 * Created by libin
 */

public class UserManage {

    private static UserManage instance;

    private UserManage() {
    }

    public static UserManage getInstance() {
        if (instance == null) {
            instance = new UserManage();
        }
        return instance;
    }


    /**
     * 保存自动登录的用户信息
     */
    public void saveUserInfo(Context context, int userId, String missionId, String username, String password) {
        SharedPreferences sp = context.getSharedPreferences("userInfo", Context.MODE_PRIVATE);//Context.MODE_PRIVATE表示SharePrefences的数据只有自己应用程序能访问。
        SharedPreferences.Editor editor = sp.edit();
        editor.putInt("USER_ID", userId);
        editor.putString("MISSION_ID", missionId);
        editor.putString("USER_NAME", username);
        editor.putString("PASSWORD", password);
        editor.commit();
    }


    /**
     * 获取用户信息model
     *
     * @param context
     * @param
     * @param
     */
    public UserLoginBean getUserInfo(Context context) {
        SharedPreferences sp = context.getSharedPreferences("userInfo", Context.MODE_PRIVATE);
        UserLoginBean userInfo = new UserLoginBean();
        userInfo.setUserId(sp.getInt("USER_ID", 0));
        userInfo.setMissionId(sp.getString("MISSION_ID", ""));
        userInfo.setUserName(sp.getString("USER_NAME", ""));
        userInfo.setPassword(sp.getString("PASSWORD", ""));
        return userInfo;
    }


    /**
     * userInfo中是否有数据
     */
    public boolean hasUserInfo(Context context) {
        UserLoginBean userInfo = getUserInfo(context);
        if (userInfo != null) {
            if ((!TextUtils.isEmpty(userInfo.getUserName())) && (!TextUtils.isEmpty(userInfo.getPassword()))) {//有数据
                return true;
            } else {
                return false;
            }
        }
        return false;
    }

}
