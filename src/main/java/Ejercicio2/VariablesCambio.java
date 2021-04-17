/*
 Realizar un programa que permita el intercambio de valores entre dos variables. Por ejemplo:
Si una variable numero vale 35, y una variable numero2 vale 20, realizar las acciones
necesarias para que numero pase a valer 20 y numero2 pase a valer 35. Una vez realizado el
cambio mostrar el resultado por pantalla.
 */
package Ejercicio2;

/**
 *
 * @author juan
 */
public class VariablesCambio {
    public static void main(String[] args) {
        int variableUno = 20;
        int variablesDos = 35;
        
        System.out.println("Variable  Uno: " + variableUno);
        System.out.println("Variable Dos: "+ variablesDos);
        
        int variableBandera = variableUno; //20
      
        System.out.println("*****Cambio de Valores*****");
        
        variableUno = variablesDos; //35
        System.out.println("Variable Uno: "  + variableUno);
        variablesDos = variableBandera; //20
        System.out.println("Variable Dos: " + variablesDos);
        System.out.println("");
    }
}
