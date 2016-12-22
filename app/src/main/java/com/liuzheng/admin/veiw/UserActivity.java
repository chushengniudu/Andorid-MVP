package com.liuzheng.admin.veiw;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.liuzheng.admin.presenter.UserPresenter;

public class UserActivity extends AppCompatActivity implements View.OnClickListener, IUserView {

    private EditText mFirstNameEditText, mLastNameEditText, mIdEditText;
    private Button mSaveButton, mLoadButton;
    private UserPresenter mUserPresenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        findWidgets();
        mUserPresenter = new UserPresenter(this);
        mSaveButton.setOnClickListener(this);
        mLoadButton.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.saveButton:
                mUserPresenter.saveUser(getID(), getFristName(), getLastName());
                break;
            case R.id.loadButton:
                mUserPresenter.loadUser(getID());
                break;
            default:
                break;
        }
    }

    @Override
    public int getID() {
        return Integer.parseInt(mIdEditText.getText().toString());
    }

    @Override
    public String getFristName() {
        return mFirstNameEditText.getText().toString();
    }

    @Override
    public String getLastName() {
        return mLastNameEditText.getText().toString();
    }

    @Override
    public void setFirstName(String firstName) {
        mFirstNameEditText.setText(firstName);
    }

    @Override
    public void setLastName(String lastName) {
        mLastNameEditText.setText(lastName);
    }

    void findWidgets() {
        mFirstNameEditText = (EditText) findViewById(R.id.first_name_edt);
        mLastNameEditText = (EditText) findViewById(R.id.last_name_edt);
        mIdEditText = (EditText) findViewById(R.id.id_edt);
        mSaveButton = (Button) findViewById(R.id.saveButton);
        mLoadButton = (Button) findViewById(R.id.loadButton);
    }
}
