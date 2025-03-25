import interfaces.Time;
import java.util.List;
import interfaces.Subtitle;
public interface SubtitleSeq {
    void addSubtitle();
    List<Subtitle> getSubtitles();
    Subtitle getSubtitle(Time time);
    List<Subtitle> getSubtitles(Time StartTime, Time endTime);
    void remove(String str);
    void replace(String str1, String str2);
    void shift(int offset);
    void cut(Time startTime, Time endTime);
}
