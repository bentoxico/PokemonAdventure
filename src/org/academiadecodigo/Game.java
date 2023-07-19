package org.academiadecodigo;

import Levels.TileManager;
import org.academiadecodigo.simplegraphics.keyboard.Keyboard;
import org.academiadecodigo.simplegraphics.pictures.Picture;

public class Game implements Runnable{


    private Thread gameThread;
    private final GamePanel gamePanel = new GamePanel();
    private final int FPS_SET = 120;



    public void init() {
        GamePanel gamePanel = new GamePanel();
        startGameLoop();
        TileManager manager = new TileManager();
        Player player = new Player();
        Picture picture = new Picture(1450,74,"/PlayerSprites/bulbasaurSprites/left1.png");
        //Picture picture = new Picture(1482, 714,"/PlayerSprites/bulbasaurSprites/left1.png");
        picture.draw();
        player.setPlayer(picture);


        Keyboard keyboard = new Keyboard(new InputHandler(player));
    }

    public void startGameLoop(){
        gameThread = new Thread(this);
        gameThread.start();
        gamePanel.setPanelSize();

    }

    @Override
    public void run() {

        double timePerFrame = 1000000000.0 / FPS_SET;
        long lastFrame = System.nanoTime();
        long now = System.nanoTime();

        int frames = 0;
        long lastCheck = System.currentTimeMillis();


        while(true){
            now = System.nanoTime();
            if(now - lastFrame >= timePerFrame){

                // gamepPanel.repaint()
                lastFrame = now;
                frames++;
            }

            if(System.currentTimeMillis() - lastCheck >= 1000){
                lastCheck = System.currentTimeMillis();
                //System.out.println("FPS " +  frames);
                frames = 0;

            }
        }
    }

}
