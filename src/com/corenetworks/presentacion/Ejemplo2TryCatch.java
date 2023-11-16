package com.corenetworks.presentacion;

import com.corenetworks.modelo.TipoProducto;

import javax.sound.midi.Soundbank;

public class Ejemplo2TryCatch {
    public static void main(String[] args) {

        try {
        TipoProducto leche= TipoProducto.valueOf("PRODUCTO_PRIMERA_NECESIDAD");

        } catch (Exception e1){
            System.out.println(e1.getMessage());
        }finally {
            System.out.println("entra el finally");
        }
    }
}
