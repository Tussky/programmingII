package interfaces;
public interface Subtitle {
    Time getStarTime();
    Time getendTime();
    String getText();
    void setStartTime(Time startTime);
    void setEndTime(Time endTime);
    void setText(String Text);
}
