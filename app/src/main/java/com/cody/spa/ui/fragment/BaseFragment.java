package com.cody.spa.ui.fragment;

import android.os.Bundle;

import com.cody.spa.core.IScene;

import androidx.fragment.app.Fragment;

public class BaseFragment extends Fragment {
    private IScene mScene;

    public void setScene(final IScene scene) {
        mScene = scene;
    }

    public BaseFragment() {
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mScene.onSceneCreate();
    }

    @Override
    public void onStart() {
        super.onStart();
        mScene.onSceneStart();
    }

    @Override
    public void onStop() {
        super.onStop();
        mScene.onSceneStop();
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        mScene.onSceneDestroy();
    }

    @Override
    public void onPause() {
        super.onPause();
        mScene.onScenePause();
    }

    @Override
    public void onResume() {
        super.onResume();
        mScene.onSceneResume();
    }
}