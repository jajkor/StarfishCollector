package com.starfishcollector.ch1;

import com.badlogic.gdx.Game;
import com.badlogic.gdx.backends.lwjgl3.Lwjgl3Application;

public class LauncherAlpha {

    public static void main(String[] args) {

        Game myGame = new StarfishCollectorAlpha();
        Lwjgl3Application launcher = new Lwjgl3Application(myGame);

    }

}
