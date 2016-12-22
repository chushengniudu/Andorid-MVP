package com.liuzheng.admin.veiw;

/**
 * 作者：刘正
 * 时间：2016/12/22 0022
 * 作用：View可以对ID、FirstName、LastName这三个EditText进行读操作，对FirstName和LastName进行写操作，由此定义IUserView接口
 */

public interface IUserView {
    int getID();

    String getFristName();

    String getLastName();

    void setFirstName(String firstName);

    void setLastName(String lastName);
}
