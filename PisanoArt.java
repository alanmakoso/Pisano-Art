//code programmed by Alan Makoso
//inspired from A New Way to Look at Fibonacci Numbers by Jacob Yatsko
    //link: https://youtu.be/o1eLKODSCqw
import java.util.ArrayList;
import java.util.Scanner;
import java.lang.ArithmeticException;
import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Graphics;

public class PisanoArt  extends JPanel{
    private static int mod;
    private static ArrayList<Integer> pisano;

    //returns ArrayList of fibonacci sequence
    public static ArrayList<Integer> fibonacci(int x) {
        int n1 = 0, n2 = 1, n3 = n1 + n2;
        ArrayList<Integer> result = new ArrayList<Integer>();
        result.add(0);

        for (int i=0; i<x; i++) {
            n1 = n2;
            n2 = n3;
            n3 = n1+n2;
            result.add(n1);
        }
        return result;
    }

    public static void main (String args[]) {
        System.out.println("Programmed by Alan Makoso (CC) (BY) alanmakoso@gmail.com\nInspired from A New Way to Look at Fibonacci Numbers by Jacob Yatsko\n\tLink: https://youtu.be/o1eLKODSCqw \n");

        //User input
        Scanner sc = new Scanner(System.in);
        System.out.print("This program will draw a shape based on {Fibconacci sequence} modulus n.\nEnter the divisor, n. --->");
        mod = sc.nextInt();
        sc.close();
        if (mod <= 0) {throw new ArithmeticException("Enter a value greater than 0. Do not enter 0");}


        //Fibconacci and pisano ArrayLists
        ArrayList<Integer> fib = fibonacci(mod * mod);
        ArrayList<Integer> remainders = new ArrayList<Integer>();
        pisano = new ArrayList<Integer>();

        for (int r : fib)
            remainders.add(r%mod);

        //Finds index of cutoff (starts repeating): current remainder is 0 and next remainder is 1
        int cutoff = 0;
        for (int j= 2; j<remainders.size()-1; j++) {
            if (remainders.get(j) == 0 && remainders.get(j+1) == 1) {
                cutoff = j;
                break;
            }
        }

        for (int i=0; i<=cutoff; i++)
            pisano.add(remainders.get(i));

        //Display Array of Fibbonaci, Modulo, and Pianso sequnce
        System.out.println("Fibonacci: " + fib.toString());
        System.out.println("Remainders: " + remainders.toString());
        System.out.println("Pisano cut: " + pisano.toString());


        //Set up JFrame
        JFrame frame = new JFrame("Pisano Period Geometry");
        frame.setSize(480,480);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        PisanoArt panel = new PisanoArt();
        frame.add(panel);
        frame.setVisible(true);

    }

    public void paint(Graphics g) {
        g.drawString("Programmed by Alan Makoso (CC) (BY) alanmakoso@gmail.com\nInspired from A New Way to Look at Fibonacci Numbers by Jacob Yatsko\n\tLink: https://youtu.be/o1eLKODSCqw", 5, getHeight()-20);

        int originX = getWidth()/2, originY = getHeight()/2;
        int radius = getHeight()*3/8;
        int theta = 360/mod;
        g.drawOval(originX-radius,originY-radius,radius*2,radius*2);

        //n rows (n = divisor) and 2 columns for x and y coordinate.
        int[][] points = new int[mod][2];

        /* * Divides circle into n equal arcs and store each split  as a coordinate.
           * x value = radius * sin(theta) since theta=0 is y-axis
           * y value = radius * cos(theta) since theta=0 is x-axis
           * theta = divde 360 degrees into n equal angles.
        */
        for (int i = 0; i<mod; i++) {
                points[i][0] = (int)(originX + radius * Math.sin(Math.toRadians(theta*i))); // x-coord
                points[i][1] = (int)(originY - radius * Math.cos(Math.toRadians(theta*i))); //y-coord
        }

        //draws n points on circle, evenly spaced.
        //-4 becuase oval plotted at top left corner. Adjustment
        for (int i=0; i<mod; i++) {
            System.out.print("x: " + points[i][0] + " y: " + points[i][1]);
            System.out.println();
            g.fillOval(points[i][0]-4, points[i][1]-4, 8, 8);
        }

        //Connecting the dots according to Pisano sequnce
        int currentPt, nextPt;
        for (int i=0; i<pisano.size()-1; i++) {
            currentPt = pisano.get(i); nextPt = pisano.get(i+1);
            g.drawLine(points[currentPt][0],points[currentPt][1],points[nextPt][0],points[nextPt][1]);
        }

    } 
}