package com.example.mvp.view;

import com.example.mvp.presenter.UserPresenter;
import com.example.mytools.R;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.EditText;

public class UserFragment extends Fragment implements OnClickListener,IUserView {

	UserPresenter presenter;
	EditText id, first, last;
	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		View view = inflater.inflate(R.layout.activity_user, container, false);

		view.findViewById(R.id.save).setOnClickListener(this);
		view.findViewById(R.id.load).setOnClickListener(this);
		id = (EditText) view.findViewById(R.id.id);
		first = (EditText) view.findViewById(R.id.first);
		last = (EditText) view.findViewById(R.id.last);
		
		presenter = new UserPresenter(this,this.getActivity());
		return view;
	}
	
	@Override
	public void onClick(View v) {
		switch (v.getId()) {
		case R.id.save:
			presenter.saveUser(getID(), getFristName(), getLastName());
			break;
		case R.id.load:
			presenter.loadUser(getID());
			break;
		default:
			break;
		}
	}

	@Override
	public int getID() {
		return new Integer(id.getText().toString());
	}

	@Override
	public String getFristName() {
		return first.getText().toString();
	}

	@Override
	public String getLastName() {
		return last.getText().toString();
	}

	@Override
	public void setFirstName(String firstName) {
		first.setText(firstName);
	}

	@Override
	public void setLastName(String lastName) {
		last.setText(lastName);
	}

}
