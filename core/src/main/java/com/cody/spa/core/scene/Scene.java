package com.cody.spa.core.scene;


import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

import androidx.annotation.IntDef;

@IntDef({
        Scene.ERR_SCENE,
        Scene.MAIN_SCENE,
        Scene.ROUTE_SCENE,
        Scene.NAV_SCENE
})
@Retention(RetentionPolicy.SOURCE)
public @interface Scene {
    int ERR_SCENE = 100;
    int MAIN_SCENE = 101;
    int ROUTE_SCENE = 102;
    int NAV_SCENE = 103;
}
