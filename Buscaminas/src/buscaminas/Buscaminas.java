//Hecho Por Alejandro Martinez

package buscaminas;

import java.util.Random;
import java.util.Scanner;

public class Buscaminas {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        Random rand = new Random();
        int a;

        System.out.println("Digite el tamaño de la matriz (Recordar que va a ser una matriz cuadrada): ");
        a = leer.nextInt(); 

        int[][] Rmatriz = new int[a][a]; 
        boolean[][] discovered = new boolean[a][a]; 
        
        
        for (int i = 0; i < Rmatriz.length; i++) {
            for (int j = 0; j < Rmatriz[i].length; j++) {
                Rmatriz[i][j] = rand.nextInt(2); 
                discovered[i][j] = false; 
            }
        }

        boolean perdio = false;
        while (!perdio) {
            
            System.out.println("Tablero:");
            for (int i = 0; i < a; i++) {
                for (int j = 0; j < a; j++) {
                    if (discovered[i][j]) {
                        System.out.print(Rmatriz[i][j] + " ");
                    } else {
                        System.out.print("- "); 
                    }
                }
                System.out.println();
            }

           
            System.out.println("Ingrese la fila (0-" + (a-1) + ") y la columna (0-" + (a-1) + ") de la celda que desea descubrir:\n Si Sale 0 Sigue jugando Si sale 1 PIERDE");
            
            int row = leer.nextInt();
            int col = leer.nextInt();

            
            if (row < 0 || row >= a || col < 0 || col >= a) {
                System.out.println("Posición inválida. Inténtelo de nuevo.");
                continue;
            }

            
            discovered[row][col] = true;

            
            if (Rmatriz[row][col] == 1) {
                System.out.println(" ¡Perdiste! Una mina en [" + row + "][" + col + "].");
                perdio = true;

                
                for (int i = 0; i < a; i++) {
                    for (int j = 0; j < a; j++) {
                        discovered[i][j] = true;
                    }
                }
            }
        }

        System.out.println("Estado final del tablero:");
        for (int i = 0; i < a; i++) {
            for (int j = 0; j < a; j++) {
                System.out.print(Rmatriz[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("Gracias por jugar.");
    }
}

