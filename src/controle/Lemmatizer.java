/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controle;
import edu.stanford.nlp.ling.CoreAnnotations;
import edu.stanford.nlp.ling.CoreLabel;
import edu.stanford.nlp.pipeline.StanfordCoreNLP;
import edu.stanford.nlp.util.PropertiesUtils;

import java.util.List;
import java.util.Properties;

public class Lemmatizer {
    private StanfordCoreNLP pipeline;

    public Lemmatizer() {
        Properties props = PropertiesUtils.asProperties(
            "annotators", "tokenize,ssplit,pos,lemma",
            "tokenize.language", "en",
            //"pos.model", "edu/stanford/nlp/models/pos-tagger/english-bidirectional/english-bidirectional-distsim.tagger",
            "lemma.model", "edu/stanford/nlp/models/lemma/english-bidirectional-distsim.tagger"
        );
        this.pipeline = new StanfordCoreNLP(props);
    }

    public String lemmatize(String texto) {
        List<CoreLabel> tokens = this.pipeline.process(texto).get(CoreAnnotations.TokensAnnotation.class);
        StringBuilder sb = new StringBuilder();
        for (CoreLabel token : tokens) {
            String lemma = token.get(CoreAnnotations.LemmaAnnotation.class);
            sb.append(lemma).append(" ");
        }
        return sb.toString().trim();
    }
}