/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Vue.*;
import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author Ludo
 */
public class MainAgenda {

    /**
     * @param args the command line arguments
     * @throws java.io.IOException
     * @throws java.lang.ClassNotFoundException
     */
    public static void main(String[] args)throws IOException, ClassNotFoundException {
           
        Scanner sc = new Scanner(System.in);
        int choix1;
        do {
            AffichageConsole.affichermenu1();
            choix1 = sc.nextInt();
            GestionAgenda.traiterChoixMenu1(choix1);
        } while (choix1 != 3);
    }
}

