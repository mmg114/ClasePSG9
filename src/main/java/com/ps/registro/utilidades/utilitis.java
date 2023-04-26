package com.ps.registro.utilidades;


import lombok.experimental.UtilityClass;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@UtilityClass
public class utilitis {


    public String selectionDay(int day) {
/*
        var result = switch(day) {
            case 1 -> "Lunes";
            case 2 -> "martes";
            case 3 -> "miercoles";
            default -> 0;
        };
  */
        String resultado = null;

        switch (day) {
            case 1:
                resultado = "lunes";
                break;
            case 2:
                resultado = "martes";
                break;
            case 3:
                resultado = "miercoles";
                break;
            case 4:
                resultado = "jueves";
                break;
            case 5:
                resultado = "viernes";
                break;
            case 6:
                resultado = "sabado";
                break;
            case 7:
                resultado = "domingo";
                break;
        }

        return resultado;
    }

    public static void main(String[] args) {
        List<Integer> edades = new ArrayList<>();
        edades.add(32);
        edades.add(45);
        edades.add(65);
        edades.add(18);
        edades.add(22);
        edades.add(44);
        System.out.println(contarEdadTrabajadores(edades));

    }

    public static double contarEdadTrabajadores(List<Integer> edadesDetrabajadores) {
        double resultado = 0;
/*
        for (int edad : edadesDetrabajadores) {
            resultado = resultado + edad;
        }
        resultado = resultado / edadesDetrabajadores.size();
*/

        for (int i = 0; i < edadesDetrabajadores.size(); i++) {
            resultado = resultado + edadesDetrabajadores.get(i);
        }

        return resultado / edadesDetrabajadores.size();
    }


}
