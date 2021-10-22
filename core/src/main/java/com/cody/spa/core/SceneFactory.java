package com.cody.spa.core;

import com.cody.spa.core.scene.ErrScene;
import com.cody.spa.core.scene.MainScene;
import com.cody.spa.core.scene.RouteScene;
import com.cody.spa.core.scene.NavScene;
import com.cody.spa.core.scene.Scene;


public class SceneFactory {

    public static IScene getScene(int sceneId) {
        switch (sceneId) {
            case Scene.ERR_SCENE:
                return new ErrScene();
            case Scene.MAIN_SCENE:
                return new MainScene();
            case Scene.ROUTE_SCENE:
                return new RouteScene();
            case Scene.NAV_SCENE:
                return new NavScene();
            default:
                throw new IllegalStateException("Unexpected value: " + sceneId);
        }
    }
}
