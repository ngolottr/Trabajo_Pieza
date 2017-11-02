
package main;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        double porcentaje_gato = 10;
 
        int maximo = 20;
 
        System.out.println("-----------------------------------");
        System.out.println("Bienvenido a creador de planos");
        System.out.println("-----------------------------------");
        System.out.println("Regla: Todo lo que sea coordenada");
        System.out.println("Se debe ingresar separado por una");
        System.out.println("coma. EJ: 1,4");
        System.out.println("-----------------------------------");
 
        Scanner scan = new Scanner(System.in);
        while (true) {
            System.out.print("Ingrese ancho y alto de la pieza: ");
            String nums = (scan.nextLine());
 
            String[] pieza = nums.split(",");
 
            int num1 = Integer.valueOf(pieza[0]);
            int num2 = Integer.valueOf(pieza[1]);
 
            String[][] mPieza = new String[num1 + 1][num2 + 1];
 
            if (num1 > maximo && num2 > maximo) {
                System.out.println("El tamaño maximo de la pieza es  de 20,20");
 
            } else {
 
                for (int i = 0; i < mPieza.length; i++) {
                    for (int j = 0; j < mPieza[i].length; j++) {
 
                        mPieza[i][j] = " -";
                        mPieza[0][0] = "f/c";
 
                        if (i > 10) {
                            mPieza[i][0] = "" + (i - 1);
                        } else {
                            mPieza[i][0] = "0" + (i - 1);
                        }
                        if (j > 10) {
                            mPieza[0][j] = "" + (j - 1);
                        } else {
                            mPieza[0][j] = "0" + (j - 1);
                        }
                    }
                }
                for (int i = 0; i < mPieza.length; i++) {
                    for (int j = 0; j < mPieza[i].length; j++) {
                        System.out.print(" " + mPieza[i][j] + " ");
                    }
                    System.out.println("");
                }
                double cantidad_gatos = (porcentaje_gato / 100) * (num1 * num2);
                int f = (int) cantidad_gatos;
                System.out.println("Sólo puede ingresar [" + f + "] gatos como máximo");
                System.out.print("N° de gatos: ");
                int cant_gatos = Integer.parseInt(scan.nextLine());
                int cont_gatos = 0;
                while (true) {
                    if (cant_gatos > cont_gatos) {
                        cont_gatos++;
 
                        System.out.println("--------------");
                        System.out.println("GATO N° " + cont_gatos);
                        System.out.println("--------------");
                        System.out.print("Ingrese fila y columna: ");
                        String nums2 = (scan.nextLine());
 
                        String[] posicion_gato = nums2.split(",");
                        int num1_1 = Integer.valueOf(posicion_gato[0]);
                        int num2_2 = Integer.valueOf(posicion_gato[1]);
 
                        mPieza[num1_1 + 1][num2_2 + 1] = " G";
 
                        for (int i = 0; i < mPieza.length; i++) {
                            for (int j = 0; j < mPieza[i].length; j++) {
                                System.out.print(" " + mPieza[i][j] + " ");
                            }
                            System.out.println("");
                        }
                    } else {
                        break;
                    }
                }
                double porcentaje_ratones = 25;
                double cantidad_ratones = (porcentaje_ratones / 100) * (num1 * num2);//area dividido 25%
                int d = (int) cantidad_ratones;
                System.out.println("Sólo puede ingresar [" + d + "] ratones como máximo");
                System.out.print("N° de ratones: ");
                int cant_ratones = Integer.parseInt(scan.nextLine());
                int cont_ratones = 0;
 
                while (true) {
                    if (cant_ratones > cont_ratones) {
                        cont_ratones++;
 
                        System.out.println("--------------");
                        System.out.println("Ratón N° " + cont_ratones);
                        System.out.println("--------------");
                        System.out.print("Ingrese fila y columna: ");
                        String nums2 = (scan.nextLine());
 
                        String[] posicion_raton = nums2.split(",");
                        int num1_1_1 = Integer.valueOf(posicion_raton[0]);
                        int num2_2_2 = Integer.valueOf(posicion_raton[1]);
 
                        mPieza[num1_1_1 + 1][num2_2_2 + 1] = " R";
 
                        for (int i = 0; i < mPieza.length; i++) {
                            for (int j = 0; j < mPieza[i].length; j++) {
                                System.out.print(" " + mPieza[i][j] + " ");
                            }
                            System.out.println("");
                        }
                    } else {
                        break;
                    }
                }
 
                System.out.print("N° de Muebles: ");
                int cant_muebles = Integer.parseInt(scan.nextLine());
                int cont_muebles = 0;
 
                while (true) {
                    if (cant_muebles > cont_muebles) {
                        cont_muebles++;
 
                        System.out.println("------------");
                        System.out.println("Mueble N°: " + cont_muebles);
                        System.out.println("------------");
 
                        System.out.print("Ingrese fila y columna separada por un espacio: ");
                        String nums3 = (scan.nextLine());
 
                        String[] posicion_mueble_1 = nums3.split(",");
                        int n_3 = Integer.valueOf(posicion_mueble_1[0]);
                        int n_4 = Integer.valueOf(posicion_mueble_1[1]);
 
                        mPieza[n_3 + 1][n_4 + 1] = " x";
                       
                        for (int i = 0; i < mPieza.length; i++) {
                            for (int j = 0; j < mPieza[i].length; j++) {
                                System.out.print(" " + mPieza[i][j] + " ");
                            }
                            System.out.println("");
                        }
 
                        System.out.println("------------");
                        System.out.println("Mueble N°: " + cont_muebles);
                        System.out.println("------------");
 
                        System.out.print("Ingrese fila y columna separada por un espacio: ");
                        String nums4 = (scan.nextLine());
 
                        String[] posicion_mueble_2 = nums4.split(",");
                        int n_5 = Integer.valueOf(posicion_mueble_2[0]);
                        int n_6 = Integer.valueOf(posicion_mueble_2[1]);
 
                        mPieza[n_5 + 1][n_6 + 1] = " x";
                       
 
                        for (int i = 0; i < mPieza.length; i++) {
                            for (int j = 0; j < mPieza[i].length; j++) {
                                System.out.print(" " + mPieza[i][j] + " ");
                            }
                            System.out.println("");
                        }
                        while (true) {
                            System.out.println("Proceder?");
                            System.out.println("1.- si");
                            System.out.println("2.- no");
                            System.out.print("Respuesta: ");
                            int respuesta = Integer.parseInt(scan.nextLine());
                            if (respuesta == 1) {
                                for (int i = 0; i < mPieza.length; i++) {
                                    for (int j = 0; j < mPieza[i].length; j++) {
 
//                                        mPieza[total1][total2] = " M";
//                                  COmo se llena el mueble
 
                                    }
                                }
                                for (int i = 0; i < mPieza.length; i++) {//for de llenado mueble
                                    for (int j = 0; j < mPieza[i].length; j++) {
                                        System.out.print(" " + mPieza[i][j] + " ");
                                    }
                                    System.out.println("");
                                }
                            }
                            if (respuesta == 2) {
                                break;
                            } else {
 
                            }
                        }
                    } else {
                        break;
 
                    }
                }
 
            }// if de la pieza maxima (20,20)
        } // whileTrue del sw
    }
    
}
