/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

import Fronteira.Escrita;
import java.io.IOException;
import java.util.LinkedList;


public class sacola {
    
    private LinkedList<No> lista;

    public sacola() {
        lista = new LinkedList<No>();
    }
    
    
    public void preencher (String palavra){
        //sempre que possivel use esse metodo pra percorrer lista, ele funcionar como um iterator;
        for(No atual: lista){
            if (atual.getPalavra().equals(palavra)) {
                atual.incrementarContador();
                return;
            }
        }
        this.lista.add(new No(palavra));
        
    }
    public void imprimirSacola(){
        for(No atual:lista){
            System.out.println("Palavra: "+atual.getPalavra()+" - Ocorrencia: "+atual.getContador());
        }
    }
        public void salvarSacola() throws IOException{
            Escrita.escrever(lista, "C:\\Users\\Luis\\OneDrive\\Área de Trabalho\\BoG.txt");
        }
}
