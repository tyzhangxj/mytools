package com.example.mvp.presenter;

import android.content.Context;

import com.example.mvp.bean.UserBean;
import com.example.mvp.model.IUserModel;
import com.example.mvp.model.UserModel;
import com.example.mvp.view.IUserView;

public class UserPresenter {
	private IUserView mUserView;
	private IUserModel mUserModel;

	
	public UserPresenter(IUserView view,Context mc) {
		mUserView = view;
		mUserModel = new UserModel(mc);
	}

	public void saveUser(int id, String firstName, String lastName) {
		mUserModel.setID(id);
		mUserModel.setFirstName(firstName);
		mUserModel.setLastName(lastName);
	}

	public void loadUser(int id) {
		UserBean user = mUserModel.load(id);
		mUserView.setFirstName(user.getFirstName()); // 通过调用IUserView的方法来更新显示
		mUserView.setLastName(user.getLastName());
	}
}