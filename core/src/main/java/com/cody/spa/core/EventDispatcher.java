package com.cody.spa.core;

public class EventDispatcher {

    public static EventDispatcher getInstance() {
        return EventDispatcher.Holder.INSTANCE;
    }

    public void dispatch(int sceneId, int event) {
        SceneManager.getInstance().getScene(sceneId);
    }

    private static final class Holder {
        private final static EventDispatcher INSTANCE = new EventDispatcher();
    }

    private EventDispatcher() {
    }
}
