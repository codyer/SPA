package com.cody.spa.ui.fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.cody.spa.core.scene.NavScene;
import com.cody.spa.ui.R;

public class NavFragment extends BaseFragment {

    public NavFragment() {
    }

    public static NavFragment newInstance() {
        NavFragment fragment = new NavFragment();
        fragment.setScene(new NavScene());
        return fragment;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_nav, container, false);
    }
}