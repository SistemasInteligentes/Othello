/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package othello;

/**
 *
 * @author samsung
 */
public class Othello {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ReversiBoard board = new ReversiBoard();
        Move move = new Move();
        int n = 1;
        int win = 0;
        int j=0;
        int drawn = 0;
        for (int i = 0; i < n; i++) {
            board.clear();
            while (board.userCanMove(TKind.N) || board.userCanMove(TKind.B)) {
                j++;
                if (board.findMove(TKind.N, 4, move)) {
                    board.move(move, TKind.N);
                }
                System.out.println("despues de mover negro"+j); 
                board.println();
                if (board.findMove(TKind.B, 4, move)) {
                    board.move(move, TKind.B);
                }
                System.out.println("despues de mover blanco"+j); 
                board.println();
            }
            System.out.print("Iteration#=" + i + " Result:" + board.getCounter(TKind.N) + "-" + board.getCounter(TKind.B));
            if (board.getCounter(TKind.N) > board.getCounter(TKind.B)) {
                win++;
            }
            if (board.getCounter(TKind.N) == board.getCounter(TKind.B)) {
                drawn++;
            }
            System.out.println("  Win#=" + win + "  Drawn#=" + drawn);
        }
        System.out.println("Total#=" + n + "  Win#=" + win + "  Drawn#=" + drawn);

//        ReversiBoard r = new ReversiBoard();
//        Funciones f= new Funciones();
//        f.setBoard(r);
//        r.println();
//        
//        if(r.findMove(TKind.N, 2, new Move(6,5))){
//            r.move(new Move(6,5), TKind.N);
//        }
//        System.out.println("despues de mover");        
//        r.println();
//        
//        f.game();
    }
}
