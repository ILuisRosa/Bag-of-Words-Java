/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

public class No {
        
    private String palavra;
    private int contador;
    
    public No(String palavra){
        this.palavra = palavra;
        this.contador = 1;
    }

    public String getPalavra() {
        return palavra;
    }

    public void setPalavra(String palavra) {
        this.palavra = palavra;
    }

    public int getContador() {
        return contador;
    }

    public void incrementarContador() {
        this.contador++;
    }
    
}
