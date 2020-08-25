import java.awt.*;
import java.util.Scanner;

public class ConnectFour {
    public static void main(String[] args) throws InterruptedException {
        Scanner input = new Scanner(System.in);
        double x = 0;
        double y = 0;// variable to keep track of the current turn using 2 values.
        int plays = 0;
        int n;
        int column;
        // SquareGrid.drawBoard(n);//call method
        int[][] board = new int[6][7];
        int turn =1;
         int  mouseclick = 0;

        RectangleGrid.drawBoard(5);
        StdDraw.setPenColor(Color.pink);
        StdDraw.setPenRadius(0.005);

        int[] count = new int[7];


        while(mouseclick < 42){
            if (StdDraw.mousePressed()) {
                x = StdDraw.mouseX();
                y = StdDraw.mouseY();
                System.out.println(x + "," + y);


                column = (int)(x/6);
                System.out.println(column+"<--"+x);
                if(count [column] < 6){
                    if(turn == 1) {
                        StdDraw.setPenColor(Color.blue);
                        turn =2;
                    }
                    else{
                        StdDraw.setPenColor(Color.pink);
                        turn =1;
                    }
                    count[column]++;
                    StdDraw.filledCircle((column+.5)*6, (count [column])*6, 3);

                }
                Thread.sleep(230);
                mouseclick ++;

            }


            // StdDraw.filledCircle(Color.RED);

       /* int i =0;
        while (i <= 6) {
            StdDraw.line(i, 0, i, 6);
            StdDraw.line(0, i, 7, i);
            i++;
        }
*/

        }
    }
}
