package com.starfishcollector.ch3;

import com.badlogic.gdx.Game;
import com.badlogic.gdx.backends.lwjgl3.Lwjgl3Application;

public class Launcher {

    public static void main(String[] args) {
        Game myGame = new StarfishCollector();
        new Lwjgl3Application(myGame);
    }

}
