/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package laboratorio2;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Laboratorio2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        Scanner entrada = new Scanner(System.in);//importamos el método Scanner p[ara pedir datos
        //Declaración de variables
        double sueldo_mensual = 0;
        int tipo;
        int hijos = 0;
        double descuento = 0;
        double incentivo = 0;
        String nombre;
        int edad = 0;
        double bono;
        double total = 0;
        double totalfinal = 0;
        String cadena1, cadena2;
        boolean bandera = true;
        //Asignación de Nombres a la tabla de registro
        cadena1 = String.format("%s\n%s\t\t%s\t\t\t%s\t\t%s\t\t%s\t%s\n", "Reporte de Rol de Pagos por Empleado",
                "Nombre", "Sueldo mensual", "Incentivo-1", "Hijos", "Descuento SS", "Total a Pagar");
        do {
            System.out.println("Ingrese el sueldo de empleado:\nTipo1 = 340\nTipo2 = 460\nTipo3 = 580\nTipo4 = 600\n");
            tipo = entrada.nextInt();
            entrada.nextLine();//Limpiador de scanner
            System.out.print("Ingrese el nombre del empleado:\n");
            nombre = entrada.nextLine();

            //Uso del Switch para pedida de datos
            switch (tipo) {
                case 1:
                    sueldo_mensual = 340;
                    incentivo = (sueldo_mensual * 0.05);
                    break;
                case 2:
                    sueldo_mensual = 460;
                    incentivo = (sueldo_mensual * 0.10);
                    break;
                case 3:
                    sueldo_mensual = 580;
                    incentivo = (sueldo_mensual * 0.15);
                    break;
                case 4:
                    sueldo_mensual = 600;
                    incentivo = (sueldo_mensual * 0.15);
                    break;
                default:
                    break;
            }

            System.out.print("Ingrese el numero de hijos que tiene el empleado:\n");
            hijos = entrada.nextInt();
            System.out.print("Ingrese la edad del empleado:\n");
            edad = entrada.nextInt();

            bono = hijos * 10;
            //if para calculo de descuento en base a la edad
            if (edad <= 20) {
                descuento = descuento * 0.15;
            } else if (edad >= 20 & edad <= 30) {
                descuento = descuento * 0.20;
            } else if (edad > 31) {
                descuento = descuento * 0.35;

            }
            // Bandera para ver si el usuario quiere seguir registrando datos
            System.out.println("Ingrese 1(salir) o 2(No salir)");
            int aux = entrada.nextInt();
            if (aux == 1) {
                bandera = false;
            }
            // Cálculo de totales
            total = sueldo_mensual + incentivo + bono - descuento;
            //cadena para presentar datos en las variables 
            cadena1 = String.format("%s%s\t\t\t%.1f\t\t\t%.1f\t\t\t\t%d\t\t\t%.1f\t\t%.1f\n",
                    cadena1, nombre, sueldo_mensual, incentivo, hijos, descuento, total);

            
            cadena2 = String.format("%s\n", cadena1);
            totalfinal = sueldo_mensual + totalfinal;

        } while (bandera);
        // Impresión de datos
        System.out.println(cadena2);
        System.out.printf("TOTAL:\t%.2f", totalfinal);
    }
}
