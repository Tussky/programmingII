package src;
import java.util.List;

import interfaces.subtitle;
import src.Subtitle;
import interfaces.subtitleseq;

public class subtitleSeq implements subtitleseq {
    private List<subtitle> series; 

    public List<subtitle> getSubtitles(){
        List<Subtitle> s= (List<Subtitle>) series;
        return this.series;
    }
}
