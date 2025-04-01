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

    public void shift(int offset){

    int hours = offset / (1000 * 60 * 60);
    int minutes = (offset % (1000 * 60 * 60)) / (1000 * 60);
    int seconds = (offset % (1000 * 60)) / 1000;
    int millis = offset % 1000;

    for (int i = 0; i < this.sequence.size(); i++) {
        Subtitle currentSubtitle = this.sequence.get(i);

        Time oldStartTime = currentSubtitle.getStartTime();
        Time oldEndTime =currentSubtitle.getEndTime();

        Time newStartTime = new Time(oldStartTime.getMM()+millis,oldStartTime.getSS() + seconds,
                                    oldStartTime.getMM()+minutes, oldStartTime.getHH()+hours);
        Time newEndTime = new Time(oldEndTime.getMM()+millis,oldEndTime.getSS() + seconds,
                                    oldEndTime.getMM()+minutes, oldEndTime.getHH()+hours);

        currentSubtitle.setEndTime(newEndTime);
        currentSubtitle.setStartTime(newStartTime);

        this.sequence.set(i, currentSubtitle);
        }
    }
    void cut(iTime startTime, iTime endTime){}
}
