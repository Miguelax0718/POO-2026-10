/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package core.person;

import core.chess.Chess;
import core.chess.board.position;
import core.chess.pieces.Piece;

/**
 *
 * @author migue
 */
public class Player {
    private String name;
    private int id;
    private Chess chess;
    
    public boolean movePiece(Piece piece, position position){
        return true;
    }

    public Player(String name, int id) {
        this.name = name;
        this.id = id;
    }

    public void setChess(Chess chess) {
        this.chess = chess;
    }

    public Chess getChess() {
        return chess;
    }
    
    
    
}
