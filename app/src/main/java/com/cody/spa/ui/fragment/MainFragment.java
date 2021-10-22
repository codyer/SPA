package com.cody.spa.ui.fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.cody.spa.core.EventDispatcher;
import com.cody.spa.core.SceneManager;
import com.cody.spa.core.scene.Scene;
import com.cody.spa.ui.R;

public class MainFragment extends BaseFragment {

    public MainFragment() {
    }

    public static MainFragment newInstance() {
        MainFragment fragment = new MainFragment();
        fragment.setScene(SceneManager.getInstance().getScene(Scene.MAIN_SCENE));
        return fragment;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_main, container, false);
        view.findViewById(R.id.showRoute).setOnClickListener((v)->showRoute());
        return view;
    }

    public void showRoute() {
        EventDispatcher.getInstance().dispatch(Scene.MAIN_SCENE,1);
    }
}