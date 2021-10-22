package com.cody.spa.core;

public interface ISceneManager {
    void addScene(int sceneId);
    void removeScene(int sceneId);
    void hideScene(int sceneId);
    void showScene(int sceneId);
}
