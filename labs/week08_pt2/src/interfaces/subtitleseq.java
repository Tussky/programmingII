package interfaces;
import java.util.List;

public interface subtitleseq {
    void addSubtitle();
    List<subtitle> getSubtitles();
    subtitle getSubtitle(time time);
    List<subtitle> getSubtitles(time StartTime, time endTime);
    void remove(String str);
    void replace(String str1, String str2);
    void shift(int offset);
    void cut(time startTime, time endTime);
}
