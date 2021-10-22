package com.cody.spa.ui;


import android.util.SparseArray;

import com.cody.spa.core.ISceneManager;
import com.cody.spa.ui.fragment.FragmentFactory;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

public class SceneManagerAndroidImpl implements ISceneManager {
    private final SparseArray<Fragment> mScenes = new SparseArray<>();
    AppCompatActivity mActivity;

    public SceneManagerAndroidImpl(AppCompatActivity activity) {
        mActivity = activity;
    }

    @Override
    public void addScene(int sceneId) {
        Fragment fragment = mScenes.get(sceneId);
        if (fragment == null){
            fragment = FragmentFactory.getFragment(sceneId);
            mScenes.put(sceneId,fragment);
        }
        mActivity.getSupportFragmentManager()
                .beginTransaction()
                .add(R.id.sceneContainer, fragment);
    }

    @Override
    public void removeScene(int sceneId) {
        Fragment fragment = mScenes.get(sceneId);
        if (fragment != null) {
            mActivity.getSupportFragmentManager()
                    .beginTransaction()
                    .remove(fragment);
        }
    }

    @Override
    public void hideScene(int sceneId) {
        Fragment fragment = mScenes.get(sceneId);
        if (fragment != null) {
            mActivity.getSupportFragmentManager()
                    .beginTransaction()
                    .hide(fragment);
        }
    }

    @Override
    public void showScene(int sceneId) {
        Fragment fragment = mScenes.get(sceneId);
        if (fragment != null) {
            mActivity.getSupportFragmentManager()
                    .beginTransaction()
                    .show(fragment);
        }
    }
}
