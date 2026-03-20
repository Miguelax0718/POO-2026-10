/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package core.chess;

import core.chess.board.board;
import core.chess.pieces.Piece;
import core.person.Player;
import java.util.ArrayList;

/**
 *
 * @author migue
 */
public class Chess {
    private Player player1;
    private Player player2;
    private ArrayList<Piece> pieces;
    private board board;

    public Chess(Player player1) {
        this.player1 = player1;
        player1.setChess(this);
    }

    public Player getPlayer1() {
        return player1;
    }

    public void setPlayer2(Player player2) {
        this.player2 = player2;
    }

    public void setPieces(ArrayList<Piece> pieces) {
        this.pieces = pieces;
        for (Piece piece : this.pieces) {
            piece.setChess(this);
        }
    }

    public Player getPlayer2() {
        return player2;
    }

    public void setBoard(board board) {
        this.board = board;
    }
    
   
}
