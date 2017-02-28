package com.dairyfarm.fragment;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.dairyfarm.MainActivity;
import com.dairyfarm.R;

/**
 * Created by Swapnil on 27/02/2017.
 */

public class AccountMasterFragment extends Fragment implements View.OnClickListener {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view;
        view = inflater.inflate(R.layout.layout_account_master, container, false);
        getMyActivity().getToolbar().setTitle(R.string.khate_master_title);
        return view;

    }




    public MainActivity getMyActivity() {
        return (MainActivity) getActivity();
    }


    @Override
    public void onClick(View v) {

    }
}
