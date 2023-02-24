/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.metodosdebusqueda;

import java.util.Arrays;
import java.util.Random;

public class MetodosDeBusqueda {

    public static void main(String[] args) {
        // Realizar un arreglo con números aleatorios
        int[] numeros = EncontrarNumerosAleatorios(25);
        
        // Se debe de ordener el arreglo para asi utilizar la busqueda binaria
        Arrays.sort(numeros);
        
        //se busca un número aleatorio en el arreglo utilizando los dos metodos
        int numeroEncontrado = numeros[new Random().nextInt(numeros.length)];
        int numBusquedaBinaria = busquedaBinaria(numeros, numeroEncontrado);
        int numBusquedaSecuencial = busquedaSecuencial(numeros, numeroEncontrado);
        
        System.out.println("Lista de numeros: " + Arrays.toString(numeros));
        System.out.println("Numero aleatorio Encontrado: " + numeroEncontrado);
        System.out.println("Resultado de la busqueda binaria: " + numBusquedaBinaria);
        System.out.println("Resultado de la busqueda secuencial: " + numBusquedaSecuencial);
    }
    
    // un arreglo de los numeros aleatorios
    public static int[] EncontrarNumerosAleatorios(int cantidad) {
        int[] numeros = new int[cantidad];
        Random random = new Random();
        for (int i = 0; i < cantidad; i++) {
            numeros[i] = random.nextInt(200);
        }
        return numeros;
    }
    
    // metodo de búsqueda binaria
    public static int busquedaBinaria(int[] arreglo, int valorEncontrado) {
        int inicio = 0;
        int fin = arreglo.length - 1;
        while (inicio <= fin) {
            int mid = (inicio + fin) / 2;
            if (arreglo[mid] == valorEncontrado) {
                return mid;
            } else if (arreglo[mid] < valorEncontrado) {
                inicio = mid + 1;
            } else {
                fin = mid - 1;
            }
        }
        return -1;
    }
    
    //metodo de búsqueda secuencial o lineal
    public static int busquedaSecuencial(int[] arreglo, int valorEncontrado) {
        for (int i = 0; i < arreglo.length; i++) {
            if (arreglo[i] == valorEncontrado) {
                return i;
            }
        }
        return -1;
    }

}

