package com.cody.spa.core;

import android.util.SparseArray;

import com.cody.spa.core.scene.Scene;

import androidx.annotation.NonNull;

public class SceneManager implements ISceneManager {
    private final IScene mErrScene = SceneFactory.getScene(Scene.ERR_SCENE);
    private final SparseArray<IScene> mScenes = new SparseArray<>();
    private ISceneManager mSceneManagerImpl;

    public void init(final ISceneManager sceneManagerImpl) {
        mSceneManagerImpl = sceneManagerImpl;
    }

    public static SceneManager getInstance() {
        return Holder.INSTANCE;
    }

    @NonNull
    public IScene getScene(int sceneId) {
        IScene scene = mScenes.get(sceneId);
        if (scene == null) {
            scene = SceneFactory.getScene(sceneId);
        }
        return scene;
    }

    @Override
    public void addScene(final int sceneId) {
        if (isInit()) {
            mScenes.put(sceneId, SceneFactory.getScene(sceneId));
            mSceneManagerImpl.addScene(sceneId);
        }
    }

    @Override
    public void removeScene(final int sceneId) {
        if (isInit()) {
            mSceneManagerImpl.removeScene(sceneId);
            mScenes.remove(sceneId);
        }
    }

    @Override
    public void hideScene(final int sceneId) {
        if (isInit()) {
            mSceneManagerImpl.hideScene(sceneId);
        }
    }

    @Override
    public void showScene(final int sceneId) {
        if (isInit()) {
            mSceneManagerImpl.showScene(sceneId);
        }
    }

    private boolean isInit() {
        return mSceneManagerImpl != null;
    }

    private static final class Holder {
        private final static SceneManager INSTANCE = new SceneManager();
    }

    private SceneManager() {
    }
}
