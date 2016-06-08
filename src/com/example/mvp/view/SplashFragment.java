package com.example.mvp.view;

import com.example.mvp.presenter.SplashPresenter;
import com.example.mytools.R;

import android.app.Fragment;
import android.app.ProgressDialog;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

public class SplashFragment extends Fragment implements ISplashView {

	SplashPresenter presenter;
	private ProgressDialog progressBar;

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		View view = inflater.inflate(R.layout.activity_user, container, false);

		presenter = new SplashPresenter(this);
		return view;
	}

	@Override
	public void showProcessBar() {
		if (progressBar == null) {
			progressBar = new ProgressDialog(this.getActivity());
			progressBar.setCancelable(true);
			progressBar.setCanceledOnTouchOutside(true);
			progressBar.setMessage("���������У����Ժ�");
		}
		progressBar.show();
	}

	@Override
	public void hideProcessBar() {
		progressBar.hide();
	}

	@Override
	public void showNetError() {
		Toast.makeText(this.getActivity(), "��������", Toast.LENGTH_SHORT).show();
	}

	@Override
	public void startNextActivity() {
		Toast.makeText(this.getActivity(), "�����¸�activity", Toast.LENGTH_SHORT).show();
	}
}
