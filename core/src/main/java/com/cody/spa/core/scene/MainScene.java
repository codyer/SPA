package com.cody.spa.core.scene;

import com.cody.spa.core.SceneManager;

public class MainScene extends BaseScene {

    public void showRoute() {
        SceneManager.getInstance().hideScene(Scene.MAIN_SCENE);
        SceneManager.getInstance().addScene(Scene.ROUTE_SCENE);
        SceneManager.getInstance().showScene(Scene.ROUTE_SCENE);
    }
}
