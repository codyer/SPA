package com.cody.spa.ui;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.cody.spa.core.SceneManager;
import com.cody.spa.core.scene.Scene;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        SceneManager.getInstance().init(new SceneManagerAndroidImpl(this));
        SceneManager.getInstance().addScene(Scene.MAIN_SCENE);
    }
}