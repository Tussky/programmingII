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
        for(int i = 0; i < sequence.size(); i++){
            Subtitle currentSubtitle = sequence.get(i);

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

        for(int i = 0; i < sequence.size(); i++){
            Subtitle currentSubtitle = sequence.get(i);

            if (startTime.lesserThanOrEq(currentSubtitle.getStartTime())) {
                retList.add(currentSubtitle);
            }
            if (endTime.greaterThanOrEq(currentSubtitle.getEndTime())) {
                retList.add(currentSubtitle);
            }
        }
        return retList;
    }

    List<iSubtitle> getSubtitles(iTime StartTime, iTime endTime){}
    void remove(String str){}
    void replace(String str1, String str2){}
    void shift(int offset){}
    void cut(iTime startTime, iTime endTime){}
}
