package com.cody.spa.core;

import androidx.lifecycle.LifecycleOwner;

public interface IScene extends LifecycleOwner {

    void onSceneCreate();

    void onSceneResume();

    void onScenePause();

    void onSceneStart();

    void onSceneStop();

    void onSceneDestroy();
}
