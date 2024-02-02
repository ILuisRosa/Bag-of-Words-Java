/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controle;
import java.util.regex.Pattern;


public class Filtro {
        
    public static String[] tokenização(String texto){
        
        return texto.split(" ");
        
    }
    public static String normalizacao(String texto){
      return texto.toLowerCase();
    }
    
    public static String removerCaracteresEspeciais(String texto) {
        String regex = "[^a-z ]";
        
        return texto.replaceAll(regex, "");
    }
    
    public static String stopwordsRegex(String texto){
        String regex = "\\b(a|an|and|are|as|at|be|but|by|for|if|in|into|is|it|no|not|of|on|or|such|that|the|their|then|there|these|they|this|to|was|will|with)\\b";
        String cleanText = Pattern.compile(regex, Pattern.CASE_INSENSITIVE).matcher(texto).replaceAll("");
        
        return cleanText;
    }
    
    
}




