/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Fronteira;
import Modelo.No;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.LinkedList;

public class Escrita {
    public static void escrever(LinkedList<No> sacola, String path)throws IOException{
        FileWriter arquivo = new FileWriter(path);
        PrintWriter gravarArquivo = new PrintWriter(arquivo);
            
     for(No atual:sacola){
         gravarArquivo.println("Palavra: "+atual.getPalavra()+" - Ocorrencia: "+atual.getContador());
        }
     arquivo.close();
    }
}
