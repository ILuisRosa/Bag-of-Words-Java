/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Fronteira;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FronteiraLeitura {
    
    public static String leitor(String path)throws FileNotFoundException, IOException{
        
        BufferedReader br = new BufferedReader(new FileReader(path)); 
        
        String linha; //variavel que armazena a linha do arquivo
        String texto = ""; //variavel que armazena todo o texto
        
        while(true){
            linha = br.readLine(); // lê a linha atual do arquivo
            
            if(linha == null){ //se a linha atual for nula para de ler o arquivo
                break;
            }else{
                if(texto == ""){
                    texto += (" "+linha);
                }else{
                    texto += (" "+linha);
                }
            }
        
        }
        br.close();
       return texto;
    }
}
