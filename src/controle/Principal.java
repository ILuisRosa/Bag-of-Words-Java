/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package controle;



import Fronteira.FronteiraLeitura;
import Modelo.sacola;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;


public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try {
            sacola sacola = new sacola();
            Lemmatizer lemmatizer = new Lemmatizer();
            
            String texto = FronteiraLeitura.leitor("C:\\Users\\Luis\\OneDrive\\Área de Trabalho\\a.txt");
            texto = Filtro.normalizacao(texto);
            texto = Filtro.removerCaracteresEspeciais(texto);
            texto = Filtro.stopwordsRegex(texto);
            lemmatizer.lemmatize(texto);
            
            
            
            String[] palavras = Filtro.tokenização(texto);
            
            
    
            
            
            for(int i = 0; i < palavras.length; i++) {
                sacola.preencher(palavras[i]);
            }
            sacola.imprimirSacola();
            sacola.salvarSacola();
        } catch (IOException ex) {
          
            Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);
            
        }
           
        
    }
    
}
