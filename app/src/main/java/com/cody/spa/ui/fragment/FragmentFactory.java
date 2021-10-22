package com.cody.spa.ui.fragment;

import com.cody.spa.core.scene.Scene;

import androidx.fragment.app.Fragment;


public class FragmentFactory {

    public static Fragment getFragment(int sceneId) {
        switch (sceneId) {
            case Scene.MAIN_SCENE:
                return MainFragment.newInstance();
            case Scene.ROUTE_SCENE:
                return RouteFragment.newInstance();
            case Scene.NAV_SCENE:
                return NavFragment.newInstance();
            case Scene.ERR_SCENE:
            default:
                return OtherFragment.newInstance();
        }
    }
}
