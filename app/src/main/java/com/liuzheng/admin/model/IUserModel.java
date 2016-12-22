package com.liuzheng.admin.model;

import com.liuzheng.admin.bean.UserBean;

/**
 * 作者：刘正
 * 时间：2016/12/22 0022
 * 作用：
 */

public interface IUserModel {
    void setID(int id);

    void setFirstName(String firstName);

    void setLastName(String lastName);

    UserBean load(int id);
}
