package org.academiadecodigo;

import Levels.Tile;
import Levels.TileManager;
import org.academiadecodigo.simplegraphics.graphics.Color;
import org.academiadecodigo.simplegraphics.graphics.Text;
import org.academiadecodigo.simplegraphics.keyboard.KeyboardEvent;
import org.academiadecodigo.simplegraphics.pictures.Picture;

import java.awt.event.KeyEvent;

public class CollisionChecker {


    private Tile[] collidableTiles = new Tile[501];


    public boolean checker(Player player, KeyboardEvent keyboardEvent) {

        collidableTiles = TileManager.getCollidableTiles();

        Picture entity = player.getPlayer();

        int entityLeft = 0;
        int entityTop = 0;
        int entityRight = 0;
        int entityBottom = 0;

        if (keyboardEvent.getKey() == keyboardEvent.KEY_LEFT) {
            entityLeft = entity.getX() - 5;
            entityTop = entity.getY();
            entityRight = entity.getMaxX() - 5;
            entityBottom = entity.getMaxY();
        }
        if (keyboardEvent.getKey() == keyboardEvent.KEY_UP) {
            entityLeft = entity.getX();
            entityTop = entity.getY() - 5;
            entityRight = entity.getMaxX();
            entityBottom = entity.getMaxY() - 5;
        }
        if (keyboardEvent.getKey() == keyboardEvent.KEY_RIGHT) {
            entityLeft = entity.getX() + 5;
            entityTop = entity.getY();
            entityRight = entity.getMaxX() + 5;
            entityBottom = entity.getMaxY();
        }
        if (keyboardEvent.getKey() == keyboardEvent.KEY_DOWN) {
            entityLeft = entity.getX();
            entityTop = entity.getY() + 5;
            entityRight = entity.getMaxX();
            entityBottom = entity.getMaxY() + 5;
        }

        for (Tile tile : collidableTiles) {

            int tileLeft = tile.getX();
            int tileTop = tile.getY();
            int tileRight = tile.getMaxX();
            int tileBottom = tile.getMaxY();

            if (
                    entityRight >= tileLeft &&
                            entityLeft <= tileRight &&
                            entityBottom >= tileTop &&
                            entityTop <= tileBottom
            ) {
                if (tile.isBulbasaurCollision() && player.getPokemon() == Pokemon.BULBASAUR) {
                    if (keyboardEvent.getKey() == keyboardEvent.KEY_LEFT) entity.translate(-5, 0);
                    if (keyboardEvent.getKey() == keyboardEvent.KEY_UP) entity.translate(0, -5);
                    if (keyboardEvent.getKey() == keyboardEvent.KEY_RIGHT) entity.translate(5, 0);
                    if (keyboardEvent.getKey() == keyboardEvent.KEY_DOWN) entity.translate(0, 5);
                    return false;
                }
                if (tile.isSquirtleCollision() && player.getPokemon() == Pokemon.SQUIRTLE) {
                    if (keyboardEvent.getKey() == keyboardEvent.KEY_LEFT) entity.translate(-5, 0);
                    if (keyboardEvent.getKey() == keyboardEvent.KEY_UP) entity.translate(0, -5);
                    if (keyboardEvent.getKey() == keyboardEvent.KEY_RIGHT) entity.translate(5, 0);
                    if (keyboardEvent.getKey() == keyboardEvent.KEY_DOWN) entity.translate(0, 5);
                    return false;
                }
                if (tile.isCharmanderCollision() && player.getPokemon() == Pokemon.CHARMANDER) {
                    if (keyboardEvent.getKey() == keyboardEvent.KEY_LEFT) entity.translate(-5, 0);
                    if (keyboardEvent.getKey() == keyboardEvent.KEY_UP) entity.translate(0, -5);
                    if (keyboardEvent.getKey() == keyboardEvent.KEY_RIGHT) entity.translate(5, 0);
                    if (keyboardEvent.getKey() == keyboardEvent.KEY_DOWN) entity.translate(0, 5);
                    return false;
                }
                if (tile.isPikachuCollision() && player.getPokemon() == Pokemon.PIKACHU) {
                    if (keyboardEvent.getKey() == keyboardEvent.KEY_LEFT) entity.translate(-5, 0);
                    if (keyboardEvent.getKey() == keyboardEvent.KEY_UP) entity.translate(0, -5);
                    if (keyboardEvent.getKey() == keyboardEvent.KEY_RIGHT) entity.translate(5, 0);
                    if (keyboardEvent.getKey() == keyboardEvent.KEY_DOWN) entity.translate(0, 5);
                    return false;
                }
                if (tile.isVictoryCollision()) {
                    Text text = new Text(FieldSize.fieldWidth / 2, FieldSize.fieldHeight / 2, "YOU WON!");
                    text.grow(FieldSize.fieldWidth / 4, FieldSize.fieldHeight / 4);
                    text.setColor(Color.YELLOW);
                    text.draw();
                }
                return true;
            }
        }

        if (keyboardEvent.getKey() == keyboardEvent.KEY_LEFT) entity.translate(-5, 0);
        if (keyboardEvent.getKey() == keyboardEvent.KEY_UP) entity.translate(0, -5);
        if (keyboardEvent.getKey() == keyboardEvent.KEY_RIGHT) entity.translate(5, 0);
        if (keyboardEvent.getKey() == keyboardEvent.KEY_DOWN) entity.translate(0, 5);

        return false;
    }


}
