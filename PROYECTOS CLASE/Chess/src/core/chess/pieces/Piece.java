/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package core.chess.pieces;

import core.chess.Chess;
import core.chess.board.position;
import java.util.ArrayList;

/**
 *
 * @author migue
 */
public abstract class Piece {
    protected boolean color;
    protected Chess chess;
    protected position position;

    public Piece(boolean color) {
        this.color = color;
    }
    
    
    
    public static ArrayList<Piece> generatePieces(){
        ArrayList<Piece> Pieces = new ArrayList<>();
        for (int i = 0; i < 2; i++) {
            Pieces.add(new Rey(false, i == 0));
            Pieces.add(new Reina(i==0));
            for (int j = 0; j < 2; j++) {
                Pieces.add(new Alfil(i ==0));
                Pieces.add(new Caballero(i ==0));
                Pieces.add(new Torre(i ==0));
            }
            for (int j = 0; j < 8; j++) {
                Pieces.add(new Peon(i==0));
            }
        }
        return Pieces;
    }
    
    public abstract boolean move(position position);

    public void setChess(Chess chess) {
        this.chess = chess;
        
    }
    
    
    
    
}
