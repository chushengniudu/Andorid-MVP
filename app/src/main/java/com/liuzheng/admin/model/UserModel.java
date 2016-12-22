package com.liuzheng.admin.model;

import android.util.SparseArray;

import com.liuzheng.admin.bean.UserBean;

/**
 * 作者：刘正
 * 时间：2016/12/22 0022
 * 作用：
 */

public class UserModel implements IUserModel {
    private String mFristName;
    private String mLastName;
    private int mID;
    private SparseArray<UserBean> mUsererArray = new SparseArray<UserBean>();

    @Override
    public void setID(int id) {
        mID = id;
    }

    @Override
    public void setFirstName(String firstName) {
        mFristName = firstName;
    }

    @Override
    public void setLastName(String lastName) {
        mLastName = lastName;
        UserBean UserBean = new UserBean(mFristName, mLastName);
        mUsererArray.append(mID, UserBean);
    }

    @Override
    public UserBean load(int id) {
        mID = id;
        UserBean userBean = mUsererArray.get(mID, new UserBean("not found", "not found"));
        return userBean;
    }
}
