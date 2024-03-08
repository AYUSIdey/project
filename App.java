import java.util.Scanner;

import board.Board;
import game.Game;
import player.Player;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("First project -> Tic Tac Toe");

        Board b = new Board(4,'-');
        b.printBoardConfig();
       
        Player p1=new Player();
        p1.getPlayerNameAndSymbol("Ravi", 'X');
        p1.getPlayerNameAndSymbol();

        Player p2=new Player();
        p2.getPlayerNameAndSymbol("Ram", '0');
        p2.getPlayerNameAndSymbol();

        Game game=new Game(new Player(p1,p2),b);
        game play();

    }
}
