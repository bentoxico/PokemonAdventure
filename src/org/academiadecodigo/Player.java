package org.academiadecodigo;

import org.academiadecodigo.simplegraphics.pictures.Picture;

public class Player{
    private Picture player;
    private Pokemon pokemon;

    private int currentFrame;
    private int currentSide;


    public Player() {
        this.pokemon = Pokemon.BULBASAUR;
        this.currentFrame = 1;
        this.currentSide = 2;

    }

    public Picture getPlayer() {
        return player;
    }

    public void setPlayer(Picture player) {
        this.player = player;
    }

    public Pokemon getPokemon() {
        return pokemon;
    }

    public void setPokemon(Pokemon pokemon) {
        this.pokemon = pokemon;
    }

    public int getCurrentFrame() {
        return currentFrame;
    }

    public void setCurrentFrame(int currentFrame) {
        this.currentFrame = currentFrame;
    }

    public int getCurrentSide() {
        return currentSide;
    }

    public void setCurrentSide(int currentSide) {
        this.currentSide = currentSide;
    }


}
