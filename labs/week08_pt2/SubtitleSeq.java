import java.util.ArrayList;
import java.util.List;

public class SubtitleSeq implements iSubtitleSeq {
    private List<Subtitle> sequence; 

    void addSubtitle(Subtitle st){
        sequence.add(st);
    }

    public List<Subtitle> getSubtitles(){
        if (sequence.isEmpty()){
            return null;
        } else {
            return sequence;
        }
    }

    public Subtitle getSubtitle(Time time){
        for(int i = 0; i < this.sequence.size(); i++){
            Subtitle currentSubtitle = this.sequence.get(i);

            if (currentSubtitle.getStartTime().equals(time)) {
                return currentSubtitle;
            }
            if (currentSubtitle.getEndTime().equals(time)) {
                return currentSubtitle;
            }
        }
        return null;
    }

    public List<Subtitle> getSubtitles(Time startTime, Time endTime){
        List<Subtitle> retList = new ArrayList<Subtitle>();

        for(int i = 0; i < this.sequence.size(); i++){
            Subtitle currentSubtitle = this.sequence.get(i);

            if (startTime.lesserThanOrEq(currentSubtitle.getStartTime())) {
                retList.add(currentSubtitle);
            }
            if (endTime.greaterThanOrEq(currentSubtitle.getEndTime())) {
                retList.add(currentSubtitle);
            }
        }
        return retList;
    }

    List<Subtitle> getSubtitles(String searchText){
        List<Subtitle> retList = new ArrayList<Subtitle>();

        for(int i = 0; i < this.sequence.size(); i++){
            Subtitle currentSubtitle = this.sequence.get(i);

            if (currentSubtitle.getText().contains(searchText)){
                retList.add(currentSubtitle);
            }
        }

        return retList;
    }

    public void remove(String searchText){
        List<Subtitle> toRemove = this.getSubtitles(searchText);

        for (Subtitle subtitle : toRemove) {
            sequence.remove(subtitle);
        }
    }

    public void replace(String findStr, String replaceStr){

        for (int i = 0; i < sequence.size(); i++){
            if (sequence.get(i).getText().equals(findStr)){
                sequence.get(i).setText(replaceStr);
            }
        }
    }

    void shift(int offset){}
    void cut(iTime startTime, iTime endTime){}
}
