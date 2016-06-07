package com.example.mvp.model;

import android.content.Context;
import android.widget.Toast;

import com.example.mvp.bean.UserBean;

public class UserModel implements IUserModel{

	Context mContext;
	public UserModel(Context mc){
		mContext = mc;
	}

	@Override
	public void setID(int id) { 
		Toast.makeText(mContext, ""+id, Toast.LENGTH_LONG).show();
	}

	@Override
	public void setFirstName(String firstName) { 
		Toast.makeText(mContext, ""+firstName, Toast.LENGTH_LONG).show();
	}

	@Override
	public void setLastName(String lastName) {
		Toast.makeText(mContext, ""+lastName, Toast.LENGTH_LONG).show();
	}

//	@Override
//	public int getID() {  
//		return 5;
//	}

	@Override
	public UserBean load(int id) { 
		UserBean ub = new UserBean("a", "b");		 
		return ub;
	}

}
