package com.safetytech.senfuos.fragment;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.safetytech.senfuos.R;

/**
 * Created by ping6 on 2017/4/1.
 */

public class OptionFragment2 extends Fragment {
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View viewReco = inflater.inflate(R.layout.fragment_option2,container,false);
        return viewReco;
    }

    @Override
    public void onViewCreated(View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

    }
}
