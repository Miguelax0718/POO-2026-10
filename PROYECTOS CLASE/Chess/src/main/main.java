/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package main;

import core.chess.Chess;
import core.chess.board.board;
import core.chess.pieces.Piece;
import core.person.Player;
import java.util.ArrayList;

/**
 *
 * @author migue
 */
public class main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Player player1 = new Player("Juan", 1000);
        Chess chess = new Chess(player1);
        System.out.println(player1 + "-> " + player1.getChess());
        System.out.println(chess + "-> " + chess.getPlayer1());
        
        Player player2 = new Player("Pablo", 1001);
        player2.setChess(chess);
        chess.setPlayer2(player2);
        System.out.println(player2 + "-> " + player2.getChess());
        System.out.println(chess + "-> " + chess.getPlayer2());
        board board = new board(chess);
        ArrayList<Piece> pieces = Piece.generatePieces();
        chess.setPieces(pieces);
        
    }
    
}
