package com.liuzheng.admin.presenter;

import com.liuzheng.admin.bean.UserBean;
import com.liuzheng.admin.model.IUserModel;
import com.liuzheng.admin.model.UserModel;
import com.liuzheng.admin.veiw.IUserView;

/**
 * 作者：刘正
 * 时间：2016/12/22 0022
 * 作用：
 */

public class UserPresenter {
    private IUserView mUserView;
    private IUserModel mUserModel;

    public UserPresenter(IUserView view) {
        //初始化接口
        mUserView = view;
        mUserModel = new UserModel();
    }

    public void saveUser(int id, String firstName, String lastName) {
        mUserModel.setID(id);
        mUserModel.setFirstName(firstName);
        mUserModel.setLastName(lastName);
    }

    public void loadUser(int id) {
        UserBean user = mUserModel.load(id);
        mUserView.setFirstName(user.getmFirstName());
        mUserView.setLastName(user.getmLastName());
    }
}
