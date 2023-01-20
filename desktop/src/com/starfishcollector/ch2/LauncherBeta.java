package com.starfishcollector.ch2;

import com.badlogic.gdx.Game;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.backends.lwjgl3.Lwjgl3Application;
import com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration;

public class LauncherBeta {

    public static void main(String[] args) {
        Lwjgl3ApplicationConfiguration config = new Lwjgl3ApplicationConfiguration();
        config.setTitle("Starfish Collector");
        config.setWindowIcon("assets/ch2/turtle-1.png");
        config.setWindowedMode(800, 600);


        Game myGame = new StarfishCollectorBeta();
        Lwjgl3Application launcher = new Lwjgl3Application(myGame, config);

    }

}
