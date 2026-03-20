/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package core.chess.board;

import core.chess.Chess;
import java.util.ArrayList;


/**
 *
 * @author migue
 */
public class board {
    private Chess chess;
    private ArrayList<position> positions;

    public board(Chess chess) {
        this.chess = chess;
        this.positions = this.generatePositions();
        this.chess.setBoard(this);
    }
    
    private ArrayList<position> generatePositions(){
        ArrayList<position> positions = new ArrayList<>();
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                positions.add(new position(i +1, ""+(char) (j+97), (i+j)% 2 !=0));
            }
            
        }
        return positions;
    }
}
