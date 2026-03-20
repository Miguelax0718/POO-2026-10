/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package core.chess.pieces;

import core.chess.board.position;
import javax.swing.text.Position;

/**
 *
 * @author migue
 */
public class Rey extends Piece{

    private boolean check;
    public Rey(boolean check, boolean color) {
        super(color);
        this.check = check;
    }
    
    
    
    public boolean castling(Torre torre) {
        return true;
    }
    @Override
    public boolean move(position position){
        return false;
    }
}
