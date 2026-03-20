/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package core.chess.board;

import core.chess.pieces.Piece;

/**
 *
 * @author migue
 */
public class position {
    private int row;
    private String column;
    private boolean Color;
    private Piece piece;

    public position(int row, String column, boolean Color) {
        this.row = row;
        this.column = column;
        this.Color = Color;
    }
    
    
  
}
