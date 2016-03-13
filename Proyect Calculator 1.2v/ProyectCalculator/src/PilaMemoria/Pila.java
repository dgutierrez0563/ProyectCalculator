/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PilaMemoria;
/**
 * @author w.sullivan-DAVID GUTIERREZ SOLANO
 * @version Calculator 1.2v
 * @create 2016-03-02
 */
public class Pila {     
    public int array1[];    
    public int ultimo;  //Ulitmo dato de la pila
    /**
     * Constructor para inicializar los atributos de la pila
     */
    public Pila() {
        this.array1 = new int[2];   //Se declara el tamaño del array
        this.ultimo=-1; //Se inicia el tope en -1
    }
    /**
     * Meodo para ingresar datos en la memoria
     * @param dato recibe el dato de la memoria
     */
    public void push(int dato){
        ultimo++;   //Crece el tope
        array1[ultimo]=dato;    //Recibe el dato en el array1
    }
    /**
     * Metodo para extraer o sacar un dato de la memoria
     * @return  el valor extraido
     */
    public int pop(){
        int auxiliar=array1[ultimo];    //Auxiliar para igualar el valor del array
        ultimo--;   //Decrece el tope de la pila
        return auxiliar;    //Returna el valor extraido
    }
    /**
     * Metodo para saber si la pila esta vacia
     * @return  El valor de ultimo 
     */
    public boolean esVacia(){
        return ultimo==-1;  //Solo retorna si  el ultimo es igual a -1 (VACIA)
    }
    /**
     * Metodo para obtener el ultimo en la Pila
     * @return  El ultimo o el tope
     */
    public int ultimoPila(){
        return array1[ultimo];  //Retorna el tope
    }
}
