/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.dicerollinggame;

/**
 *
 * @author DELL
 */
 import java.util.Random;
public class DiceRollingGame {


    public static void main(String[] args) {
        int[][] board = new int[10][10];
        
        Random rand = new Random();
        int xrp=0;
        int xcp=0;
        int iteration = 1;
        while (xrp <= 9 && xcp <= 9) {
            int roll = rand.nextInt(6) + 1; // Random number from 1 to 6
            System.out.println(iteration + " Iteration (Number generated: " + roll + ")");
           if(xrp+roll<=9)
               xrp+=roll;
           else{
           xcp++;
           int e=xrp+roll-9;
           xrp=e;
           }
            for (int i = 0; i < 10; i++) {
                for (int j = 0; j < 10; j++) {
                    if (i == xrp && j == xcp) {
                        System.out.print("x ");
                    } else {
                        System.out.print("0 ");
                    }
                }
                System.out.println();
            }
            
            System.out.println();
            iteration++;
        }
    }
}

