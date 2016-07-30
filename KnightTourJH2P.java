
package knight.tour.jh2p;

/**
 *
 * @author Brwa Hussen
 * Contact: brawhussen5@gmail.com
 * www.simplegrapher.com
 */
public class KnightTourJH2P {

    public static void main(String[] args) {
            for(char i = 0;i<=7;i++)
                for(char j=0;j<=7;j++){
                 Board Knight=new Board(i,j);
                 for(int count=1;count<=64;count++)
                    Knight.move();
                 System.out.printf("%c%d: %d\n",i+65,j+1,Knight.numberOfMoves);
                }
                
            
    }
    
}
