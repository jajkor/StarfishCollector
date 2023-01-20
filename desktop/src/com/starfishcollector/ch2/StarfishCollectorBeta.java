package com.starfishcollector.ch2;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Texture;

import java.security.SecureRandom;
import java.util.Random;

public class StarfishCollectorBeta extends GameBeta {

    private Turtle turtle;
    private ActorBeta shark;
    private ActorBeta starfish;
    private ActorBeta ocean;
    private ActorBeta winMessage;
    private ActorBeta lossMessage;

    private boolean win;


    public void initialize() {

        Random r = new Random();
        float rX = 0 + r.nextFloat() * (mainStage.getWidth() - r.nextFloat());
        float rY = 0 + r.nextFloat() * (mainStage.getHeight() - r.nextFloat());

        ocean = new ActorBeta();
        ocean.setTexture(new Texture(Gdx.files.internal("assets/ch2/water.jpg")));
        mainStage.addActor(ocean);

        starfish = new ActorBeta();
        starfish.setTexture(new Texture(Gdx.files.internal("assets/ch2/starfish.png")));
        starfish.setPosition(rX, rY);
        mainStage.addActor(starfish);

        turtle = new Turtle();
        turtle.setTexture(new Texture(Gdx.files.internal("assets/ch2/turtle-1.png")));
        turtle.setPosition(160, 20);
        mainStage.addActor(turtle);

        shark = new ActorBeta();
        shark.setTexture(new Texture(Gdx.files.internal("assets/ch2/sharky.png")));
        shark.setPosition(mainStage.getWidth() / 2, mainStage.getHeight() / 2);
        mainStage.addActor(shark);

        winMessage = new ActorBeta();
        winMessage.setTexture(new Texture(Gdx.files.internal("assets/ch2/you-win.png")));
        winMessage.setPosition(mainStage.getWidth() / 2, mainStage.getHeight() / 2);
        winMessage.setVisible(false);
        mainStage.addActor(winMessage);

        lossMessage = new ActorBeta();
        lossMessage.setTexture(new Texture(Gdx.files.internal("assets/ch2/game-over.png")));
        lossMessage.setPosition(mainStage.getWidth() / 2, mainStage.getHeight() / 2);
        lossMessage.setVisible(false);
        mainStage.addActor(lossMessage);

        win = false;

    }

    public void update(float dt) {

        // Check win condition: turtle must be overlapping starfish
        if (turtle.overlaps(starfish)) {

            win = true;
            starfish.remove();
            winMessage.setVisible(true);

        } else if (shark.overlaps(turtle)) {

            win  = false;
            turtle.remove();
            lossMessage.setVisible(true);

        }

    }

}