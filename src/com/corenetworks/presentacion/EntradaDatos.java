package com.corenetworks.presentacion;

import java.util.InputMismatchException;
import java.util.Scanner;

public class EntradaDatos {
    public static void main(String[] args) {
        //Declaración de variables
        int dato;
        Scanner sc = new Scanner(System.in);
        //recibir dato, si es valido no genera Exception, si no es valido entra try,catch
        System.out.println("escriba un dato numerico");
        try {
            dato = sc.nextInt();
        } catch (InputMismatchException i1) {
            System.out.println("el dato que se pidio a de ser numerico");
        }finally {
            System.out.println("entra al finally");
        }
    }
}
