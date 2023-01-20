package com.starfishcollector.ch3;

import com.badlogic.gdx.scenes.scene2d.Stage;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Input.Keys;

public class Turtle extends BaseActor {

    public Turtle(float x, float y, Stage s) {
        super(x, y, s);

        String[] filenames = {"assets/ch3/turtle-1.png", "assets/ch3/turtle-2.png", "assets/ch3/turtle-3.png",
                              "assets/ch3/turtle-4.png", "assets/ch3/turtle-5.png", "assets/ch3/turtle-6.png"};

        loadAnimationFromFiles(filenames , 0.1f, true);

        setBoundaryPolygon(8);

        setAcceleration(400);
        setMaxSpeed(100);
        setDeceleration(400);
    }

    public void act(float dt) {
        super.act(dt);

        if (Gdx.input.isKeyPressed(Keys.LEFT)) {
            accelerateAtAngle(180);
        }
        if (Gdx.input.isKeyPressed(Keys.RIGHT)) {
            accelerateAtAngle(0);
        }
        if (Gdx.input.isKeyPressed(Keys.UP)) {
            accelerateAtAngle(90);
        }
        if (Gdx.input.isKeyPressed(Keys.DOWN)) {
            accelerateAtAngle(270);
        }

        applyPhysics(dt);

        setAnimationPaused(!isMoving());

        if (getSpeed() > 0) {
            setRotation(getMotionAngle());
        }
    }

}
