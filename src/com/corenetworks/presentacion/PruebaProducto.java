package com.corenetworks.presentacion;

import com.corenetworks.modelo.Producto;

public class PruebaProducto {
    public static void main(String[] args) {
        Producto p1= new Producto(0);
        try {
            p1.comprobar();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }
}
