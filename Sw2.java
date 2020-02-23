package sw2;

import java.util.Scanner;

public class Sw2 {

    public static void main(String[] args) {
        int opcion = 0;
        int limite = 0;
        System.out.println("\nBIENVENIDO A LAS SERIES NUMERICAS\n");
        Scanner teclado = new Scanner(System.in);
        do {
            System.out.println("\nMENU\n1 SERIE FIBO\n2 SERIE PAVO\n3 TRIANGULO DE PASCAL\n4 "
                    + "SALIR\n INGRESE UNO DE LOS NUMEROS MOSTRADOS Y PRESIONE ENTER\n");
            //opcion = teclado.nextInt();
            try {
                opcion = teclado.nextInt();
                switch (opcion) {
                    case 1:
                        System.out.println("\nIngrese el numero que sera el limite\n");
                        teclado = new Scanner(System.in);
                        if (teclado.hasNextInt()) {
                            limite = teclado.nextInt();
                            fibo(limite);
                        } else {
                            System.out.println("ERROR");
                            teclado.next();
                        }
                        break;
                    case 2:
                        System.out.println("\nIngrese la cantidad de numeros limite\n");
                        teclado = new Scanner(System.in);
                        if (teclado.hasNextInt()) {
                            limite = teclado.nextInt();
                            pavo(limite);
                        } else {
                            System.out.println("ERROR");
                            teclado.next();
                        }
                        break;
                    case 3:
                        System.out.println("\nIngrese la cantidad de numeros limite\n");
                        teclado = new Scanner(System.in);
                        if (teclado.hasNextInt()) {
                            limite = teclado.nextInt();
                            pasqui(limite);
                        } else {
                            System.out.println("ERROR");
                            teclado.next();
                        }
                        break;
                    case 4:
                        System.out.println("Salir del programa ...");
                        System.exit(0);
                        break;
                    default:
                        System.out.println("\nOpcion ingresada no es valida\n");
                        break;
                }
            } catch (Exception e) {
                System.out.println("No es un caracter valido");
                teclado.next();
                limite = 0;
            }
        } while (opcion != 4);
    }

    private static void fibo(int L) {
        int lim = L;
        if (lim <= 100) {
            long n1 = 0, n2 = 1, n3, i, count = L;
            System.out.print(n1 + " " + n2);
            for (i = 2; i < count; ++i) {
                n3 = n1 + n2;
                System.out.print(" " + n3);
                n1 = n2;
                n2 = n3;
            }
        } else {
            System.out.println("\nERROR: LIMITE SUPERADO, MAYOR A 100\n");
        }

    }

    private static void pavo(int L) {
        int lim = L;
        if (lim <= 50) {
            long firstNumber = 1, secondNumber = 1, thirdNumber = 1;
            long noOfTerms = L, nextNumber;
            System.out.print(firstNumber + " " + secondNumber + " " + thirdNumber);
            for (int i = 1; i <= noOfTerms - 3; i++) {
                nextNumber = secondNumber + firstNumber;
                System.out.print(" " + nextNumber);
                firstNumber = secondNumber;
                secondNumber = thirdNumber;
                thirdNumber = nextNumber;
            }
        }else{
            System.out.println("\nERROR: LIMITE SUPERADO, MAYOR A 100\n");
        }

    }

    private static void pasqui(int L) {
        int rows = L;
        if (rows <= 50) {
            for (int i = 0; i < rows; i++) {
                int number = 1;
                System.out.format("%" + (rows - i) * 2 + "s", "");
                for (int j = 0; j <= i; j++) {
                    System.out.format("%4d", number);
                    number = number * (i - j) / (j + 1);
                }
                System.out.println();
            }
        } else {
            System.out.println("\nERROR: LIMITE SUPERADO, MAYOR A 50\n");
        }

    }
}
