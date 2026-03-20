/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package core.chess.pieces;

import core.chess.board.position;

/**
 *
 * @author migue
 */
public class Caballero extends Piece {

    public Caballero(boolean color) {
        super(color);
    }
    
    @Override
    public boolean move(position position){
        return false;
    }
}
