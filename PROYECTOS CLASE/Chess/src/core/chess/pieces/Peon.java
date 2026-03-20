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
public class Peon extends Piece {

    public Peon(boolean color) {
        super(color);
    }
    
    
    public boolean promote (int type){
        return true;
    }
    @Override
    public boolean move(position position){
        return false;
    }
}
