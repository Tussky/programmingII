package interfaces;
public interface subtitle {
    time getStarTime();
    time getendTime();
    String getText();
    void setStartTime(time startTime);
    void setEndTime(time endTime);
    void setText(String Text);
}
