/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hash2;

import java.util.Arrays;
/**
 *
 * @author SELENE ZAMORA
 */
public class Hash2 {

    /**
     * @param args the command line arguments
     */
    
    String[] arreglo;
    int tamanio, contador;
    public Hash2(int tam){
        tamanio=tam;
        arreglo=new String[tam];
        Arrays.fill(arreglo, "-1");
    }
    public void funcionHash(String[] cadenaArreglo, String[] arreglo){
        int i;
        for(i=0;i<cadenaArreglo.length;i++){
            String elemento = cadenaArreglo[i];
            int indiceArreglo = Integer.parseInt(elemento) % 7; //7 tamaño del arreglo...
            System.out.println("El indice es: "+indiceArreglo+" Para el elemento: "+elemento);
            //***Para Colisiones***
            while(arreglo[indiceArreglo]!="-1"){
                indiceArreglo++;
                System.out.println("Ocurrio una colicion en el indice: "+(indiceArreglo-1)+" Cambiar al indice: "+indiceArreglo);
                indiceArreglo%=tamanio;
            }
            arreglo[indiceArreglo]=elemento;
        }
    }
    
   
    
    public static void main(String[] args) {
        // TODO code application logic here
        Hash2 hash=new Hash2(8);
        String[] elementos={"26","43","56","35","54","14","80","104"};
        hash.funcionHash(elementos, hash.arreglo);
        
    }
    
}