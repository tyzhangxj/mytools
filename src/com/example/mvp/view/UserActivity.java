package com.example.mvp.view;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.EditText;

import com.example.mvp.presenter.UserPresenter;

public class UserActivity extends Activity implements OnClickListener,
		IUserView {

	UserPresenter presenter;
	EditText id, first, last;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_user);

		findViewById(R.id.save).setOnClickListener(this);
		findViewById(R.id.load).setOnClickListener(this);
		id = (EditText) findViewById(R.id.id);
		first = (EditText) findViewById(R.id.first);
		last = (EditText) findViewById(R.id.last);

		presenter = new UserPresenter(this, this);
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