package com.cody.spa.ui.fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.cody.spa.core.scene.ErrScene;
import com.cody.spa.ui.R;

public class OtherFragment extends BaseFragment {

    public OtherFragment() {
    }

    public static OtherFragment newInstance() {
        OtherFragment fragment = new OtherFragment();
        fragment.setScene(new ErrScene());
        return fragment;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_other, container, false);
    }
}