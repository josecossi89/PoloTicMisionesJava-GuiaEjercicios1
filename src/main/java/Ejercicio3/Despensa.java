/*
Una pequeña despensa desea calcular los sueldos de sus empleados. Los puestos de los
mismos pueden tener 3 categorías: 1- repositor, 2-cajero y 3-supervisor.
a) Los repositores cobran $15.890 + un bono de 10%.
b) Los cajeros cobran $25.630,89 fijos.
c) Los supervisores cobran $35.560,20 en bruto al cual se les descuenta un 11% de jubilación.
Se necesita una aplicación que, dependiendo el tipo de empleado del que se trate, calcule y
muestre en pantalla el correspondiente sueldo.

 */
package Ejercicio3;

import java.util.Scanner;

public class Despensa {
    public static void main(String[] args) {
        /*
        // Estructura Condicional if-else
        
        int tipoEmpleado = 0;
        
        Scanner scan = new Scanner (System.in);
        
        System.out.println("Seleccione el Tipo de Empleado");
        System.out.println("1. Repositor");
        System.out.println("2. Cajero");
        System.out.println("3. Repositor");
        
        tipoEmpleado = scan.nextInt();
        
        if(tipoEmpleado == 1){
            double sueldoRepositor = 15890 + (15890 * 0.10);
            System.out.println("El sueldo de un repositor es: " + sueldoRepositor);
        }
        else if (tipoEmpleado == 2){
            double sueldoCajero = 25630.89;
            System.out.println("El sueldo de un cajero es: " +sueldoCajero);
        }
        else if(tipoEmpleado == 3){
            double sueldoSupervisor = 35560.20 - (35560.20 * 0.11);
            System.out.println("El sueldo de un supervisor es: " + sueldoSupervisor);
        }
        else{
            System.out.println("Seleccione el tipo de empleado segun el listado");
        }
*/
        
        //Estructura Condicional Switch
        int tipoEmpleado = 0;
        
        Scanner scan = new Scanner (System.in);
        
        System.out.println("Seleccione el Tipo de Empleado");
        System.out.println("1. Repositor");
        System.out.println("2. Cajero");
        System.out.println("3. Repositor");
        
        tipoEmpleado = scan.nextInt();
        
        switch (tipoEmpleado) {
            case 1:
                double sueldoRepositor = 15890 + (15890 * 0.10);
                System.out.println("El sueldo de un repositor es: " + sueldoRepositor);
                break;
            case 2:
                double sueldoCajero = 25630.89;
                System.out.println("El sueldo de un cajero es: " +sueldoCajero);
                break;
            case 3:
                double sueldoSupervisor = 35560.20 - (35560.20 * 0.11);
                System.out.println("El sueldo de un supervisor es: " + sueldoSupervisor);
                break;
            default:
                System.out.println("Seleccione el tipo de empleado segun el listado");
                break;
        }
    }
}
