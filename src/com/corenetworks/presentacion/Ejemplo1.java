package com.corenetworks.presentacion;

public class Ejemplo1 {
    public static void main(String[] args) {
        int[] enteros = new int[5];
        try {
            enteros[3] = 6;

        } catch (ArrayIndexOutOfBoundsException e1) {
        } catch (Exception e1) {
            System.out.println(e1.getMessage());
            System.out.println(e1.toString());
            System.out.println(e1.getCause());
        } finally {
            System.out.println("entró al finally");
        }
    }
}

